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
//"This" keyword is used to refer to the current object
class test{
    int x;
    test(int x){
        this.x = x;
    }
}
public class Example2 {
    public static void main(String[] args) {
        test t = new test(3);
        test d = new test(30);
        
        System.out.println(d.x);
        System.out.println(t.x);
    }
}
