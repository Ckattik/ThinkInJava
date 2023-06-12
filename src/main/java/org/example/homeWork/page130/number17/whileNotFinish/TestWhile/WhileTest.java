package org.example.homeWork.page130.number17.whileNotFinish.TestWhile;

import java.util.Random;

public class WhileTest {

    public static void main (String []  args) {
        Random random = new Random();


        int x = random.nextInt(100) + 1;
        int y = random.nextInt(100) + 1;
        System.out.println(x + " " + y);

        while (x > y) {
            System.out.println(x > y);
            System.out.println(x++);
        }

    }
}