/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
class testMethods{
    double l;
    double b;
    double h;
    double r;
    
    void areaOfCircle(){
        System.out.println("the area of a circle is : " + 3.14 * r * r);
    }
    void areaOfCircle1(double r1){
        System.out.println("the area of a circle is : " + 3.14 * r1 * r1);
    }
    void areaOfRectangle(double l1, double l2){
        System.out.println("the area of a Rectangle is : " + l1 * l2);
    }
    double areaOfT(double t1, double b1, double h1){
        return (t1 * b1 * h1);
    }
}
public class Methods {
    public static void main(String[] args) {
        testMethods t = new testMethods();
        t.r = 4.5;
        t.l = 4.4;
        t.b = 4.2;
        t.h = 3.1;
        t.areaOfCircle();
        t.areaOfCircle1(3.5);
        t.areaOfRectangle(t.l, t.b);
        System.out.println("Area of a T is: " + t.areaOfT(t.l, t.b, t.h));
        
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */


