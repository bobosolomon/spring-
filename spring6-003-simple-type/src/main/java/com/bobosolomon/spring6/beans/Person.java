package com.bobosolomon.spring6.beans;

import java.util.Arrays;

public class Person {
    private String[] fabariteFoods;

    public void setFabariteFoods(String[] fabariteFoods) {
        this.fabariteFoods = fabariteFoods;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fabariteFoods=" + Arrays.toString(fabariteFoods) +
                '}';
    }
}
