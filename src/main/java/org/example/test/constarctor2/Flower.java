package org.example.test.constarctor2;

public class Flower {
    int pentalCount = 0;
    String s = "initial value";
    public Flower(int petals){
        pentalCount = petals;
        System.out.println("Конструктор с параметром int, pentalCount = " + pentalCount);

    }

    public Flower(String ss){
        System.out.println("Конструктор с параметром String , s = " + ss);
        s = ss;
    }

    public Flower(String s, int petals){

        this(petals);    // вызов другого конструктора завершен
        // this(s);       //вызов другого конструктора запрещен
        this.s = s; //Другое использование this
        System.out.println("Аргументы String и int");

    }

    public Flower(){
        this("hi", 47);
        System.out.println("Конструктор по умолчанию (без аргументов)");
    }

}
