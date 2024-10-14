package com.example.kotlinbasic.day02

//주생성자, 보조생성자 동시에 사용
class ConstructEx03(val name: String) {

    var age : Int = 1

    //주생성자, 보조생성자를 같이 쓰게되면, 반드시 주생성자를 호출 -> : this(name) 필요
    //-> 많이 쓰이는건 아니지만 문법상 알아두기
    constructor(name: String, age: Int) : this(name){
        this.age = age
    }
}