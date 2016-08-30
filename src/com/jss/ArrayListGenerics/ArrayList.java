package com.jss.ArrayListGenerics;

import java.util.List;

/**
 * Универсальный com.jss.ArrayListGenerics.ArrayList;
 */
public class ArrayList<T> {
    private final List<T> list;

    public ArrayList() {
        this.list = new java.util.ArrayList<>();
    }

    public void arrAdd(T val) {
        list.add(val);
    }

    public List<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "com.jss.ArrayListGenerics.ArrayList{" +
                "list=" + list +
                '}';
    }
}
