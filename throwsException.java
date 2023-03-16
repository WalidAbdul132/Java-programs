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
class MyException extends Exception{
    MyException(String str){
        super(str);
    }
}

class Example{
    int i;
    void display() throws ArithmeticException{
       System.out.println(5/0);
    }
}
public class throwsException {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Example x = new Example();
        
        try{
          x.display();
        }
        catch(ArithmeticException e){}
    }
}
