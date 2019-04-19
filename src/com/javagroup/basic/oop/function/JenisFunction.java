package com.javagroup.basic.oop.function;

public class JenisFunction {
    public static void main(String[] args) {
        cetakString();
        int panjang = 10;
        int lebar = 20;
        int hasil = hitungLuas(panjang, lebar);
        System.out.println("Hasilnya adalah " + hasil);

        hitung(10);
        hitung(8, 10);
        hitung(4, 10, 10);
    }

    public static void cetakString() {
        System.out.println("Contoh function void");
    }

    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    // hitung bangun persegi
    public static void hitung(int sisi) {
        int hasil = sisi * sisi;
        System.out.println("Hasil persegi adalah " + hasil);
    }

    // hitung bangun segitiga
    public static void hitung(int alas, int tinggi) {
        double hasil = 0.5 * alas * tinggi;
        System.out.println("Hasil segitiga adalah " + hasil);
    }

    // hitung keliling bangun segitiga
    public static void hitung(int sisiA, int sisiB, int sisiC) {
        int hasil = sisiA + sisiB + sisiC;
        System.out.println("Hasil keliling segitiga adalah " + hasil);
    }
}
