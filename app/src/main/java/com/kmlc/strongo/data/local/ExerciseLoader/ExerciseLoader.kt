package com.kmlc.strongo.data.local.ExerciseLoader

import com.kmlc.strongo.ui.component.muscle.Exercise
import org.json.JSONArray
import org.json.JSONObject

fun normalizedEnumKey(raw: String): String {
    return raw.trim()
        .lowercase()
        .replace(Regex("[^a-z0-9]+"), "_")
        .replace(Regex("_+"), "_")
        .removeSuffix("_")
        .uppercase()
}

// Pour les clés dynamiques de ta Map (object ExerciseKey)
fun exerciseKeyResFromJson(
    json: JSONObject,
    field: String,
    suffix: String = "",
    preffix: String = ""
): Int? {
    val base = json.optString(field)
    if (base.isBlank()) return null
    val fullKey = buildString {
        if (preffix.isNotBlank()) append("${preffix}_")
        append(base)
        if (suffix.isNotBlank()) append("_$suffix")
    }
    val enumKey = normalizedEnumKey(fullKey)
    return ExerciseKey.getResId(enumKey)
}

// Pour les enums Kotlin classiques qui possèdent un resId
inline fun <reified T : Enum<T>> enumResFromJsonEnum(
    json: JSONObject,
    field: String,
    suffix: String = "",
    preffix: String = ""
): Int? {
    val base = json.optString(field)
    if (base.isBlank()) return null
    val fullKey = buildString {
        if (preffix.isNotBlank()) append("${preffix}_")
        append(base)
        if (suffix.isNotBlank()) append("_$suffix")
    }
    val enumKey = normalizedEnumKey(fullKey)
    return try {
        val enumValue = enumValueOf<T>(enumKey) as Enum<*>
        enumValue.javaClass.getMethod("getResId").invoke(enumValue) as? Int
    } catch (_: Exception) {
        null
    }
}

fun parseExercise(json: JSONObject): Exercise {
    return Exercise(
        // === Toutes les clés ExerciseKey (nom, icon, instructions, etc.) ===
        nameRes = exerciseKeyResFromJson(json, "Exercise"),
        iconRes = exerciseKeyResFromJson(json, "Exercise", suffix = "icon"),
        iconUrl = null,
        instructionRes = exerciseKeyResFromJson(json, "Exercise", suffix = "instruction"),
        tipsRes = exerciseKeyResFromJson(json, "Exercise", suffix = "tips"),
        dangerRes = exerciseKeyResFromJson(json, "Exercise", suffix = "danger"),
        spottingRes = exerciseKeyResFromJson(json, "Exercise", suffix = "spotting"),
        tempoRes = exerciseKeyResFromJson(json, "Exercise", suffix = "tempo"),

        instructionStr = null,
        tipsStr = null,
        dangerStr = null,
        spottingStr = null,
        tempoStr = null,
        tempoPattern = listOf(2, 1, 2, 0),

        equipmentRes = equipmentListFromJson(json),
        equipmentStr = emptyList(),

        videoDemoUrl = json.optString("Short YouTube Demonstration").takeIf { it.isNotBlank() },
        videoExplanationUrl = json.optString("In-Depth YouTube Explanation").takeIf { it.isNotBlank() },

        // === Les enums Kotlin classiques ===
        trainedMuscleGroupRes = enumResListFromJsonEnum<TargetMuscleGroup>(json, "Target Muscle Group "),
        primaryMusclesRes = enumResListFromJsonEnum<Muscle>(json, "Prime Mover Muscle"),
        secondaryMusclesRes = enumResListFromJsonEnum<Muscle>(json, "Secondary Muscle"),
        tertiaryMusclesRes = enumResListFromJsonEnum<Muscle>(json, "Tertiary Muscle"),

        trainedMuscleGroupStr = emptyList(),
        primaryMusclesStr = emptyList(),
        secondaryMusclesStr = emptyList(),
        tertiaryMusclesStr = emptyList(),

        difficultyRes = enumResFromJsonEnum<DifficultyLevel>(json, "Difficulty Level"),
        difficultyStr = null,

        postureRes = enumResFromJsonEnum<Posture>(json, "Posture"),
        gripRes = enumResFromJsonEnum<Grip>(json, "Grip"),

        postureStr = null,
        gripStr = null,

        singleOrDoubleArm = enumResFromJsonEnum<SingleOrDoubleArm>(
            json,
            "Single or Double Arm"
        ) == SingleOrDoubleArm.SINGLE_ARM.resId,
        singleOrDoubleLeg = true,
        alternatingArm = enumResFromJsonEnum<ContinuousOrAlternating>(
            json,
            "Continuous or Alternating Arms "
        ) == ContinuousOrAlternating.ALTERNATING.resId,
        alternatingLeg = enumResFromJsonEnum<ContinuousOrAlternatingLegs>(
            json,
            "Continuous or Alternating Legs "
        ) == ContinuousOrAlternatingLegs.ALTERNATING.resId,

        forceTypeRes = enumResFromJsonEnum<ForceType>(json, "Force Type"),
        forceTypeStr = null,

        mechanicsRes = enumResFromJsonEnum<Mechanics>(json, "Mechanics"),
        mechanicsStr = null,

        lateralityRes = enumResFromJsonEnum<Bilaterality>(json, "Laterality"),
        lateralityStr = null,

        bodyRegionRes = enumResFromJsonEnum<BodyRegion>(json, "Body Region"),
        movementPatternsRes = enumResListFromMultipleFieldsEnum<MovementPattern>(
            json,
            "Movement Pattern #1", "Movement Pattern #2", "Movement Pattern #3"
        ),
        planeOfMotionRes = enumResListFromMultipleFieldsEnum<PlaneOfMotion>(
            json,
            "Plane Of Motion #1", "Plane Of Motion #2", "Plane Of Motion #3"
        ),

        bodyRegionStr = null,
        movementPatternsStr = emptyList(),
        planeOfMotionStr = emptyList(),

        endingPositionRes = enumResFromJsonEnum<LoadPositionEnding>(json, "Load Position (Ending)"),
        endingPositionStr = null,

        footElevationRes = enumResFromJsonEnum<FootElevation>(json, "Foot Elevation"),
        classificationRes = enumResFromJsonEnum<PrimaryExerciseClassification>(json, "Force Type"),
        combinationExercisesRes = enumResFromJsonEnum<CombinationExercises>(json, "Primary Exercise Classification"),
        footElevationStr = null,
        classificationStr = null,
        combinationExercisesStr = null,

        exerciseVariationRes = emptyList(),
        exerciseVariationStr = emptyList()
    )
}

fun equipmentListFromJson(json: JSONObject): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    val primaryResId = enumResFromJsonEnum<Equipment>(json, "Primary Equipment ")
    val primaryCount = json.optInt("# Primary Items", 0)
    if (primaryResId != null && primaryCount > 0) {
        result.add(listOf(primaryResId, primaryCount))
    }

    val secondaryResId = enumResFromJsonEnum<Equipment>(json, "Secondary Equipment")
    val secondaryCount = json.optInt("# Secondary Items", 0)
    if (secondaryResId != null && secondaryCount > 0) {
        result.add(listOf(secondaryResId, secondaryCount))
    }

    return result
}

// Pour les listes de enums classiques
inline fun <reified T : Enum<T>> enumResListFromJsonEnum(json: JSONObject, field: String): List<Int> {
    return json.optString(field)
        .split(",")
        .mapNotNull { raw ->
            val value = raw.trim()
            if (value.isEmpty()) null else enumResFromJsonEnum<T>(JSONObject().put(field, value), field)
        }
}

inline fun <reified T : Enum<T>> enumResListFromMultipleFieldsEnum(json: JSONObject, vararg fields: String): List<Int> {
    return fields.flatMap { field ->
        json.optString(field)
            .split(",")
            .mapNotNull { value ->
                val trimmed = value.trim()
                if (trimmed.isEmpty()) null else enumResFromJsonEnum<T>(JSONObject().put(field, trimmed), field)
            }
    }
}

fun loadExercisesFromJson(jsonString: String): List<Exercise> {
    val jsonArray = JSONArray(jsonString)
    return (0 until jsonArray.length())
        .map { parseExercise(jsonArray.getJSONObject(it)) }
}