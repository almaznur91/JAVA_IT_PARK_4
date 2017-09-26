package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int choise;

        int[] array = new int[100];
        int count = 0;


        while (true) {

            System.out.println("\nМЕНЮ:\n" +
                    "1. Показать массив - выводит только count-элементов\n" +
                    "2. Добавить в начало\n" +
                    "3. Добавить в конец\n" +
                    "4. Удалить по позиции\n" +
                    "5. Выход");

            choise = scanner.nextInt();

            switch (choise) {
                case 1:

                    for (int i = 0; i < count; i++) {
                        System.out.print(array[i]);
                    }

                    break;
                case 2:

                    if (count == 100) {
                        System.out.println("Заполнено");
                        break;
                    }

                    System.out.println("Введите число для добавления в начало");
                    for (int a = count, b = count - 1; b >= 0; a = a - 1, b = b - 1) {
                        array[a] = array[b];
                    }
                    array[0] = scanner.nextInt();
                    count++;

                    break;


                case 3:
                    if (count == 100) {
                        System.out.println("Заполнено");
                        break;
                    }
                    System.out.println("Введите число для добавления в конец");
                    array[count] = scanner.nextInt();
                    count++;

                    break;


                case 4:
                    System.out.println("Введите число для удаления по позиции");
                    int n = scanner.nextInt();


                    if (n >= count) {
                        System.out.println("Введите верное значение");
                        break;
                    }


                    for (int a = n; a < count; a = a + 1)
                        array[a] = array[a + 1];
                    count--;


                    break;


                case 5:
                    System.exit(0);

                    break;

                default:
                    System.out.println("Введите верное значение");

                    break;
            }


        }
    }

}