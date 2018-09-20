package com.javastart.check;

import com.javastart.test.Test;
import com.javastart.trojkat.Triangle;

import java.util.Scanner;

public class TrojkatTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj dlugosci bokow wybanego trojkata:");
        int A= scanner.nextInt();
        scanner.nextLine();
        int B=scanner.nextInt();
        scanner.nextLine();
        int C=scanner.nextInt();
        scanner.nextLine();

        Triangle triangle= new Triangle(A,B,C);
        Test test= new Test();
        if (test.isRightTriangle(triangle)==true){ System.out.println("Trojkat jest prostokatny");
        }else{ System.out.println("Trojkat nie jest prostokatny"); }




    }
}
