/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.methodoverloading;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
class TestOverloading{
    int x;
    int j;
    
    void display(){
        System.out.println("hello overloading");
    }
    void display( int x ){
        System.out.println(x);
    }
    void display(int x, int y){
        System.out.println(x + y);
    }
    void display(int x, double y){
        System.out.println(x + y);
    }
    void display( double x, double y){
        System.out.println(x + y);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        TestOverloading t = new TestOverloading();
        TestOverloading d;
        d = t;
        t.x = 15;
        System.out.println(d.x);
        
        t.display();
        t.display(5);
        t.display(5, 6);
        t.display(9, 10.2);
        t.display(3.2, 5.3);
   
    }
}
