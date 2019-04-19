package com.javagroup.basic.oop.accessmodifier;

public class KelasB extends KelasA {
    @Override
    protected void methodC() {
        super.methodC();

        System.out.println("Contoh pemanggilan protected");
    }
}
