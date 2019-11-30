import java.awt.Color

fun main(args: Array<String>) {


    // 1. Create forEachWord function
    "please print each word".forEachWord { word -> println(word) }

    // 2. create toColor function
    val c = (-0x775FB34F).toColor()
    println(c) // Color(a=136, r=160, g=76, b=177)

    // 3. create bitIsOneAtPosition
    print(4.bitIsOneAtPosition(3))

}

private fun Int.bitIsOneAtPosition(i: Int): Boolean {
    val num = this shr i
    return num and 1 == 1
}

class ColorARGB(color: Color) {
    val a = color.alpha
    val r = color.red
    val g = color.green
    val b = color.blue
    override fun toString(): String {
        return "Color(a = $a, r = $r, g = $g, b = $b)"
    }
}


private fun Int.toColor(): ColorARGB {
    return ColorARGB(Color(this, true))
}


private fun String.forEachWord(param: (String) -> Unit) {
    val myList = this.split(" ")
    for (str in myList) {
        param(str)
    }


}








