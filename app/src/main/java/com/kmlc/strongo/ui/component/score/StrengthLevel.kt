package com.kmlc.strongo.ui.component.score

import androidx.compose.ui.graphics.Color
import com.kmlc.strongo.R

/**
 * Enum showing the difficulty/strength levels available.
 */
enum class StrengthLevel(
    val id: Int,
    val color: Color,
    val min: Int,
    val max: Int
) {
    Beginner(R.string.beginner, Color(0xFF2BFF88), 0, 49),
    Novice(R.string.novice, Color(0xFFFF7F00), 50, 99),
    Intermediate(R.string.intermediate, Color(0xFF00ADEF), 100, 149),
    Advanced(R.string.advanced, Color(0xFFB48CFF), 150, 199),
    Expert(R.string.expert, Color(0xFFFF2B2B), 200, 249),
    Master(R.string.master, Color(0xFF444444), 250, 299),
    GrandMaster(R.string.grand_master, Color(0xFFAA00FF), 300, 349),
    Legendary(R.string.legendary, Color(0xFFFFD700), 350, Int.MAX_VALUE);

    companion object {
        fun fromScore(score: Int): StrengthLevel {
            return entries.find { score in it.min..it.max } ?: Beginner
        }

        fun fromLabel(id: Int): StrengthLevel? {
            return entries.find { it.id == id }
        }
    }
}