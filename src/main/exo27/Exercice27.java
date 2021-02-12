package main.exo27;

public class Exercice27 implements Runnable{
    @Override
    public void run() {
        Thread thread1 = new Thread(getRunnableFoisDeux());
        Thread thread2 = new Thread(getRunnableFoisDix());

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("BBBBBB");

    }

    Runnable getRunnableFoisDeux(){
        return new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 2000; i++)
                    System.out.println("runnable *2 = "+i*2);
            }
        };
    }

    Runnable getRunnableFoisDix(){
        return new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 2000; i++)
                    System.out.println("runnable *10 = "+i*10);
            }
        };
    }
}
