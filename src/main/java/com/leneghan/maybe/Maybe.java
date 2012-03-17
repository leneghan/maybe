package com.leneghan.maybe;

public interface Maybe<T> extends  Iterable<T>{

    boolean isNothing();
    boolean isJust();
    T get();
    T getMaybe(T defaultValue);

}
