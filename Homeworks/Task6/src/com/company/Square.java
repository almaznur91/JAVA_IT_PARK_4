package com.company;

 class Square extends Rectangle {


    public Square(int side1) {
        super(side1, side1);
    }

    public void area() {
        System.out.println("Площадь квадрата = " + (side1 * side1));
    }

}
