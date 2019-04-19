package com.javagroup.basic.oop.nonaccessmodifier;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dimulai nilai " + Perhitungan.nilai);

        for (int i = 0; i < 5; i++) {
            new Perhitungan();
        }

        System.out.println("Sampai " + Perhitungan.getNilai());
    }
}
