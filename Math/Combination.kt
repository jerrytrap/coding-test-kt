//조합
var n = 4
var r = 2

val visited = BooleanArray(n + 1) { false }
val ans = IntArray(n)

fun combination(num : Int, cnt : Int) {
    if(cnt == r) {
        for(i in 0 until r){
            print("${ans[i]} ")
        }
        print("\n")
        return;
    }

    for(i in num..n) {
        if(!visited[i]){
            visited[i] = true
            ans[cnt] = i
            combination(i + 1, cnt + 1)
            visited[i] = false
        }
    }
}

fun main(){
    combination(1, 0)
}