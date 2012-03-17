package com.leneghan.maybe;

import java.util.Iterator;

public final class Just<T> implements Maybe<T> {
    private final T obj;

    public static <T> Just<T> just(T obj){
        return new Just<T>(obj);
    }

    public Just(T obj){
        this.obj = obj;
    }

    @Override
    public boolean isNothing() {
        return false;
    }

    @Override
    public boolean isJust() {
        return true;
    }

    @Override
    public T get() {
        return obj;
    }

    @Override
    public T getMaybe(T defaultValue) {
        return obj;
    }

    @Override
    public String toString(){
        return "Just[" +obj.toString() + "]";
    }

    @Override
    public Iterator<T> iterator() {
        return new IterableMaybe(obj);
    }
}
