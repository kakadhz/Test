package com.gxs.type;

public class TestThread  {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        MyThread2 t2 = new MyThread2();
        Thread thread2 = new Thread(t2);
        thread2.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"---------"+Thread.currentThread().getName());
        }
    }
}
class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("加油"+i);
        }
    }
}