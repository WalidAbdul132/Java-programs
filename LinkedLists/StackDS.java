/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LinkedLists;
import java.util.Scanner;
/**
 *
 * @author Hp
 */

class Stack{
    int stack[] = new int[5];
    int top = 0;
    public void push(int data)
    {
        if(top == 5){
            System.out.println("Stack is full");
        } else {
            stack[top] = data;
            top++;
        }
    }
    
    public int pop(){
        int data = 0;
        
        if(isEmpty()){
            System.out.println("Stack is Empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }
    
    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }
    
    public boolean isEmpty(){
        return top<=0;
    }
    
    public void show(){
        for(int n : stack){
            System.out.print(n + " ");
        }
    }
}
public class StackDS {
    public static void main(String [] args){
       
        Stack nums = new Stack();
        Scanner sc = new Scanner(System.in);
        
        int choice;
        do{
        System.out.println("Choose Stack operation to be performed: ");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. View");
        System.out.println("4. Exit Program");
        choice = sc.nextInt();
        int choice2;
        int data;
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the number to be Pushed: ");
                    data = sc.nextInt();
                    nums.push(data);
                    break;
                case 2:
                    System.out.println("Pop Succesful");
                    System.out.println("Popped number: " + nums.pop());
                    break;
                case 3:
                    System.out.println("Choose Traversion Operation");
                    System.out.println("1. Show all values");
                    System.out.println("2. Show the last value");
                    choice2 = sc.nextInt();
                    switch(choice2)
                    {
                        case 1:
                            System.out.println("These are all the values in the stack");
                            nums.show();
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("This is the last value: " + nums.peek());
                            break;
                        default: 
                            System.out.println("Invalid Selection");
                            break;
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Wrong choice. Make Another choice");
                    break;
            }
        }while(choice!=4);   
    }
}
