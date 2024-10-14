package com.example.kotlinbasic.day01

fun main() {

    //코틀린 자체 문법(null safety)
    //자바 null pointer exception은 런타임 시에 발생됨
    //코틀린에서는 null safety 을 제공 -> 컴파일 시점에 에러를 잡을 수 있도록 도와주는 구문

    //?. -> 타입이 null일 수도 있음(?없으면 에러)
    var a : String? = null
    var name : String? = "hong"

    //?. -> ★null이 아니면 실행해라(많이 사용됨)
    println( name?.uppercase() )

    //?:대체값 -> null인 경우에 대체값으로 바꿔라, 우선순위 지정을 위해 ()도 함께 사용
    var age : Int? = null
    var result = (age ?: 0)

    println(result)

    //!! -> 내가 null값이 아닌 것을 보증
    var k : String? = "null일 수도 있는 값"
    var result2 = k!!.uppercase() //k가 null이 아님을 보증

    //let {} -> null이 아니면 실행해라
    var data : String? = "홍길동"
    data.let {
        println(it) //it으로 data참조
        println(it +"은 null이 아닙니다")
    }
    println()

    //    if(data != null) {
//      이렇게 해도 됨
//    }

    println("---------------------------------------------------------")

    var data2 : String? = null

    data2?.let {
        println(it) //it으로 data참조
        println(it +"은 null이 아닙니다")
    }

    //if ~else랑 비슷
    data2?.let {
        println("null이 아니면 실행해라")
        println(it)
    } ?: run {
        println("null이면 이걸 실행해라")
    }


}