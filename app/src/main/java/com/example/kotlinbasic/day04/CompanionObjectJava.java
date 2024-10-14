package com.example.kotlinbasic.day04;

//자바에서 내부클래스
public class CompanionObjectJava {
    //자바의 내부클래스는 2종류 static클래스, 일반클래스가 있습니다.
    String name = "홍길동";

    public class Inner1 { //외부클래스가 만들어져야지 내부클래스 생성가능
        String a = "a";
        public String example() {
            return name; //외부클래스에 멤버에 접근이 가능
        }
    }
    public static class Inner2 { //staic클래스는 외부클래스와 상관없음
        String a = "a";
//        public String example() {
//            return name; //static이 붙으면 외부클래스에서 멤버에 접근이 불가능
//        }
    }

    //일반 static메서드
    public static void method() {

    }

    public static void main(String[] args) {

        //inner1객체 생성(일반 내부 클래스) -> 외부클래스에 먼저 접근한 후 생성 가능
        Inner1 inner1 = new CompanionObjectJava().new Inner1();
        //inner2객체 생성(static 내부 클래스) -> 다이렉트로 접근 가능
        Inner2 inner2 = new CompanionObjectJava.Inner2();


    }


}
