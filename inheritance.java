/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methodoverloading;

class A{
    int x;
    A(int i){
      x = i;  
    }
    void display(){}
}

class B extends A{
    int y;
    B(int k, int w){
        super(k);
        y = w;
    }
}
class C extends B{
    C(int k, int j, int w){
        super(j,k);
    }
}

/**
 *
 * @author Hp
 */
public class inheritance {
    public static void main(String[] args) {
        A a = new A(2);
        B b = new B(4,5);
        C c = new C(6, 7, 8);
        
        
        b.y = 20;
        
        System.out.println(a.x);
        System.out.println(b.x);
        System.out.println(c.x);
        System.out.println(c.y);
        
    }
}
