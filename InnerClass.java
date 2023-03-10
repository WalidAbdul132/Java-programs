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
class Outer{
    int x;
    void display(){
        Inner i = new Inner();
        i.y = 220;
        System.out.println(i.y);
    };
    class Inner{
        int y;
        void show(){};
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.x = 110;
        o.display();
        System.out.println(o.x);
    }
}
