package dragdecor
import androidx.compose.ui.graphics.Color;

class Furniture{
    val type : String = "test"//a changer;
    val x : Int = 8 //a changer;
    val y : Int = 8// a changer;
    val color : Color = Color.Black;
    val file : String = "fichier" //a changer;
}



class Room{
    val wallColor : Color = Color.White
    val lampColor : Color = Color.Yellow
    val curFurnitures : List<Furniture?> = List(9) { null }
    val furnitures : List<Furniture?> = List(10) {/*creer Fichier de Fournitures*/null};

}
fun addFurniture(fur:Furniture){

}

fun suppFurniture(id:Int){

}

fun changeWallColor(color:Color){

}
fun changeLampColor(color:Color){

}
fun changeFurnitureColor(color:Color){

}
fun refresh(){

}


//Test
fun filledRoom() : Room {
    val model = Room();//var
    return model;
}