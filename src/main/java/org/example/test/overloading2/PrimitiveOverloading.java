package org.example.test.overloading2;

// Повышение приметивных типов и перегрузка методов
public class PrimitiveOverloading {
        public void f1(char x){
            System.out.println("f1(char)" + x);
        }

        public void f1(byte x){
            System.out.println("f1(byte)" + x);
        }

        public void f1(short x){
            System.out.println("f1(short)" + x);
        }

        public void f1(int x){
            System.out.println("f1(int)" + x);
        }

        public void f1(long x){
            System.out.println("f1(long)" + x);
        }

        public void f1(float x){
            System.out.println("f1(float)" + x);
        }

        public void f1(double x){
            System.out.println("f1(double)" + x);
        }


        public void f2(byte x){
            System.out.println("f2(byte)" + x);
        }

        public void f2(short x){
            System.out.println("f2(short)" + x);
        }

        public void f2(int x){
            System.out.println("f2(int)" + x);
        }

        public void f2(long x){
            System.out.println("f2(long)" + x);
        }

        public void f2(float x){
            System.out.println("f2(float)" + x);
        }

        public void f2(double x){
            System.out.println("f2(double)" + x);
        }


        public void f3(short x){
            System.out.println("f3(short)" + x);
        }

        public void f3(int x){
            System.out.println("f3(int)" + x);
        }

        public void f3(long x){
            System.out.println("f3(long)" + x);
        }

        public void f3(float x){
            System.out.println("f3(float)" + x);
        }

        public void f3(double x){
            System.out.println("f3(double)" + x);
        }


        public void f4(int x){
            System.out.println("f4(int)" + x);
        }

        public void f4(long x){
            System.out.println("f4(long)" + x);
        }

        public void f4(float x){
            System.out.println("f4(float)" + x);
        }

        public void f4(double x){
            System.out.println("f4(double)" + x);
        }


        public void f5(long x){
            System.out.println("f5(long)" + x);
        }

        public void f5(float x){
            System.out.println("f5(float)" + x);
        }

        public void f5(double x){
            System.out.println("f5(double)" + x);
        }

        public void f6(float x){
            System.out.println("f6(float)" + x);
        }

        public void f6(double x){
            System.out.println("f6(double)" + x);
        }

        public void f7(double x){
            System.out.println("f7(double)" + x);
        }



        public void testConstVal(){

                System.out.println("5: ");
                f1(5); f2(5); f3(5); f4(5);f5(5);f6(5);f7(5);


            System.out.println("");
        }


        public void testChar(){
            char x = 'x';

            System.out.println("char: ");
            f1(x); f2(x); f3(x); f4(x);f5(x);f6(x);f7(x);


            System.out.println("");
        }

        public void testByte(){
            byte x = 0;

            System.out.println("byte: ");
            f1(x); f2(x); f3(x); f4(x);f5(x);f6(x);f7(x);


            System.out.println("");
        }

        public void testShort(){
            short x = 0;

            System.out.println("short: ");
            f1(x); f2(x); f3(x); f4(x);f5(x);f6(x);f7(x);


            System.out.println("");
        }


    public void testInt(){
        int x = 0;

        System.out.println("int: ");
        f1(x); f2(x); f3(x); f4(x);f5(x);f6(x);f7(x);


        System.out.println("");
    }

    public void testLong(){
        long x = 0;

        System.out.println("long: ");
        f1(x); f2(x); f3(x); f4(x);f5(x);f6(x);f7(x);


        System.out.println("");
    }

    public void testFloat(){
        float x = 0;

        System.out.println("float: ");
        f1(x); f2(x); f3(x); f4(x);f5(x);f6(x);f7(x);


        System.out.println("");
    }

    public void testDouble(){
        double x = 0;

        System.out.println("double: ");
        f1(x); f2(x); f3(x); f4(x);f5(x);f6(x);f7(x);


        System.out.println("");
    }


    public static void main(String [] args){
        PrimitiveOverloading p = new PrimitiveOverloading();
        p.testConstVal();
        p.testChar();
        p.testByte();
        p.testShort();
        p.testInt();
        p.testLong();
        p.testFloat();
        p.testDouble();
    }




}
