package com.example.kotlinbasic.day04

import android.view.View
import com.example.kotlinbasic.day01.func2

//최상위 함수 -> 클래스 바깥에 함수나 변수의 정의가 가능함
//fun some(a : Int) {
//    println(a)
//}

//익명함수
//var some = fun(a:Int) {
//    println(a)
//}

//람다식 = 무조건 {매개변수: 타입 -> 실행문} 로 시작함
//var some = {a: Int ->
//    println(a)
//}

//한줄 코드 : 자동으로 리턴하게 됩니다.
//var some = {a: Int -> a * 10}

//여러줄 코드 : 람다식 안에서 마지막에 쓰이는 값을 리턴으로 표현됨
var some = { a:Int ->
    println(a)
    a * 10
}

//타입추론
//변수명: 람다타입 = {람다식} -> 자동으로 타입을 추론해서 err 안남
var some2 : (Int)->Int = {a->a*10}

//★★it키워드 사용 - 람다의 매개변수가 하나일때는 -> 를 지우고 it키워드로 값을 참고할 수 있음
var some3 : (Int)->Int = {it*10}


fun main() {
    println(some(10))
    println(some2(10))
    println(some3(10))

    //람다식은 이런식으로 쓰임
    var func = {v : View ->
        print(v)
    }
    View.OnClickListener(func)

    //위 코드를 줄여서 2nd
    View.OnClickListener({v:View ->
        print(v)
    })

    //★위 코드를 줄여서 3rd - 가장 많이 쓰임
    //마지막 매개변수가 1개이고 람다식이라면, ()를 생략하고 밖으로 뺄 수 있음(문법이니까 외우기)
    View.OnClickListener{
        println(it)
    }
    //매개변수에서 람다식
    example({a:Int -> true})
    example{a:Int->true}
}
//매개변수로 함수를 받을 때는 이렇게 사용
fun example(a:(Int)->Boolean) {
    var boolean = a(10)
}