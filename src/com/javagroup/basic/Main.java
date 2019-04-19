package com.javagroup.basic;

import com.javagroup.basic.gitar.Gitar;
import com.javagroup.basic.kendaraan.Kereta;
import com.javagroup.basic.kendaraan.Mobil;
import com.javagroup.basic.kendaraan.Motor;

public class Main {
    public static void main(String[] args) {
        Gitar gitarAkustik = new Gitar();
        Gitar gitarListrik = new Gitar();
        Gitar gitarNew = new Gitar();

        gitarAkustik.bunyi();
        gitarListrik.bunyiEffect();
        gitarNew.bunyiBunyian();

        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();
        //==========================================================
        /**
         * Tipe data Reference
         */
        String nama = null;

        /**
         * Tipe data primitif
         */
        byte angkaByte = 10; //tipe data byte hanya untuk integer 8 bit
        short angkaShort = 15000; //tipe data short hanya untuk integer 16 bit
        int angka = 0;
        long angkaLong = 150000L;
        float angkaFloat = 0f;
        double angkaDouble = 5.0;
        boolean bool = false;
        char character = 'A';

        munculinString();
    }

    public static void munculinString() {
        String strip = "===================================";
        String hallo = "Hello World";
        char[] namaGue = {'J', 'O', 'K', 'O'};
        String namaGueString = new String(namaGue);

        System.out.println(strip);
        System.out.println(hallo);
        System.out.println(namaGueString);
    }
}
