package com.javagroup.basic.array;

public class CobaArray {
    public static void main(String[] args) {
        cobaArray();
        loopingArray();
        cobaArray2D();
    }

    private static void cobaArray() {
        int[] contohArray = new int[]{10, 20, 30, 40, 50};
        System.out.println(contohArray[0]);
        System.out.println(contohArray[1]);
        System.out.println(contohArray[2]);
        System.out.println(contohArray[3]);
        System.out.println(contohArray[4]);
    }

    private static void loopingArray() {
        int[] arrayInt = new int[10000];

        //inisialisasi arrayInt dari elemen 1 sampai 10000
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }
        //looping arrayInt dari elemen 1 sampai 10000
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }

    }

    private static void cobaArray2D() {
        char[][] arrayChar = new char[2][];
        arrayChar[0] = new char[2];
        arrayChar[1] = new char[3];
        // dimensi 1 yang indeksnya 0 memiliki panjang elemen 2
        arrayChar[0][0] = 'A';
        arrayChar[0][1] = 'B';
        // dimensi 2 yang indeksnya 0 memiliki panjang elemen 2
        arrayChar[1][0] = 'C';
        arrayChar[1][1] = 'D';
        arrayChar[1][2] = 'E';
        // tampilkan semua data dari dimensi 1 yang memiliki indeks 0
        System.out.println("Dimensi 1 dengan indeks 0 dan dimensi 2 dengan indeks 0 : "
                + arrayChar[0][0]);
        System.out.println("Dimensi 1 dengan indeks 0 dan dimensi 2 dengan indeks 1 : "
                + arrayChar[0][1]);
        // tampilkan semua data dari dimensi 1 yang memiliki indeks 0
        System.out.println("Dimensi 1 dengan indeks 1 dan dimensi 2 dengan indeks 0 : "
                + arrayChar[1][0]);
        System.out.println("Dimensi 1 dengan indeks 1 dan dimensi 2 dengan indeks 1 : "
                + arrayChar[1][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan dimensi 2 dengan indeks 2 : "
                + arrayChar[1][2]);
    }
}
