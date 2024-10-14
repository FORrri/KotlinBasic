package com.example.kotlinbasic.day01

import java.util.Arrays

fun main() {

    //배열은 3가지 유형이 있음(일반Array / 불변 listof, arrayListOf)

    //1. Array
    var arr1 = arrayOf(1,2,3) //초기값 지정
    var arr2 = arrayOf(1, "홍길동", "이순신") //각각 다른 타입도 저장됨
    var arr3 = arrayOf<Int>(1,2,3) //숫자타입 배열선언은 제네릭을 붙여주면 됨
    arr1[0] = 100 //배열의 사용

    //Array를 만드는 2번째 방법
    val arr4 = Array(10, {i -> i+1}) //크기, 초기값(람다식)

    println(Arrays.toString(arr1))
    println(Arrays.toString(arr2))
    println(Arrays.toString(arr3))
    println(Arrays.toString(arr4))

    println("----------------------------------------------------")

    //2. 불변 listof -> 값의 변경은 불가능하고, 사용만 가능한 리스트
    val arr5 = listOf(1,2,3)
    val arr6 = listOf<String>("a","b","c")
//    arr5[0] = 100 //err

    println("----------------------------------------------------")

    //3.arrayListOf -> 자바 ArrayListof와 같음(동적배열 생성)
    val list = arrayListOf<Int>()
    val list2 = arrayListOf(1,2,3)

    list.add(1) //값추가
    list.add(2)

    val x = list[0] //값조회
    val y = list.get(0) //값조회



}