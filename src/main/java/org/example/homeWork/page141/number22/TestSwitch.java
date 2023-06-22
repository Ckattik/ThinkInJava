package org.example.homeWork.page141.number22;

import java.util.Random;

public class TestSwitch {
    public static void main(String[] args) {


        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            int c = rand.nextInt(26);
            System.out.println(c + " ");


            switch (c) {
                case 1:
                    System.out.println("1" + " совпадение");
                    break;

                case 2:
                    System.out.println("2" + " совпадение");
                    break;
                case 3:
                    System.out.println("3" + " совпадение");
                    break;
                case 4:
                    System.out.println("4" + " совпадение");
                    break;
                case 5:
                    System.out.println("5" + " совпадение");
                    break;

                default:
                    System.out.println("Совпадений нет");

            }
        }
    }
}