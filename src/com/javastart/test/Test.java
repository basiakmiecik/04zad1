package com.javastart.test;

import com.javastart.trojkat.Triangle;

public class Test {

    public boolean isRightTriangle(Triangle triangle){

        boolean wynik=false;

        int a= triangle.getBok1();
        int b= triangle.getBok2();
        int c= triangle.getBok3();

        if((a*a)==((b*b)+(c*c))) {
            wynik=true;
        }
        else if((c*c)==((a*a)+(b*b))){
            wynik=true;
        }
            else if ((b*b)==((a*a)+(c*c))){
                wynik=true;
            }

        return wynik;
    }
}
