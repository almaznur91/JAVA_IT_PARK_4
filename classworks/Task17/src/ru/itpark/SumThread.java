package ru.itpark;

public class SumThread extends Thread {

    int start;
    int end;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            synchronized (Main.array) {
                Main.result = Main.result + Main.array[i];
            }
        }

    }
}
