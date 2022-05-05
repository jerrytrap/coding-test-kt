import kotlin.math.sqrt

//소수 구하기
fun main(){
    val num = 50
    val check = BooleanArray(num+1) { true }

    //0과 1은 소수가 아님
    check[0] = false
    check[1] = false

    //2부터 num의 제곱근 확인
    for(i in 2..sqrt(num.toDouble()).toInt() + 1) {
        if(check[i]){ //i가 소수인 경우
            var j = 2
            while(i * j <= num){
                check[i * j] = false //i의 배수를 모두 false로 바꿈
                j++
            }
        }
    }

    for(i in 0..num) {
        if(check[i]){
            println(i)
        }
    }
}