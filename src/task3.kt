fun main(args: Array<String>) {
    var arr = IntArray(0)

    var arr1 = mutableListOf<Int>()
    arr1.add(arr1.size, 3)// create new array and add element at the end
    arr1.add(arr1.size, 7)
    arr1.add(arr1.size, 1)
    arr1.add(arr1.size, 9)
    arr1.add(arr1.size, 6)
    arr1.add(arr1.size, 8)
    arr1[2] = 5 // insert 5 into position 2
    arr1[3] = 0 // set to 0 at position 3
    arr1[1] = 0

    for (i in 2..5) { //arr print 2..5 // 5 0 6 8

        println(arr1[i])
    }


    // optional
    println()
    println(arr1.size) // 6
    println(arr1) // 3 0 5 0 6 8
}