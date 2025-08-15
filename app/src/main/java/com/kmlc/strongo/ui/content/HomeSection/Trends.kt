package com.kmlc.strongo.ui.content.HomeSection

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.card.HorizontalCard
import com.kmlc.strongo.ui.component.icons.StronGoIcons
import com.kmlc.strongo.ui.component.icons.filled.BarChart
import com.kmlc.strongo.ui.component.icons.filled.LineStyle
import com.kmlc.strongo.ui.component.icons.outlined.LocalFireDepartment
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView
import com.kmlc.strongo.ui.content.TrendsData

@Composable
fun TrendsSection(
    trends: TrendsData = TrendsData(),
    onTrendsPeriodChange: (String) -> Unit = {},
    trendsPeriod: String = "Past 7 days"
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Trends",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleMedium
        )
        Row(
            verticalAlignment = Alignment.Companion.CenterVertically,
            modifier = Modifier.clickable { onTrendsPeriodChange("Past 7 days") }
        ) {
            Text(
                text = trendsPeriod,
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.bodyMedium
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = "Change period",
                tint = MaterialTheme.colorScheme.onBackground
            )
        }
    }
    Spacer(Modifier.height(12.dp))
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            HorizontalCard(
                modifier = Modifier.weight(1f),
                subtitle = trends.workouts,
                description = "Workouts"
            ) {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(Color(0xFF6C8FF7), CircleShape),
                    contentAlignment = Alignment.Companion.Center
                ) {
                    IconView(
                        modifier = Modifier.size(20.dp),
                        icon = IconClass.Vector(Icons.Default.Check),
                        description = "Custom",
                        tint = Color.Companion.White
                    )
                }
            }
            HorizontalCard(
                modifier = Modifier.weight(1f),
                subtitle = trends.volume,
                description = "Volume"
            ) {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(Color(0xFF33CFCF), CircleShape),
                    contentAlignment = Alignment.Companion.Center
                ) {
                    IconView(
                        modifier = Modifier.size(20.dp),
                        icon = IconClass.Vector(StronGoIcons.Filled.BarChart),
                        description = "Volume",
                        tint = Color.Companion.White
                    )
                }
            }
        }
        Spacer(Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            HorizontalCard(
                modifier = Modifier.weight(1f),
                subtitle = trends.calories,
                description = "Calories"
            ) {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(Color(0xFFFF8BC1), CircleShape),
                    contentAlignment = Alignment.Companion.Center
                ) {
                    IconView(
                        modifier = Modifier.size(20.dp),
                        icon = IconClass.Vector(StronGoIcons.Outlined.LocalFireDepartment),
                        description = "Calories",
                        tint = Color.Companion.White
                    )
                }
            }
            HorizontalCard(
                modifier = Modifier.weight(1f),
                subtitle = trends.sets,
                description = "Sets"
            ) {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(Color(0xFFB48CFF), CircleShape),
                    contentAlignment = Alignment.Companion.Center
                ) {
                    IconView(
                        modifier = Modifier.size(20.dp),
                        icon = IconClass.Vector(StronGoIcons.Filled.LineStyle),
                        description = "Sets",
                        tint = Color.Companion.White
                    )
                }
            }
        }
    }
}