package com.bobosolomon.spring6.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {
    private List<String> names;

    private Set<String> phones;

    private Map<Integer, String> addrs;

    @Override
    public String toString() {
        return "People{" +
                "names=" + names +
                ", phones=" + phones +
                ", addrs=" + addrs +
                '}';
    }

    public void setAddrs(Map<Integer, String> addrs) {
        this.addrs = addrs;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    public People() {
    }

    public People(Set<String> phones) {
        this.phones = phones;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

}
