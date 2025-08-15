package com.kmlc.strongo.ui.component.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView

/**
 * A composable function that creates an informational card with a header, optional info button, and content.
 *
 * @param modifier Modifier to be applied to the card.
 * @param cardColor Color of the card background.
 * @param headerContent Composable content for the header of the card.
 * @param showInfoButton Boolean to determine if the info button should be shown.
 * @param infoIcon Optional ImageVector for the info icon.
 * @param infoDescription Description for the info icon, used for accessibility.
 * @param infoColor Color of the info icon.
 * @param onInfoClick Callback function to be invoked when the info button is clicked.
 * @param onClick Callback function to be invoked when the card is clicked.
 * @param content Composable content to be displayed inside the card.
 */
@Composable
fun InformationalCard(
    modifier: Modifier = Modifier,
    cardColor: Color = MaterialTheme.colorScheme.surface,
    headerContent: @Composable RowScope.() -> Unit = {},
    showInfoButton: Boolean = false,
    infoIcon: ImageVector? = null,
    infoDescription: String = stringResource(id = R.string.info),
    infoColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.80f),
    onInfoClick: () -> Unit = {},
    onClick: () -> Unit = {},
    content: @Composable () -> Unit = {}
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .shadow(elevation = 4.dp, shape = RoundedCornerShape(size = 18.dp))
            .background(color = cardColor, shape = RoundedCornerShape(size = 18.dp)),
        shape = RoundedCornerShape(size = 18.dp),
        onClick = onClick
    ) {
        Column(modifier = Modifier.padding(all = 22.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                headerContent()
                
                Spacer(modifier = Modifier.weight(weight = 1f))
                if (showInfoButton && infoIcon != null) {
                    IconButton(
                        modifier = Modifier.size(size = 26.dp),
                        onClick = onInfoClick
                    ) {
                        IconView(
                            modifier = Modifier.size(size = 22.dp),
                            icon = IconClass.Vector(imageVector = Icons.Default.Info),
                            description = infoDescription,
                            tint = infoColor
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(height = 20.dp))
            content()
        }
    }
}
