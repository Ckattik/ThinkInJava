package org.example.homeWork.part5.number5;

public class Leaf {
     int i = 0;
     public Leaf increment(){
         i++;
         return this;
     }

     public void myPrint(){
         System.out.println("i = " + i);
     }

     public static void main(String [] args){
         Leaf x = new Leaf();

         x.increment().increment().increment().increment().increment().myPrint();
     }

}
