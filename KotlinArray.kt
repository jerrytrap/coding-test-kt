
fun main(){
    //배열 선언

    //Array 클래스 생성자 이용 (람다식으로 초기화)
    var arr1 = Array(5, { 0 })
    var arr2 = Array(5) { i -> (i * i) }
    var arr3 = IntArray(5) {i -> i + 1}
    var arr4 = IntArray(5, {i -> i})

    //라이브러리 함수 이용
    var arr5 = arrayOf(1, "text", 3.0) //모든 타입 가능, 빈 배열 생성 시 타입 생략 불가
    var arr6 = arrayOf<Int>() //타입 적으면 빈 배열 생성 가능
    var arr7 = arrayOf<Int>(1, 2, 3, 4)

    var arr8 = intArrayOf() //빈 배열 생성 가능
    var arr9 = intArrayOf(1, 2, 3, 1, 2, 3)


    //배열 원소 접근
    arr5[0] = 100
    arr5.set(1, 200)

    println(arr7[1])
    println(arr7.get(2))

    //기타 메소드
    println(arr5.size) //원소의 개수

    var arr10 = arr6.plus(3) //원소 추가 (추가할 원소를 포함하는 새로운 배열 반환)
    var arr11 = arr9.sliceArray(1..3) //지정된 인덱스 범위에 해당하는 원소만 가지고 새로운 배열 반환

    println(arr9.first()) //제일 앞의 값
    println(arr9.last()) //제일 뒤의 값

    println(arr9.indexOf(3)) //지정된 값의 (가장 앞쪽의) 인덱스
    println(arr9.lastIndexOf(3)) //지정된 값의 (가장 뒤쪽의) 인덱스

    println(arr9.average()) //평균
    println(arr9.count()) //원소의 개수
    println(arr9.contains(4)) //포함되어 있는지 확인

    var arr12 = arr9.sortedArray() //오름차순 정렬된 배열 반환
    var arr13 = arr9.sortedArrayDescending() //내림차순 정렬된 배열 반환
}