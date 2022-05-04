//중복조합
var n = 4
var r = 2

val ans = IntArray(n)

fun overlapCombination(num : Int, cnt : Int) {
    if(cnt == r) {
        for(i in 0 until r){
            print("${ans[i]} ")
        }
        print("\n")
        return;
    }

    for(i in num..n) {
        ans[cnt] = i
        overlapCombination( i, cnt + 1)
    }
}

fun main(){
    overlapCombination(1, 0)
}