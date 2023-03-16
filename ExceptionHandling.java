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
public class ExceptionHandling {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        
        try{
           System.out.println("The division of x and y is: " + (x/y));
           int a[] = new int[5];
            for(int i = 0; i <= 5; i++){
                a[i] = i; 
            } 
        }
        catch(ArithmeticException e){
             System.out.println("Re-enter the value of y which is non zero: ");
             y = sc.nextInt();
             if(y == 0){
                 y = 1; 
                 System.out.println("The value of y is being assigned as: " + y);
                 System.out.println("The division of x and y is: " + (x/y));
             } else {
                 System.out.println("The division of x and y is : " + (x/y));
             }   
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The values being added exceed the array size");
            System.out.println("The array is full my guy");
        }
        finally{
            System.out.println("This is the end of the program");
        }
    }
}
