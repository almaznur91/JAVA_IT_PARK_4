package ru.itpark;

public class MyThread extends Thread {
  public void run() {
    System.out.println(Thread.currentThread());
    Cheken cheken = new Cheken();
    cheken.run();
  }

}
