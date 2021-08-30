package com.company;

class MultithreadingDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId());
//            for (int i = 0; i < 20; i++) {
//                System.out.printf(String.valueOf(System.currentTimeMillis()));
//                System.out.printf(i + " ");
//
//            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
public class Multithreaded {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            MultithreadingDemo item = new MultithreadingDemo();
            System.out.println(item.getPriority());
            item.start();
        }

    }
}
