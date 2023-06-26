package org.example.homeWork.part5.number1.number3;

public class Apple {
    public Apple(){

            System.out.println("Создан обьект с помощью конструктора");

    }


    public Apple(String s){
        System.out.println("Перегруженый конструктор " + s);
    }

    public static void main(String[] args){

        Apple apple1 = new Apple("тра тата ");
        Apple apple = new Apple();

    }
}
