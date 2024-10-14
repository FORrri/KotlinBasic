package com.example.kotlinbasic.day02

//코틀린에서 생성자는 주생성자 or 보조생성자
//-> 주생성자는 클래스 선언부에 들어가는 생성자
//-> 보조생성자는 constructor키워드로 만들어지는 보조 생성자

//class ContructEx01(name : String){ //주생성자 -> 아래랑 똑같음
//    val name : String = name }

//1. 주생성자 -> ()안에 val or var변수를 사용할 수 있음
class ContructEx01(var name : String = "홍길자") {

    init {
        //★처음 객체가 생성될 때 실행
        println("생성자 매개변수는 $name 입니다")
    }

}

fun main() {
    val a = ContructEx01() //기본매개값이 있기 때문에 가능 -> init 실행
    val b = ContructEx01("이순신") //-> init 실행

    println(a.name)
    println(b.name)

}