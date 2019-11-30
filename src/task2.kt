import javax.swing.text.html.HTML

class Node(val name: String) {
    val node = mutableListOf<Node>()
}

//// create root and node
fun main(args: Array<String>) {
    root {
        node("1") {
            node("3") {
                node("5")
            }
            node("4")
        }
        node("2")
    }
}

fun root(init: HTML.() -> Unit): HTML {
    val root = HTML()
    root.init()
    return root
}

fun node(n: String, f: () -> Node) {

}

fun node(s: String): Node {
    return Node(s)
}


