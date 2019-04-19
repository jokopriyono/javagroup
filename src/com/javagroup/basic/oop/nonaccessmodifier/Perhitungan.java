package com.javagroup.basic.oop.nonaccessmodifier;

class Perhitungan {
    final static int nilaiFinal = 10;
    static int nilai = 0;

    Perhitungan() {
        nilai++;
    }

    protected static int getNilai() {
        return nilai;
    }
}
