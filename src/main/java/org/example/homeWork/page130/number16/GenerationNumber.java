package org.example.homeWork.page130.number16;

import org.example.test.ifElse.IfElse;

import java.util.Random;

public class GenerationNumber {


    public static void main (String []  args){
        Random random = new Random();

        for (int i = 1; i <= 1000000000; i++){
            int x = random.nextInt(100) + 1;
            int y = random.nextInt(100) + 1;
            System.out.println(x + " " + y);



            if(x > y){

                System.out.println("x > y");
            }else if (x < y){
                System.out.println("x < y");
            }




        }


    }
}
