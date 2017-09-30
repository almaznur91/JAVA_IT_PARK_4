package ru.itpark;

public class Main {

    public static void main(String[] args) {

        Car opel = new Car();
        Car ford = new Car();
        Car suzuki = new Car();

        opel.value=55;
        ford.value=48;
        suzuki.value=72;

        Car cars[]={ opel,ford,suzuki};

        int min;
        int poryadkovyNomerMinZnach;
        int temp;
        for (int n = 0; n < cars.length; n++) {
            min = cars[n];
            poryadkovyNomerMinZnach = n;
            for (int i = n + 1; i < cars.length; i++) {
                if (min > cars[i]) {
                    min = cars[i];
                    poryadkovyNomerMinZnach = i;
                }
            }
            temp = cars[poryadkovyNomerMinZnach];
            cars[poryadkovyNomerMinZnach] = cars[n];
            cars[n] = temp;
        }







	// write your code here
    }
}
