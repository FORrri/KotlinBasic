package com.example.kotlinbasic.day04

abstract class Anonymous {
    abstract fun example()
}

interface IAnonymous {
    fun example()
}

fun main() { //코틀린에서는 익명객체로 쓸 때 "object"를 씀
    //익명객체로 생성할 때 object : 객체 {}
    val a = object : Anonymous() {
        override fun example() {
            TODO("Not yet implemented")
        }
    }

    val b = object : IAnonymous { //인터페이스라서 ()없음
        override fun example() {
            TODO("Not yet implemented")
        }

    }
}