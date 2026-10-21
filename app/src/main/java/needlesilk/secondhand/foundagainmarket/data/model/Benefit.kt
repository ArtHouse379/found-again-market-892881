package needlesilk.secondhand.foundagainmarket.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Recycling
import androidx.compose.material.icons.filled.Security
import androidx.compose.ui.graphics.vector.ImageVector

data class Benefit(
    val icon: ImageVector,
    val text: String,
)

val productBenefits = listOf<Benefit>(
    Benefit(
        icon = Icons.Filled.CheckCircle,
        text = "Quality checked",
    ),
    Benefit(
        icon = Icons.Filled.Security,
        text = "30-day warranty",
    ),
    Benefit(
        icon = Icons.Filled.Recycling,
        text = "Useful, not wasted",
    ),
)
