package org.example.test.whileD;

public class WhileTest {

    public static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.print(result + ",  ");
        return result;
    }

    public static void main (String [] args){
        while (condition()){
            System.out.println("Inside 'while' ");
            System.out.println("Exited 'while' ");
        }
    }


}
