package org.example.homeWork.page136;



public class BreakeAndContinue {
    public static void main(String [] args){
         for (int i = 0; i < 100; i++){
             if(i == 74) break;     // выход из цыкла
             if(i % 9 != 0) continue;  // следующая итерация
             System.out.println(i + " ");

         }
        System.out.println();

         // Использование цыкла forEach


        int [] arr = new int[100];
        for (int i = 0; i < 100; i++ ){
            arr[i] = i;
        }

        for (int i : arr){

            if(i == 74) break;     // выход из цыкла
            if(i % 9 != 0) continue;  // следующая итерация
            System.out.println(i + " ");


        }


        System.out.println();

         int i = 0;
         //Безконечный цыкл
        while (true){
            i++;
            int j = i * 27;
            if (j == 1269) break; // выход из цыкла
            if(i % 10 != 0) continue; // возврат в начало цыкла
            System.out.println(i + " ");
        }

        while (true){
            int v = 0;
            System.out.println(v + " ");
            v++;
        }


    }
}
