package com.javagroup.basic.oop.nonaccessmodifier;

final class Lingkaran {

    static final double PI = 3.141;
    private int jari = 7;

    final double getLuas() {
        return PI * (jari * jari);
    }

}
