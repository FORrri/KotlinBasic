package com.example.kotlinbasic.day03.property

//코틀린에서는 멤버변수를 만들면 getter, setter를 자동으로 생성함
class Person {
    var id : Int = 0
        //getter메서드 오버라이드(return값 반드시 필요)
    get() {
        println("getter메서드 호출")
        return field ?:10
    }

    var name : String? = null
        //setter메서드 오버라이드
//  set(value) = if(name != null) field = "홍길동" else field ="이순신" //한줄로 표현
    set(value) { //여러 줄로 표현
        println("setter메서드 실행됨")
        if(value != null) {
            field = "홍길동"
        } else {
            field = "이순신"
        }
    }

    var addr : String = "서울시"
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    var p = Person()
    println(p.id) //값을 호출하는 getter메서드를 사용하는 문법
    p.name = "홍길동" //값을 변경하는 setter메서드를 사용하는 문법
}