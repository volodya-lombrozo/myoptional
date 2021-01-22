package com.github.volodya_lombrozo;

import java.util.function.Consumer;

public class MyOptional<T> {

    private final T value;

    public MyOptional(final T value) {
        this.value = value;
    }

    public void ifPresent(Consumer<T> consumer) {
        if (value != null) {
            consumer.accept(value);
        }
    }
}
