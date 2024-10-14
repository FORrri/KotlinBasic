package com.example.kotlinbasic.day03.example

// 문제: nullable 타입의 문자열 `name`을 선언하세요.
// - name 변수가 null이 아닐 때만, "Hello, {name}"을 출력하세요.
// - name 변수가 null이면 아무 출력도 하지 마세요.
// - let 함수를 사용하여 이 문제를 해결하세요.

fun main() {
    val name: String? = "Alice" // 이 변수를 null로도 테스트해보세요.

    // name이 null이 아닐 경우에만 출력하는 코드를 작성하세요.
    name.let {
        if (name != null) {
            println("Hello, ${name}")
        } else {
            println("")
        }
    }

}
