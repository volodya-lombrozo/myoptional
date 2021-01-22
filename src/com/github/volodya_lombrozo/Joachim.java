package com.github.volodya_lombrozo;

public class Joachim {

    public static void main(String[] args) {
        MyOptional<B> myOptional = new MyOptional<>(new B());
        myOptional.ifPresent(System.out::println);
    }

    private static class A {
        protected void call() {
            System.out.println("Call A");
        }
    }

    private static class B extends A {
        @Override
        protected void call() {
            System.out.println("Call B");
        }
    }

    private static class C extends B {
        @Override
        protected void call() {
            System.out.println("Call C");
        }
    }
}
