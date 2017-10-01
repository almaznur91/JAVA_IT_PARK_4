package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList[] lists;
        lists = new ArrayList[5];
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int choise;

        System.out.println("МЕНЮ:+\n" +
                "1. Создать список +\n" +
                "2. Показть все списки+\n" +
                "3. Работа со списком ");

        while (true) {
            choise = scanner.nextInt();
            switch (choise) {
                case 1:

                    System.out.println("Введите номер создаваемого списка:[0..4]");
                    int listsNumbre = scanner.nextInt();
                    if (listsNumbre > 4 || listsNumbre < 0) {
                        System.out.println("Введеное значение неверно! Вввдите номер создаваемого списка от 0 до 4");
                    } else {
                        lists[listsNumbre] = new ArrayList();
                    }
                    break;
                case 2:
                    for (int i = 0; i < lists.length; i++) {
                        if (lists[i] != null) {
                            int[] tempArray = lists[i].getArray();
                            for (int j = 0; j < tempArray.length; j++) {
                                System.out.print(tempArray[j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите номер списка");
                    int numberOfList = scanner.nextInt();
                    System.out.println("Работа со сиском номер "+numberOfList);
                    //TODO:доделать меню
                    while (true) {
                        choise = scanner.nextInt();
                        switch (choise) {
                            case 1:
                                //TODO: добавить элемент в конец списка
                                break;
                            case 2:
                                //TODO: добавить элемент в начало списка
                                break;
                            case 3:
                                //TODO: Вставить элемент в заданную позицию со сдвигом
                                break;
                            case 4:
                                //TODO: Получить элемент по индексу
                                break;
                            case 5:
                                //TODO: Заменить элемент в заданной позиции новым элементом
                                break;
                            case 6:
                                //TODO: Сортировка
                                break;
                            case 7:
                                //TODO: Развернуть
                                break;
                            case 8:
                                //TODO: Удалить по индексу
                                System.out.println("Введите число для удаления по индексу");
                                if(!lists[numberOfList].delByInd(scanner.nextInt())){
                                    System.out.println("Удаление не прошло, введите верное значение");
                                }


                                break;
                            case 9:
                                //TODO: Вернуть индекс элемента, если элемента нет = -1
                                break;
                            case 10:
                                //TODO: Показать хоанилище
                                break;
                            case 11:
                                //TODO: Вернуться в предыдущее меню
                                break;

                        }
                    }

            }
        }
    }
}