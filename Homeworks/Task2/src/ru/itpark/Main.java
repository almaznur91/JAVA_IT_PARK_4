import java.util.Scanner;

public class Main {

    public static void showArray(int count, int[] array) {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static int addToBegin(int count1, int[] array) {
        System.out.println("Введите число для добавления в начало");
        for (int a = count1; a > 0; a = a - 1) {
            array[a] = array[a-1];
        }
        array[0] = new Scanner(System.in).nextInt();
        count1++;
        return count1;
    }


    public static int addToFinish(int count, int[] array) {
        System.out.println("Введите число для добавления в конец");
        array[count] = new Scanner(System.in).nextInt();
        count++;
        return count;
    }


    public static int Del(int count1, int[] array) {
        System.out.println("Введите число для удаления по позиции");
        int n = new Scanner(System.in).nextInt();
        if (n >= count1) {
            System.out.println("Введите верное значение");
        } else {
            for (int a = n; a < count1; a = a + 1)
                array[a] = array[a + 1];
        }
        count1--;
        return count1;
    }


    public static void regularize(int[] array, int count) {
        int min;
        int poryadkovyNomerMinZnach;
        int temp;
        for (int n = 0; n < count; n++) {
            min = array[n];
            poryadkovyNomerMinZnach = n;
            for (int i = n + 1; i < count; i++) {
                if (min > array[i]) {
                    min = array[i];
                    poryadkovyNomerMinZnach = i;
                }
            }
            temp = array[poryadkovyNomerMinZnach];
            array[poryadkovyNomerMinZnach] = array[n];
            array[n] = temp;
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[100];
        int count = 0;
        int choise;

        System.out.println("\nМЕНЮ:\n" +
                "1. Показать массив - выводит только count-элементов\n" +
                "2. Добавить в начало\n" +
                "3. Добавить в конец\n" +
                "4. Удалить по позиции\n" +
                "5. Удалить по позиции\n" +
                "6. Выход");

        while (true) {
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    showArray(count, array);
                    break;
                case 2:

                    if (count == 100) {
                        System.out.println("Заполнено");
                        break;
                    }
                    count = addToBegin(count, array);
                    break;
                case 3:
                    if (count == 100) {
                        System.out.println("Заполнено");
                        break;
                    }
                    count = addToFinish(count, array);
                    break;
                case 4:
                    count = Del(count, array);
                    break;
                case 5:
                    regularize(array, count);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Введите верное значение");
                    break;
            }
        }
    }
}