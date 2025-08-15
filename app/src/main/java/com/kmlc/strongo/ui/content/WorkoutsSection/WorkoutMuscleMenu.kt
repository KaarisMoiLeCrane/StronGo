package com.kmlc.strongo.ui.content.WorkoutsSection

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.card.MuscleCard
import com.kmlc.strongo.ui.component.utils.StaticGrid

data class MuscleMenuItem(
    val label: String,
    val icon: IconClass,
    val layer: ImageVector? = null,
    val count: Int,
    val total: Int,
)

@Composable
fun WorkoutMuscleSection(
    navController: NavController,
    muscles: List<MuscleMenuItem>,
    onMuscleClick: (MuscleMenuItem) -> Unit = {}
) {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        placeholder = { Text("Search exercises") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 18.dp),
        singleLine = true
    )
    Text(
        "By muscle",
        style = MaterialTheme.typography.titleLarge,
        color = MaterialTheme.colorScheme.onSurface,
        modifier = Modifier.padding(vertical = 6.dp)
    )

    StaticGrid(
        items = muscles,
        columns = 2,
        horizontalSpacing = 16.dp,
        verticalSpacing = 16.dp
    ) { muscle ->
        MuscleCard(
            image = muscle.icon,
            label = muscle.label,
            count = muscle.count,
            total = muscle.total,
            onClick = { onMuscleClick(muscle) },
            modifier = Modifier.fillMaxWidth(),
            layer = muscle.layer
        )
    }
}

