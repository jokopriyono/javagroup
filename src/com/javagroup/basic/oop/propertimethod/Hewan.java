package com.javagroup.basic.oop.propertimethod;

class Hewan {
    // properti atau fields
    private double tinggi = 30;
    private double berat = 3;

    // Inisialisasi melalui konstruktor
    private int umur;

    Hewan(int umurParameter) {
        umur = umurParameter;
    }

    void lari() {
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan() {
        System.out.println("Berjalan dengan pelan..");
    }

    void makan() {
        System.out.println("Makan dengan menggunakan mulut..");
    }

    double getTinggi() {
        return tinggi;
    }

    double getBerat() {
        return berat;
    }

    int getUmur() {
        return umur;
    }
}
