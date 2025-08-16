package com.kmlc.strongo.ui.content.HomeSection

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.card.HorizontalCard
import com.kmlc.strongo.ui.component.icons.StronGoIcons
import com.kmlc.strongo.ui.component.icons.filled.BarChart
import com.kmlc.strongo.ui.component.icons.filled.LineStyle
import com.kmlc.strongo.ui.component.icons.outlined.LocalFireDepartment
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView
import com.kmlc.strongo.ui.content.HomeSection.TrendsSection.DateSelection
import com.kmlc.strongo.ui.content.TrendsData

@Composable
fun TrendsSection(
    trends: TrendsData = TrendsData(),
    onTrendsPeriodChange: (String) -> Unit = {},
    trendsPeriod: String = stringResource(id = R.string.past_7_days)
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = stringResource(id = R.string.trends),
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleMedium
        )

        DateSelection(
            onTrendsPeriodChange = onTrendsPeriodChange,
            trendsPeriod = trendsPeriod
        )
    }
    Spacer(Modifier.height(height = 12.dp))
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(space = 16.dp)
        ) {
            HorizontalCard(
                modifier = Modifier.weight(weight = 1f),
                subtitle = trends.workouts,
                description = stringResource(id = R.string.workouts)
            ) {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(Color(color = 0xFF6C8FF7), CircleShape),
                    contentAlignment = Alignment.Companion.Center
                ) {
                    IconView(
                        modifier = Modifier.size(size = 20.dp),
                        icon = IconClass.Vector(imageVector = Icons.Default.Check),
                        description = stringResource(id = R.string.custom),
                        tint = Color.Companion.White
                    )
                }
            }
            HorizontalCard(
                modifier = Modifier.weight(weight = 1f),
                subtitle = trends.volume,
                description = stringResource(id = R.string.volume)
            ) {
                Box(
                    modifier = Modifier
                        .size(size = 32.dp)
                        .background(Color(color = 0xFF33CFCF), CircleShape),
                    contentAlignment = Alignment.Companion.Center
                ) {
                    IconView(
                        modifier = Modifier.size(size = 20.dp),
                        icon = IconClass.Vector(imageVector = StronGoIcons.Filled.BarChart),
                        description = stringResource(id = R.string.volume),
                        tint = Color.Companion.White
                    )
                }
            }
        }
        Spacer(Modifier.height(height = 16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(space = 16.dp)
        ) {
            HorizontalCard(
                modifier = Modifier.weight(weight = 1f),
                subtitle = trends.calories,
                description = stringResource(id = R.string.calories)
            ) {
                Box(
                    modifier = Modifier
                        .size(size = 32.dp)
                        .background(Color(color = 0xFFFF8BC1), CircleShape),
                    contentAlignment = Alignment.Companion.Center
                ) {
                    IconView(
                        modifier = Modifier.size(size = 20.dp),
                        icon = IconClass.Vector(imageVector = StronGoIcons.Outlined.LocalFireDepartment),
                        description = stringResource(id = R.string.calories),
                        tint = Color.Companion.White
                    )
                }
            }
            HorizontalCard(
                modifier = Modifier.weight(weight = 1f),
                subtitle = trends.sets,
                description = stringResource(id = R.string.sets)
            ) {
                Box(
                    modifier = Modifier
                        .size(size = 32.dp)
                        .background(Color(color = 0xFFB48CFF), CircleShape),
                    contentAlignment = Alignment.Companion.Center
                ) {
                    IconView(
                        modifier = Modifier.size(size = 20.dp),
                        icon = IconClass.Vector(imageVector = StronGoIcons.Filled.LineStyle),
                        description = stringResource(id = R.string.sets),
                        tint = Color.Companion.White
                    )
                }
            }
        }
    }
}