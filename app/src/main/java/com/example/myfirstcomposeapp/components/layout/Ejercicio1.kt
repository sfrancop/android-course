import android.content.res.Configuration
import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(device = "id:pixel_8", backgroundColor = 0xFFFFFFFF,
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
)
@Composable
fun Ejercicio1(modifier: Modifier = Modifier) {
    Column(modifier.width(300.dp)) {
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Cyan), contentAlignment = Alignment.Center) {
            Text("Ejemplo 1")
        }
        Spacer(Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Text(
                    "Ejemplo 2",
                    modifier = Modifier
                        .weight(1f) // Hace que ocupe el 50% del ancho
                        .fillMaxHeight()
                        .background(Color.Red)
                        .wrapContentSize(), // Centra el contenido
                textAlign = TextAlign.Center, // Centra el texto horizontalmente
                )
                Spacer(Modifier.width(20.dp))
                Text(
                    "Ejemplo 3",
                    modifier = Modifier
                        .weight(1f) // Hace que ocupe el 50% del ancho
                        .fillMaxHeight()
                        .background(Color.Green)
                        .wrapContentSize(), // Centra el contenido
                    textAlign = TextAlign.Center, // Centra el texto horizontalmente
                )
            }
        }
        Spacer(Modifier.height(20.dp))
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Magenta), contentAlignment = Alignment.Center) {
            Text("Ejemplo 4")
        }
    }
}
