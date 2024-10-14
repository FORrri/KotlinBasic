package com.example.kotlinbasic.day20 //패키지명을 맞추지 않아도 괜찬

//코틀린에서 파일명과, 클래스명이 반드시 일치해야 하는 것은 아님
class Person { //클래스명도 맞추지 않아도 괜찬

    var name : String = "홍길동"
    var age : Int? = null //코틀린은 반드시 초기값을 지정해야함
    lateinit var addr : String //★초기값 미루기(lateinit) -> 나중에 초기화해야함
    val pay : Int by lazy { //변수를 초기화 하면서 실행시킬 구문이 있다면 by lazy(반드시 val변수만 가능-var불가) -> 많이 쓰이는 건 아님
        println("hello world")
        10//10을 초기화
    }

    fun info() {
        println("$name 입니다")
    }
}

fun main() {
    val p = Person() //코틀린에서는 객체 생성시 new 생략
    println(p.name)
    p.info()

    p.addr = "서울시"
    println(p.addr) //lateinit변수는 반드시 초기화 후에 사용되어야 함. 안그러면 err

    println(p.pay) //10 -> 딱 한번만 구문이 실행됩니다.
    println(p.pay) //10
}