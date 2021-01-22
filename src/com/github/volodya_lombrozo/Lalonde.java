package com.github.volodya_lombrozo;

import java.util.Optional;

public class Lalonde {

    public static void main(String[] args) {
//        Optional<? extends A> simpleOptional = Optional.of(new B()); //doesn't compile since declaration of class is 'Optional<T>'
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
