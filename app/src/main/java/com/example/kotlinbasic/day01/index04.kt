package com.example.kotlinbasic.day01

fun main() {

    //조건문
    var point = 90
    var grade : String

    if(point >= 90) {
        grade = "A"
    } else if(point >= 80) {
        grade = "B"
    } else {
        grade = "C"
    }

    //if구문의 향상된 표현식(express표현식) - 단, else문이 꼭 있어야함
    var result = if(point >= 90) {
        println("점수: $point")
        "A"
    } else if(point >= 80) {
        println("점수: $point")
        "B"
    } else {
        println("점수: $point")
        "C"
    }

    println("$grade $result")

    println("---------------------------------------------------------")

    //자바에서 switch구문 -> 코틀린에서는 when구문으로 바뀜
    var data = "홍길동"
    when(data) {
        "이순신" -> {
            println("이순신 입니다.")
        }
        "홍길동" -> {
            println("홍길동 입니다.")
        }
        "HELLO", "hello" -> {
            println("hello 입니다.")
        }
        else -> { //default대신
            println("아무것도 아닌데요")
        }
    }

    println("---------------------------------------------------------")

    //when절도 향상된 구문 가능
    var age = 10

    var result2 = when(age) {
        10 -> {
            println("10세 입니다.")
        }
        20 -> {
            println("20세 입니다.")
        }
        else -> {
            println("어린이 입니다.")
        }
    }


}