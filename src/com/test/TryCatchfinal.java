package com.test;

public class TryCatchfinal {
    public static void main(String[] args) {
       int i = method1();

        System.out.println(i);
    }
    public static int method1() {

        try {

            return 1/0;
        }
        catch(Exception ex) {
            return 2;
        }
        finally {
            return 3;
        }
    }
}
