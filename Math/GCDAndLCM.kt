
//최대공약수와 최소공배수
fun gcd(a : Int, b : Int) : Int = if(b != 0) gcd(b, a % b) else a

fun main(){
    var x = 14
    var y = 21

    println("최대공약수 : ${gcd(x, y)}")
    println("최소공배수 : ${x * y / gcd(x, y)}")
}