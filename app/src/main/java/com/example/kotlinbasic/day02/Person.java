package com.example.kotlinbasic.day02;

public class Person {

    public String name;
    public int age;
    public Person(String name) {
        this.name = name;
        this.age = 1;
    }
    public Person(String name, int age) {
        this(name);
        this.age = age;
    }
}
//conver java to kotlin(java파일을 먼저 만들고 마우스 우클릭)

