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
//        for (int i=0;i<elements.length;i++){
//            elements[i]=i;
//        }
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
        if (index>=0||index<count){
        for (int i = index; i < count - 1; i++) {
            elements[i] = elements[i + 1];
        }
        count--;
        return true;}
        else {
            return false;
        }
    }
}


