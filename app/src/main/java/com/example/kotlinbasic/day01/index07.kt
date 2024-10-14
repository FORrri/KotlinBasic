package com.example.kotlinbasic.day01

fun main() {
    func()
    func2()

}
//기본유형
fun func() { //반환유형이 없음 -> : Unit
    println("func실행됨")
}
//: 반환유형
fun func2() : Int { //반환유형 int
    return 100
}
//매개변수 - 코틀린에서 매개변수는 val 타입이 됩니다.
fun fun3(a : Int, b : String) : Unit {
    //a = 100 //err -> 매개변수 다이렉트 변경 불가능

    //매개변수에 기본값을 줄 수 있음
    //fun fun3(a:Int=100) {
    //
    //}
}
//(omg)메서드의 향상된 표현식 - 실행시킬 코드가 "한 줄 이면" {} 생락하고 = 로 나타낼 수 있음
fun fun4(a:Int) = println("매개변수는 $a 입니다")

    //fun6으로 치환 가능
    //fun fun5(a:Int, b:Int) : Int {
    //    return if(a>b) {
    //        a
    //    } else {
    //        b
    //    }
    fun fun6(a:Int, b:Int) : Int = if (a>b) a else b









