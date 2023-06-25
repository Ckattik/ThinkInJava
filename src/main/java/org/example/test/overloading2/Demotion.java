package org.example.test.overloading2;

public class Demotion {

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


    public void testDouble(){
         double x = 0;
        System.out.println("Параметр типа double : ");
        f1(x); f2((float)x); f3((long)x); f4((int)x);f5((short)x);f6((byte)x);f7((char)x);

    }

    public static void main(String [] args){
        Demotion p = new Demotion();
        p.testDouble();
    }

}
