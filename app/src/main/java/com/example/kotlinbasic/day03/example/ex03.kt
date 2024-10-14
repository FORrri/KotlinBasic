package com.example.kotlinbasic.day03.example

fun main() {

    val words = listOf("apple", "cat", "banana", "dog")
    //각 문자열을 반복하여 출력한다.
    //문자열의 길이가 4글자 이상이면 대문자로 변환한 후 출력한다.

    for (i in words) {
        print("$i ")
    }
    println()

    println("--------------------------------")
    for (i in words) {
        if (i.length >=4) {
            println(i.uppercase() )
        } else {
            println(i)
        }
    }
}