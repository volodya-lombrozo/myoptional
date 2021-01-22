package com.github.volodya_lombrozo;

public class Vipcxj {
    public static void main(String[] args) {
        MyOptional<String> myOptional = new MyOptional<>("");
        myOptional.ifPresent(Vipcxj::callCharSequence); //ok
        myOptional.ifPresent(Vipcxj::callString);  //ok
        myOptional.ifPresent(Vipcxj::callObject);  //ok
    }


    static void callString(String a) {
        System.out.println("Call string");
    }

    static void callCharSequence(CharSequence a) {
        System.out.println("callCharSequence");
    }

    static void callObject(Object a) {
        System.out.println("callObject");
    }

}
