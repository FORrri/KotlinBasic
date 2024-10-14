package com.example.kotlinbasic.day04

//코틀린에서 내부클래스 (자바문법과 비교해서 보기)
class CompanionObject {

    val name : String = "홍길동"

    //일반 내부클래스
    inner class Inner1 {
        val a : String = "a"
        fun example() : String {
            return name
        }
    }

    //static 내부클래스
    class Inner2 {
        val a : String = "a"
//        fun example() : String {
//            return name //외부클래스에 접근 불가
//        }
    }

    //코틀린에는 static키워드가 없어서 companion object안에서 생성
    //companion -> 스테틱 이라는 뜻
    //object -> 싱글톤 이라는 뜻
    companion object {
        fun method() {
            //static메서드임~~
        }
    }
}

fun main() {
    //inner1객체 생성(일반 내부 클래스) -> new 키워드 빠짐
    val a = CompanionObject().Inner1()
    //inner2객체 생성(static 내부 클래스) -> ()빠짐
    val b = CompanionObject.Inner2()
    //static 메서드
    CompanionObject.method()

}