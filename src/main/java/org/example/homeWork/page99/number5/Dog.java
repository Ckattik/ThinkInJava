package org.example.homeWork.page99.number5;

public class Dog {
    public String name;
    public String says;


    public static void main (String [] args){
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.name = "spot";
        d2.name = "scruffy";

        System.out.println(d1.name + " "  + d1.says);
        System.out.println(d2.name + " " + d2.says);

        Dog d3 = new Dog();
         d1 = d3;

        System.out.println("d1 : " + d1);
        System.out.println("d3 : " + d3);

        System.out.println(d1 == d3);

        System.out.println(d1.equals(d3));



    }
}
