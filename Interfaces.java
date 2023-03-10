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
interface f1{
    public void display();
    public void area();
    public void show();
}
class A{
    int x;
    void dis(){};
}
class B extends A implements f1{
    int y;
    @Override
    public void display(){
        System.out.println("hello");
    }
    @Override
    public void area(){};
    @Override
    public void show(){};
    
}
public class Interfaces {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
