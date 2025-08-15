package com.kmlc.strongo.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.icons.StronGoIcons
import com.kmlc.strongo.ui.component.icons.filled.WorkoutPerson
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
    selectedIndex: Int,
    selectedColor: Color = MaterialTheme.colorScheme.primary,
    unselectedColor: Color = MaterialTheme.colorScheme.onSurface,
    onItemSelected: (Int) -> Unit
) {
    val items = listOf(
        Pair(
            first = stringResource(id = R.string.home),
            second = IconClass.Vector(imageVector = Icons.Default.Home)
        ),
        Pair(
            first = stringResource(R.string.schedule),
            second = IconClass.Vector(imageVector = Icons.Default.DateRange)
        ),
        Pair(
            first = stringResource(R.string.workouts),
            second = IconClass.Vector(imageVector = StronGoIcons.Filled.WorkoutPerson)
        ),
        Pair(
            first = stringResource(R.string.profile),
            second = IconClass.Vector(imageVector = Icons.Default.Person)
        )
    )
    Surface(
        tonalElevation = 8.dp,
        color = Color(color = 0xFF18181C),
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .height(height = 52.dp)
                .fillMaxWidth()
                .background(Color(color = 0xFF18181C)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items.forEachIndexed { index, item ->
                IconButton(onClick = { onItemSelected(index) }) {
                    IconView(
                        modifier = Modifier.size(size = 24.dp),
                        icon = item.second,
                        description = item.first,
                        tint = if (index == selectedIndex) selectedColor else unselectedColor
                    )
                }
            }
        }
    }
}
