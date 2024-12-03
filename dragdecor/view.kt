package dragdecor

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier

@Composable
@Preview
fun PreviewTicTacToe() {
    val model = mutableStateOf(filledRoom())
    DragDecorView(model)
}


@Composable
fun DragDecorView(model : MutableState<Room>){
    Column {
        Column { Text(text="Drag&Decor",
            fontSize = 70.sp) }
        Column {
            Text(text="Room",
                fontSize = 30.sp,)
            repeat(model.value.curFurnitures.size){
                Row {
                    Text(text="Item"
                        /*,Modifier.draggable()*/
                    )
                }
            }
        }
        Column {
            Text(text="Furniture",
                fontSize = 30.sp,)
            repeat(model.value.furnitures.size){
                Row {
                    Text(text="Item")
                }
            }

        }
            Text(text = "")
            Text(text="Wall :")

            Text(text="Lamp :")

            Text(text="Furnitures :")
    }
}