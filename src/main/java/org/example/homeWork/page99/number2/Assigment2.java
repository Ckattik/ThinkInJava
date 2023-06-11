package org.example.homeWork.page99.number2;

public class Assigment2 {
    public static void main(String [] args){
        Airplane a1 = new Airplane();
        Airplane a2 = new Airplane();

        a1.level = 33;
        a2.level = 11;


        System.out.println("1: a1.level: " + a1.level + " , a2.level " + a2.level);

        a1 = a2;              // Происходит совмещение имен (две ссылки ссылаються на один и тот же обьект)

        //a1.level = a2.level;  // Создаються два обьекта

        System.out.println("2: a1.level: " + a1.level + " , a2.level " + a2.level);

    }
}
