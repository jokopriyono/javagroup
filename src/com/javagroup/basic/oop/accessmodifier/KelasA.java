package com.javagroup.basic.oop.accessmodifier;

class KelasA {
    private int memberA = 5;

    private int functionA() {
        return memberA;
    }

    int functionB() {
        // Pemanggilan private member dan private function
        return functionA() + memberA;
    }

    protected void methodC() {
        System.out.println("Percobaan access modifier");
    }
}
