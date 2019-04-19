package com.javagroup.basic.oop.nonaccessmodifier;

import java.io.Serializable;

public class Test implements Serializable {

    // variabel ini tidak akan dijaga nilainya di memori
    transient int nilaiA;

    // variabel ii akan dijaga nilainya di memori
    double nilaiB;
    String nilaiC;
}
