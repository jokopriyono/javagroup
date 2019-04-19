package com.javagroup.basic.oop.object;

public class Main {
    public static void main(String[] args) {
        Hewan elang = new Hewan("Elang");
        Hewan kucing = new Hewan("Kucing");

        elang.beratHewan(2);
        elang.jumlahKakiHewan(2);
        elang.cetakHewan();

        kucing.beratHewan(4);
        kucing.jumlahKakiHewan(4);
        kucing.cetakHewan();
    }
}
