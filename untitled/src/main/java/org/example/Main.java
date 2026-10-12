package org.example;

public class Main {
    public static void main(String[] args) {
        MyFunction myFunction=()-> {
            System.out.println("Hello, World!");
        };
        myFunction.execute();;
    }
}