package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int x = s.nextInt();
        int a=1, b=1, c;
        System.out.println(a);
        System.out.println(b);
        for(int i=2; i<=x; i++){
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}