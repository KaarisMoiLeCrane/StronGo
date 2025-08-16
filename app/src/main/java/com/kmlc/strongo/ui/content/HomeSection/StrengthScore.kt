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
    textColor: androidx.compose.ui.graphics.Color = MaterialTheme.colorScheme.onBackground,
    cardBackgroundColor: androidx.compose.ui.graphics.Color = MaterialTheme.colorScheme.surface,
    cardTitleColor: androidx.compose.ui.graphics.Color = MaterialTheme.colorScheme.onSurface,
    cardSubtitleColor: androidx.compose.ui.graphics.Color = MaterialTheme.colorScheme.onSurfaceVariant,
    iconBackgroundColor: androidx.compose.ui.graphics.Color = MaterialTheme.colorScheme.primary,
    iconTint: androidx.compose.ui.graphics.Color = MaterialTheme.colorScheme.tertiary
) {
    val strengthScoreSubTitle = if (strengthScore == null) {
        stringResource(id = R.string.you_need_to_complete_a_few_workouts_before_you_can_see_your_score)
    } else {
        stringResource(
            id = R.string.your_strength_score,
            /* ...formatArgs = */ strengthScore
        )
    }

    val strengthScoreTitle = if (strengthScore != null) {
        "$strengthScore"
    } else {
        ""
    }

    Text(
        text = stringResource(id = R.string.strength_score),
        color = textColor,
        style = MaterialTheme.typography.titleMedium
    )

    HorizontalCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        title = strengthScoreTitle,
        subtitle = strengthScoreSubTitle,
        onClick = onClick,
        cardColor = cardBackgroundColor,
        titleColor = cardTitleColor,
        subtitleColor = cardSubtitleColor
    ) {
        Box(
            modifier = Modifier
                .size(size = 40.dp)
                .background(color = iconBackgroundColor, shape = polygonShape(sides = 6))
                .padding(all = 6.dp),
            contentAlignment = Alignment.Center
        ) {
            IconView(
                modifier = Modifier.size(size = 24.dp),
                icon = IconClass.Vector(imageVector = StronGoIcons.Filled.FitnessCenter),
                description = stringResource(id = R.string.strength_score),
                tint = iconTint
            )
        }
    }
}