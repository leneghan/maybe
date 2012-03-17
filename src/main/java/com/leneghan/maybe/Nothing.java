package com.leneghan.maybe;

import java.util.Iterator;

public final class Nothing<T> implements Maybe<T>{

    public static <T> Nothing<T> nothing(){
        return new Nothing<T>();
    }

    @Override
    public boolean isNothing() {
        return true;
    }

    @Override
    public boolean isJust() {
        return false;
    }

    @Override
    public T get() {
        throw new NothingThereException();
    }

    @Override
    public T getMaybe(T defaultValue) {
        return defaultValue;
    }

    @Override
    public String toString(){
        return "Nothing";
    }

    @Override
    public Iterator<T> iterator() {
        return new IterableMaybe();
    }
}
