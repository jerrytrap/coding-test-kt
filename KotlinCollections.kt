
fun main(){
    //List
    val list1 = List(5, { i -> i})
    val list2 = listOf(1, 2, 3, 4, 5)

    println(list2[3])
    //list2[2] = 4 // 대입 불가능

    val list3 = MutableList<Int>(5, {i -> i})
    val list4 = mutableListOf(1, 2, 3)

    list4[2] = 0
    list4.add(5)

    val list5 = ArrayList<Int>()
    val list6 = arrayListOf(1, 2, 3)

    list5.add(3)

    //Set
    val set1 = setOf(1, 1, 2, 2, 3)
    val set2 = mutableSetOf(3, 2, 3, 1, 2)
    val set3 = hashSetOf(3, 2, 3, 1, 2) //키 값의 해시 코드 순서로 출력

    set2.remove(2)
    set2.add(4)
    println(set2)

    set3.remove(2)
    set3.add(4)
    println(set3)

    //Map
    val map1 = mapOf("One" to 1, "Two" to 2, "Three" to 3)
    val map2 = mapOf(Pair("Four", 4), Pair("Five", 5))
    val map3 = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    val map4 = hashMapOf("One" to 1, "Two" to 2, "Three" to 3) //키 값의 해시 코드 순서로 출력

    map3.put("Six", 6)
    map3.set("Two", 2)
    map3["Seven"] = 7

    println(map3)
}