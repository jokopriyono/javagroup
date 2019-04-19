package com.javagroup.basic.oop.propertimethod;

public class Main {
    public static void main(String[] args) {
        Hewan ayam = new Hewan(3);
        ayam.jalan();
        ayam.lari();
        ayam.makan();

        System.out.println("Tinggi ayam = " + ayam.getTinggi());
        System.out.println("Berat ayam = " + ayam.getBerat());
        System.out.println("Umur ayam = " + ayam.getUmur());
    }
}
