import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun SelfCareBingoScreen(name : String, counted : List<Int>) {

    Column {
        LazyVerticalGrid(columns = GridCells.Fixed(5)) {
            items(name.toList()) { letter ->
                Text(text = letter.toString())
            }
            items(counted) {
                CellItem(title = it)
            }
        }
    }
}

@Composable
fun CellItem(title: Int) {
    Text(title.toString())
}
