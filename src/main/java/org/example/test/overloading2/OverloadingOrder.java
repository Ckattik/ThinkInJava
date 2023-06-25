package org.example.test.overloading2;

public class OverloadingOrder {
    public static void f(String s, int i){
        System.out.println("String : " + s + ", int: " + i);

    }
    public static void f(int i, String s){
        System.out.println("int: " + i + "String : " + s);
    }

    public static void main(String [] args){
        f("Сначала строка ", 11);
        f(99, " Сначала число");
    }
}
