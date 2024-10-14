package com.example.kotlinbasic.day03

//코틀린 클래스는 기본이 final클래스라서 상속을 허용하려면 "open"을 붙임
open class Person(val name: String, val age: Int) {

    //메서드도 final메서드이기 때문에 오버라이딩을 허용하려면 "open"
    open fun info() {
        println("부모님 메서드 info")
    }
}

class Student(name: String, age: Int) : Person(name, age) {

    override fun info() {
        //super.info()
        println("자식의 오버라이드 한 메서드 info")
    }
    //오버로딩
    fun abc() {}
    fun abc(a:Int) {}

}

fun main() {
    val s = Student("홍길동", 20)

    println(s.name)
    println(s.age)
    s.info()
}