package com.example.kotlinbasic.day02

class ConstructEx02 {

    var name : String? = null
    var age : Int? = null

    constructor(name: String, age: Int) { //2. 보조생성자
        this.name = name
        this.age = age
    }
    constructor(name: String) : this(name, 1){
        //this(name, 1)가 없습니다 -> 이렇게 쓰지말고 위에 ()안에 넣기
//        this.name = name
//        this.age = 1
    }
}

fun main() {

    val a = ConstructEx02("홍길동")
    println("${a.name}, ${a.age}")
}