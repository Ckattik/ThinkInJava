package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        // обращение к static переменной через ссылку на обьект
        System.out.println(st1.i);
        System.out.println(st2.i);


        // обращение к static переменной через имя класса(только для static)
        StaticTest.i++;





    }

    public void sysOut(){
        System.out.println("Hello Vitaliy");
    }

    public void sOut(){
        System.out.println("start");
    }

    public void vitaliyOut(){
        System.out.println("Vitaliy");
    }

    Light lt = new Light();

// Метод указывает сколько байт необходимо для хранения строки
    int storage(String s){
        return s.length();
    }

    public boolean flag (){
        return true;
    }

    public float naturalLogBase(){
        return 2.718F;
    }

    public void nothing (){
        return;
    }
    public void nothing2(){

    }


}
