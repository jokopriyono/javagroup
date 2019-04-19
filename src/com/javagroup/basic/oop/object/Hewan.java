package com.javagroup.basic.oop.object;

class Hewan {
    private String nama;
    private int berat;
    private int jumlahKaki;

    Hewan(String namaHewan) {
        nama = namaHewan;
    }

    void beratHewan(int beratHewan) {
        berat = beratHewan;
    }

    void jumlahKakiHewan(int jumlahKakiHewan) {
        jumlahKaki = jumlahKakiHewan;
    }

    void cetakHewan() {
        System.out.println("Nama hewan : " + nama);
        System.out.println("Berat hewan : " + berat);
        System.out.println("Jumlah kaki : " + jumlahKaki);
    }
}
