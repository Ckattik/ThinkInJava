package org.example.homeWork.page99.number7;

import java.util.Random;

public class TestLuckCoin {
    public static void main(String[] args) {


        Coin c1 = new Coin();

        Random rand = new Random();
         int x = rand.nextInt(100) + 1;
        System.out.println(x);
        String rez = throwUp(x);


        System.out.println(rez);
    }



    public  static String throwUp(int s) {
        String tails = "tails";
        String eagle = "eagle";

        if (s >= 50){
            return tails;
        }else {
            return eagle;
        }



    }
}