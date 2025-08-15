package com.kmlc.strongo.ui.content.HomeSection

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.card.HorizontalCard
import com.kmlc.strongo.ui.component.icons.StronGoIcons
import com.kmlc.strongo.ui.component.icons.filled.FitnessCenter
import com.kmlc.strongo.ui.component.utils.polygonShape
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView

@Composable
fun StrengthScoreSection(
    strengthScore: Int? = null,
    onClick: () -> Unit = {},
) {
    val strengthScoreSubTitle = if (strengthScore == null) {
        "You need to complete a few workouts before you can see your score."
    } else {
        "Your Strength Score"
    }

    val strengthScoreTitle = if (strengthScore != null) {
        "$strengthScore"
    } else {
        ""
    }

    Text(
        text = stringResource(R.string.strength_score),
        color = MaterialTheme.colorScheme.onBackground,
        style = MaterialTheme.typography.titleMedium
    )

    HorizontalCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        title = strengthScoreTitle,
        subtitle = strengthScoreSubTitle,
        onClick = onClick
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(MaterialTheme.colorScheme.primary, shape = polygonShape(6))
                .padding(6.dp),
            contentAlignment = Alignment.Companion.Center
        ) {
            IconView(
                icon = IconClass.Vector(StronGoIcons.Filled.FitnessCenter),
                description = "Strength Score",
                tint = MaterialTheme.colorScheme.tertiary,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}