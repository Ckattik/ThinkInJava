package org.example.test.forTest;

public class ListCharacters {
    public static void main(String [] args){
        for (char c = 0; c < 129; c++){
            if(Character.isLowerCase(c)){
                System.out.println("значение: " + (int)c + "  символ: " + c);
            }

        }
    }
}
