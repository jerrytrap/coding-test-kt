//중복순열
var n = 4
var r = 2

val ans = IntArray(n)

fun overlapPermutation(cnt : Int) {
    if(cnt == r) {
        for(i in 0 until r){
            print("${ans[i]} ")
        }
        print("\n")
        return;
    }

    for(i in 1..n) {
        ans[cnt] = i
        overlapPermutation( cnt + 1)
    }
}

fun main(){
    overlapPermutation( 0)
}