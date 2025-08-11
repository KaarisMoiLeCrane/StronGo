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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.IconClass
import com.kmlc.strongo.ui.component.IconView
import com.kmlc.strongo.ui.component.HorizontalCard
import com.kmlc.strongo.ui.content.TrendsData

@Composable
fun TrendsSection(
    trends: TrendsData = TrendsData(),
    onTrendsPeriodChange: (String) -> Unit = {},
    trendsPeriod: String = "Past 7 days"
) {
    Row(
        modifier = Modifier.Companion.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Trends",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleMedium
        )
        Row(
            verticalAlignment = Alignment.Companion.CenterVertically,
            modifier = Modifier.Companion.clickable { onTrendsPeriodChange("Past 7 days") }
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
    Spacer(Modifier.Companion.height(12.dp))
    Column(
        modifier = Modifier.Companion.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.Companion.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            HorizontalCard(
                modifier = Modifier.Companion.weight(1f),
                composableElement = {
                    Box(
                        modifier = Modifier.Companion
                            .size(32.dp)
                            .background(Color(0xFF6C8FF7), CircleShape),
                        contentAlignment = Alignment.Companion.Center
                    ) {
                        IconView(
                            modifier = Modifier.Companion.size(20.dp),
                            icon = IconClass.Vector(Icons.Default.Check),
                            description = "Custom",
                            tint = Color.Companion.White
                        )
                    }
                },
                description = "Workouts",
                subtitle = trends.workouts,
                colorScheme = MaterialTheme.colorScheme
            )
            HorizontalCard(
                modifier = Modifier.Companion.weight(1f),
                composableElement = {
                    Box(
                        modifier = Modifier.Companion
                            .size(32.dp)
                            .background(Color(0xFF33CFCF), CircleShape),
                        contentAlignment = Alignment.Companion.Center
                    ) {
                        IconView(
                            modifier = Modifier.Companion.size(20.dp),
                            icon = IconClass.PainterIcon(painterResource(R.drawable.ic_local_fire_department)),
                            description = "Volume",
                            tint = Color.Companion.White
                        )
                    }
                },
                description = "Volume",
                subtitle = trends.volume,
                colorScheme = MaterialTheme.colorScheme
            )
        }
        Spacer(Modifier.Companion.height(16.dp))
        Row(
            modifier = Modifier.Companion.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            HorizontalCard(
                modifier = Modifier.Companion.weight(1f),
                composableElement = {
                    Box(
                        modifier = Modifier.Companion
                            .size(32.dp)
                            .background(Color(0xFFFF8BC1), CircleShape),
                        contentAlignment = Alignment.Companion.Center
                    ) {
                        IconView(
                            modifier = Modifier.Companion.size(20.dp),
                            icon = IconClass.PainterIcon(painterResource(R.drawable.ic_local_fire_department)),
                            description = "Calories",
                            tint = Color.Companion.White
                        )
                    }
                },
                description = "Calories",
                subtitle = trends.calories,
                colorScheme = MaterialTheme.colorScheme
            )
            HorizontalCard(
                modifier = Modifier.Companion.weight(1f),
                composableElement = {
                    Box(
                        modifier = Modifier.Companion
                            .size(32.dp)
                            .background(Color(0xFFB48CFF), CircleShape),
                        contentAlignment = Alignment.Companion.Center
                    ) {
                        IconView(
                            modifier = Modifier.Companion.size(20.dp),
                            icon = IconClass.PainterIcon(painterResource(R.drawable.ic_line_style)),
                            description = "Sets",
                            tint = Color.Companion.White
                        )
                    }
                },
                description = "Sets",
                subtitle = trends.sets,
                colorScheme = MaterialTheme.colorScheme
            )
        }
    }
}