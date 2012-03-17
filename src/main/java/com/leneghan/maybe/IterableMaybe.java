package com.leneghan.maybe;

import java.util.Iterator;

class IterableMaybe<T> implements Iterator<T> {
    private T obj;
    private boolean done;

    public IterableMaybe() {
        done = true;
    }

    public IterableMaybe(T obj) {
        done = false;
        this.obj = obj;
    }

    @Override
    public boolean hasNext() {
        return !done;
    }

    @Override
    public T next() {
        return obj;
    }

    @Override
    public void remove() {
        done = true;
    }
}
