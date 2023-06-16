package org.example.test.comaFor;

public class CommaOperator {
    public static void main(String [] args){
        for(int i = 1, j = i + 10, f = i + j + 4; i < 5; i++, j = i * 2, f = j * 4){

            System.out.println("i = " + i + " j = " + j + " f = " + f);
        }
    }
}
