package com.javagroup.basic.perulangan;

public class ContohFor {
    public static void main(String[] args) {
        cobaFor();
        segitigaStar();
        cobaWhile();
        cobaDoWhile();
    }

    private static void cobaFor() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Angka : " + i);
        }
    }

    private static void segitigaStar() {
        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void cobaWhile() {
        int nilai = 1;
        while (nilai <= 10) {
            System.out.println("Angka : " + nilai);
            nilai++;
        }
    }

    private static void cobaDoWhile() {
        int nilai = 1;
        do {
            System.out.println("Angka Do While : " + nilai);
            nilai++;
        } while (nilai <= 10);
    }
}
