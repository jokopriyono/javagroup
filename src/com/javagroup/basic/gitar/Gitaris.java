package com.javagroup.basic.gitar;

public class Gitaris {
    public static void main(String[] args) {
        Gitar gitarAkustik = new Gitar();
        Gitar gitarListrik = new Gitar();
        Gitar gitarNew = new Gitar();

        gitarAkustik.bunyi();
        gitarListrik.bunyiEffect();
        gitarNew.bunyiBunyian();
    }
}
