package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 9;
        int a=1, b=1, c;
        System.out.println(a);
        System.out.println(b);
        for(int i=2; i<=9; i++){
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}