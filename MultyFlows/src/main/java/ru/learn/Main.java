package ru.learn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Runnable r2 = () -> {
            for (int i = 0; i < 20000; i++) {
                System.out.println("wlkcmwk!! - " + i);
            }
            System.out.println("I`m woorked!!");
        };

        Runnable r1 = () -> {
            for (int i = 0; i < 20000; i++) {
                System.out.println("I`m woork!! - " + i);
            }
            System.out.println("I`m woorked!!");
        };
        Thread vova = new Thread(r1);
        Thread vova2 = new Thread(r2);
        vova.start();
        vova2.start();

        try {
            vova.join();
            vova2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.err.println("QWERTYUIOP");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}