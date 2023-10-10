package com.bobosolomon.spring6.beans;

import java.util.List;
import java.util.Set;

public class People {
    private List<String> names;

    private Set<String> phones;

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public People() {
    }

    @Override
    public String toString() {
        return "People{" +
                "names=" + names +
                ", phones=" + phones +
                '}';
    }

    public People(Set<String> phones) {
        this.phones = phones;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

}
