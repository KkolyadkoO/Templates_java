package lab4.task2;

import lab4.task2.singleton.SingletonClass;

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());
        firstThread.start();
        secondThread.start();
    }

    static class FirstThread implements Runnable {
        @Override
        public void run() {
            SingletonClass singletonClass = SingletonClass.getInstance();
            for(int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1000);
                    singletonClass.incrementX();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    static class SecondThread implements Runnable {
        @Override
        public void run() {
            SingletonClass singletonClass = SingletonClass.getInstance();
            for(int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1100);
                    System.out.println(singletonClass.getX());
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

