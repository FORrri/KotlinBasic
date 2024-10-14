package com.example.kotlinbasic.day04;

interface Example {
    void example(); //추상메서드
}
public class AnonymousJava {

    public static void main(String[] args) {
        //익명클래스, 익명객체 -> interface를 new로 새로운 객체 만들었을때
        Example e = new Example() {
            @Override
            public void example() {
                System.out.println("hello world!");
            }
        };
        e.example();
    }

}
