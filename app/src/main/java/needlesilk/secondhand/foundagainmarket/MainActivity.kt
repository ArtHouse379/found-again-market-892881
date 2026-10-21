package needlesilk.secondhand.foundagainmarket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import needlesilk.secondhand.foundagainmarket.ui.composable.approot.AppRoot
import needlesilk.secondhand.foundagainmarket.ui.theme.YZCAOAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            YZCAOAppTheme {
                AppRoot()
            }
        }
    }
}
