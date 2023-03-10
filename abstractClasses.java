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
abstract class A{
    int x;
    abstract void display();
}
class B extends A{
    int y;
    void display(){
        System.out.println("hello");
    }
}
class C extends A{
    int z;
    void display(){
        System.out.println("good night");
    }
}
public class abstractClasses {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        
        b.display();
        c.display();
       
    }
    
}
