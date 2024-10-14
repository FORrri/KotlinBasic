package com.example.kotlinbasic.day03

//추상클래스
//추상변수, 추상메서드를 사용할 때 abstract키워드를 씁니다.
//추상클래스는 자식에서 오버라이딩을 강제화 시킬 때 사용
abstract class AbstractEx {

    abstract var a : String //추상변수
    abstract fun some() //추상메서드

    //var b : String //일반변수는 불가능
    fun some2() { //일반메서드도 가능
    }
}

class Child : AbstractEx() { //오버라이딩 안하면 err
    override var a: String = "홍길동"

    override fun some() {
        TODO("Not yet implemented")
    }

}