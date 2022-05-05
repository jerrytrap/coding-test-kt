import kotlin.math.sqrt

//소수 구하기
fun main(){
    val num = 50
    val check = BooleanArray(num+1) { true }

    //0과 1은 소수가 아님
    check[0] = false
    check[1] = false

    //2부터 확인하려는 수의 제곱근까지 차례로 나누어본다.
    for(i in 2..num) {
        for(j in 2..sqrt(i.toDouble()).toInt()) {
            if (i % j == 0 && i != j) {
                check[i] = false
            }
        }
    }

    for(i in 0..num) {
        if(check[i]){
            println(i)
        }
    }
}