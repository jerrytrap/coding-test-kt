
fun main(){
    val s1 = "Hello World"

    println(s1[1]) //인덱스로 접근 가능

    //s1[1] = a //변경 불가

    var s2 = "Hello Kotlin"
    s2 = "abc def ghi"

    println(s2)
    println(s2.substring(0..2)) //문자열 자르기
    println(s2.substring(1, 3))

    println(s1.compareTo(s2))

    val s3 = StringBuilder("Hello")
    s3[1] = 'a'

    println(s3.append("World"))
    println(s3.insert(3, "Add"))
    println(s3.delete(3, 6))

    s2.toLowerCase()
    s2.toUpperCase()

    val s = s1.split(" ") //List<String>으로 할당
    println(s)

    val s4 = "123".toInt()

    val s5 = s2.replace(" ", "+")
    val s6 = s.joinToString("-")
    println(s5)
    println(s6)
}