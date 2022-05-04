//순열
var n = 4
var r = 2

val visited = BooleanArray(n + 1) { false }
val ans = IntArray(n)

fun permutation(cnt : Int){
    if(cnt == r) {
        for(i in 0 until r){
            print("${ans[i]} ")
        }
        print("\n")
        return;
    }

    for(i in 1..n) {
        if(!visited[i]){
            visited[i] = true
            ans[cnt] = i
            permutation(cnt + 1)
            visited[i] = false
        }
    }
}

fun main(){
    permutation(0)
}