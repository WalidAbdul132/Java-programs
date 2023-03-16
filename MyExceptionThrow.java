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
public class MyExceptionThrow {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        
        try{
            if(x < 10){
            throw new MyException("What a clown");
            } else {
                System.out.println(x);
            }
        }
        catch(MyException e){
            System.out.println(e);
        }
        
    }
}
