package com.company;

public class ArrayList {

    // константа - в коде уже изменить не получится
    private final int INITIAL_SIZE = 100;
    // поле - хранилище данных
    private int elements[];
    // количество элементов массива
    private int count;

    public ArrayList() {
        elements = new int[INITIAL_SIZE];
        count = 0;
    }

    public int[] getArray() {
        int[] array1 = new int[count];
        for (int i = 0; i < count; i++) {
            array1[i] = elements[i];
        }
        return array1;
    }

    public String outString() {
        String sOut = "";
        for (int i = 0; i < count; i++) {
            sOut = sOut + elements[i] + " ";
        }
        return sOut;
    }


    public boolean delByInd(int index) {
        if (index >= 0 || index < count) {
            for (int i = index; i < count - 1; i++) {
                elements[i] = elements[i + 1];
            }
            count--;
            return true;
        } else {
            return false;
        }
    }

    public void add(int element) {

        if (elements.length == count) {

            int[] tempArray = new int[(int) (elements.length * 1.5)];
            for (int i = 0; i < count; i++) {
                tempArray[i] = elements[i];
                elements = tempArray;
            }
        }
        elements[count] = element;
        count++;
    }

    public int get(int index) {
        return elements[index];
    }

    public void replace(int index, int element) {
        elements[index] = element;
    }

    public void addStart(int index) {
        if (elements.length == count) {
            int[] tempArray = new int[(int) (elements.length * 1.5)];
            for (int i = 0; i < count; i++) {
                tempArray[i] = elements[i];
                elements = tempArray;
            }
        }
        for (int i = count - 1; i >= 0; i--) {

            elements[i + 1] = elements[i];
        }
        elements[0] = index;
        count++;
    }

    public int ReturnIndex(int element) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void insertElement(int element, int index) {
        if (elements.length == count) {
            int[] tempArray = new int[(int) (elements.length * 1.5)];
            for (int i = 0; i < count; i++) {
                tempArray[i] = elements[i];
                elements = tempArray;
            }
        }
        for (int i = index; i < count; i++) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        count++;
    }

    public void sort() {
        int min;
        int index;
        int temp;
        for (int n = 0; n < count; n++) {
            min = elements[n];
            index = n;
            for (int i = n + 1; i < count; i++) {
                if (min > elements[i]) {
                    min = elements[i];
                    index = i;
                }
            }
            temp = elements[index];
            elements[index] = elements[n];
            elements[n] = temp;
        }
    }

    public void reverse() {
        int temp;
        int f = count - 1;

        for (int i = 0; i < count / 2; i++, f--) {
            temp = elements[i];
            elements[i] = elements[f];
            elements[f] = temp;
        }
    }


}

