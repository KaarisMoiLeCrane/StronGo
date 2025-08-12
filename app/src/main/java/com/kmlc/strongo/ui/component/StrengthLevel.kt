package com.kmlc.strongo.ui.component

import androidx.compose.ui.graphics.Color

// Le reste ne change pas (enum, data class)
enum class StrengthLevel(val label: String, val color: Color, val min: Int, val max: Int) {
    Beginner("Débutant", Color(0xFF2BFF88), 0, 49),
    Novice("Novice", Color(0xFFFF7F00), 50, 99),
    Intermediate("Expérimenté", Color(0xFF00ADEF), 100, 149),
    Pro("Pro", Color(0xFFB48CFF), 150, 199),
    Athlete("Athlète", Color(0xFFFF2B2B), 200, 249),
    Elite("Élite", Color(0xFF444444), 250, 299),
    Olympic("Olympique", Color(0xFFFFD700), 300, Int.MAX_VALUE);

    companion object {
        fun fromScore(score: Int): StrengthLevel {
            return StrengthLevel.entries.find { score in it.min..it.max } ?: Beginner
        }
    }
}