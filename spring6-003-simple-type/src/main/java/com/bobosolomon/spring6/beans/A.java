package com.bobosolomon.spring6.beans;

import java.net.URI;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.net.URL;

public class A {
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private boolean flag;
    private char c;

    private String str;
    private Date date;

    private Season season;

    private URI uri;

    private URL url;

    private LocalDate localDate;

    private Locale locale;

    private Class clazz;

    public void setB(byte b) {
        this.b = b;
    }

    public void setS(short s) {
        this.s = s;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setL(long l) {
        this.l = l;
    }

    public void setF(float f) {
        this.f = f;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                ", s=" + s +
                ", i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", flag=" + flag +
                ", c=" + c +
                ", str='" + str + '\'' +
                ", date=" + date +
                ", season=" + season +
                ", uri=" + uri +
                ", url=" + url +
                ", localDate=" + localDate +
                ", locale=" + locale +
                ", clazz=" + clazz +
                '}';
    }
}


enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}
