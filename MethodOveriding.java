/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methodoverloading;
import java.util.Scanner;
/**
 *
 * @author Hp
 */

class A{
    int x;
    //final void display(){} ... use final keyword to avoid inheritance
    void display(){
        System.out.println("hello");
    }
}
class B extends A{
    int y;
    @Override
    void display(){
        super.display();
        System.out.println("good day");
    }
}



public class MethodOveriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.x = 30;
        b.x = 10;
        b.y = 20;
        b.display();
        
        System.out.println(a.x);
        System.out.println(b.x);
       
        
    }
}
