package org.example.test.ifElse;

public class IfElse {
    public static int rezult = 0;
    public static void test(int testVal, int target){
        if(testVal > target){
            rezult = +1;
        } else if (testVal < target) {
            rezult = -1;
        }else {
            rezult = 0; // равные числа
        }
    }

    public static void main (String [] args){

        test(10, 5);

        System.out.println(rezult);

        test(5, 10);

        System.out.println(rezult);

        test(5, 5);

        System.out.println(rezult);



    }
}
