package com.example.kotlinbasic.day03.inter

interface InterfaceEx {
    //추상변수, 추상메서드, 일반메서드
    var data : String

    fun some() //abstract를 생략해도 자동으로 추상이 됩니다.
    fun some2() {}
}
interface InterfaceEx02 {}

class Person : InterfaceEx, InterfaceEx02 { //오버라이딩 안하면 err, 인터페이스 상속할때는 ()가 없음
    override var data: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun some() {
        TODO("Not yet implemented")
    }
}

fun main() {

    val p = Person()

    //자식이 부모타입에 저장될 수 있음
    var a : InterfaceEx = p
    //클래스 다운캐스팅(as)
    var b : Person = a as Person


}