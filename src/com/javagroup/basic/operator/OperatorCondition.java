package com.javagroup.basic.operator;

public class OperatorCondition {
    public static void main(String[] args){

        int value1 = 4;
        int value2 = 5;

        System.out.println("Condition AND");
        boolean hasil = value1 == 3 && value2 == 5;
        boolean hasil2 = value1 != 3 && value2 == 5;
        System.out.println("Hasil Operator AND 'hasil' adalah " + hasil);
        System.out.println("Hasil Operator AND 'hasil2' adalah " + hasil2);
        System.out.println();

        System.out.println("Condition OR");
        hasil = value1 == 3 || value2 == 5;
        hasil2 = value1 != 3 || value2 == 5;
        System.out.println("Hasil Operator OR 'hasil' adalah " + hasil);
        System.out.println("Hasil Operator OR 'hasil2' adalah " + hasil2);
        System.out.println();
    }
}
