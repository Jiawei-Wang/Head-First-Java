public class WhatInMain {
    public static void main(String[] args) {
        // Do something
        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.print("x is " + x);
        double d = Math.random();
        System.out.print("d is " + d);
        // this is comment

        // loop
        while (x > 12) {
            x = x - 1;
        }

        for (int i = 0; i < 10; i = i + 1) {
            System.out.print("x is now "+x);
        }

        // if/else
        if (x == 10) {
            System.out.print("x must be 10");
        } else {
            System.out.print("x is not 10");
        }
        if ((x < 3) & (name.equals("Dirk"))) {
            System.out.println("Correct");
        }
        System.out.print("this line runs no matter whtat");


    }
}
