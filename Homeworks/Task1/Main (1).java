package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n1, n2;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число");
        n1 = scanner.nextInt();
        System.out.print("Введите второе число");
        n2 = scanner.nextInt();
        while (true) {

            System.out.println("МЕНЮ:\n" +
                    "1. Считать два числа\n" +
                    "2. Сумма чисел вывод\n" +
                    "3. Разность чисел вывод\n" +
                    "4. Произведение вывод\n" +
                    "5. Выход");

            int c = scanner.nextInt();

//            if (c == 1) {
//                System.out.print("Введите первое число");
//                n1 = scanner.nextInt();
//                System.out.print("Введите второе число");
//                n2 = scanner.nextInt();
//
//            } else if (c == 2) {
//                System.out.println("Сумма: " + (n1 + n2));
//
//            } else if (c == 3) {
//                System.out.println("Разность: " + (n1 - n2));
//            } else if (c == 4) {
//                System.out.println("Произвидение: " + (n1 * n2));
//
//            } else
//                System.exit(0);

            switch (c) {
                case 1:
                    System.out.println("Введите первое число");
                    n1 = scanner.nextInt();
                    System.out.println("Введите первое число");
                    n2 = scanner.nextInt();
                    break;
                case 2:
                    System.out.println(n1+n2);
                    break;
                case 3:
                    System.out.println(n1-n2);
                    break;
                case 4:
                    System.out.println(n1*n2);
                    break;
                case 5:
                    System.exit(0);




            }

        }
    }
}
