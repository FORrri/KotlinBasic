package com.example.kotlinbasic.day01

fun main() {

    //실행 : ctrl + shift + f10
    //; 안써도됨
    //필요한 실행식 보기 : ctrl + p

    val num = 10 //불변변수
    //num = 20

    var a = 10 //변경이 가능한 변수
    var b = 20

    a = 100

    //변수의 타입(:랑 대문자로 사용)

    var al : Int = 10
    var a2 : String = "홍길동"
    var a3 : Long = 10L
    var a4 : Double = 3.14
    var a5 : Boolean = true
    var a6 : Any = "아무거나 넣을 수 있습니다"

    //al = "홍길동" //err

    var x = "홍길동" //String타입으로 자동추론(그래도 가시성을 위해 변수타입 써주는게 좋음)

    //출력문
    println(a2 + "님의 나이는" + al + "입니다")
    println("$a2 님의 나이는 ${al} 입니다") //{}

}