package ru.itpark;

public class Main {

    public static void main(String[] args) throws Exception {

        Cheken cheken = new Cheken();
        cheken.start();
        Egs egs = new Egs();
        cheken.join();
        egs.start();
        for (int i = 0; i < 100; i++) {

            System.out.println("человек");

        }


    }
}