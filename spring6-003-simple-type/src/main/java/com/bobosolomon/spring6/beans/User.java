package com.bobosolomon.spring6.beans;

public class User {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
