package com.kmlc.strongo.ui.content.HomeSection.TrendsSection

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView

@Composable
fun DateSelection(
    onTrendsPeriodChange: (String) -> Unit = {},
    trendsPeriod: String = stringResource(id = R.string.past_7_days),
    textColor: Color = MaterialTheme.colorScheme.onBackground,
    iconTint: Color = MaterialTheme.colorScheme.onBackground
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable { onTrendsPeriodChange(trendsPeriod) }
    ) {
        Text(
            text = trendsPeriod,
            color = textColor,
            style = MaterialTheme.typography.bodyMedium
        )
        IconView(
            modifier = Modifier.size(size = 24.dp),
            icon = IconClass.Vector(imageVector = Icons.Default.KeyboardArrowDown),
            description = stringResource(id = R.string.change_period),
            tint = iconTint
        )
    }
}