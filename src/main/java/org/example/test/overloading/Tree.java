package org.example.test.overloading;

public class Tree {
    public int height;
    public Tree(){
        System.out.println("Сажаем росток");
        height = 0;
    }


    public Tree(int initialHeihgt){
        initialHeihgt = height;

        System.out.println("Создание нового дерева высотой " + height + " м.");
    }

    public void info(){
        System.out.println("Дерево высотой " + height + " м.");
    }

    public void info(String s){
        System.out.println(s + ": Дерево высотой " + height + " м.");
    }


}
