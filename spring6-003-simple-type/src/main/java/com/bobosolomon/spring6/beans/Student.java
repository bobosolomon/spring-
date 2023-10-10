package com.bobosolomon.spring6.beans;

public class Student {
    private String name;
    private Clazz clazz;

    public Student(String name, Clazz clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public Clazz getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
