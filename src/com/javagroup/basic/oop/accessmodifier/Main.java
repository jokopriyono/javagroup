package com.javagroup.basic.oop.accessmodifier;

public class Main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();
        KelasB kelasB = new KelasB();

        System.out.println(kelasA.functionB());
        kelasA.methodC();
        kelasB.methodC();
    }
}
