package org.example.homeWork.part5.number5;

public class Dog {
    public void bark(int i, char c){

        System.out.println("Brrrr");
    }

    public void bark(char c, int i){
System.out.println("Gav");
    }
    public void bark(){

        System.out.println("Cccccc");
    }


    public static void main(String [] args){
        Dog d = new Dog();
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d.bark();
        d1.bark(1 , 'x');
        d2.bark('x', 1);
    }


}
