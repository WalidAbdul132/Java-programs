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
class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}
class Stack{
    public Node head;
    public Node top;
    public int Size;
    public int Count;
    
    public Stack(int size){
        this.Size = size;
        Count = 0;
    }
    
    public void Push(int data){
        if(!IsFull()){
            Node n = new Node(data);
            if(IsEmpty()){
                head = n;
                top = n;
            }
            else{
                top.next = n;
                top = n;
            }
            ++Count;
        }
        else{
            System.out.println("Stack Overflowing!");
        }
    }
    
    public void Pop(){
        if(!IsEmpty()){
            Node TempNode = head;
            if(TempNode.next == null){
                System.out.println("Poping : " + TempNode.data);
                head = null;
                Count = 0;
            }
            else{
                while(TempNode.next != top){
                    TempNode = TempNode.next;
                }
                System.out.println("Poping : " + TempNode.next.data);
                TempNode.next = null;
                top = TempNode;
                --Count;
            }
        }
        else{
            System.out.println("Stack Underflow!");
        }
    }
    
    public void Display(){
        if(IsEmpty()){
            System.out.println("Stack is Empty!");
        }
        else{
            Node currentNode = head; 
            System.out.print("LinkedList: ");     
            while (currentNode != null) { 
                System.out.print(currentNode.data + " "); 
                currentNode = currentNode.next; 
            } 
        }
    }
    
    private boolean IsEmpty(){
        return (head == null);
    }
    
    private boolean IsFull(){
        return (Count == Size);
    }
    
    public void peek(){
        int data;
        data = top.data;
        System.out.println("This is the last value: " + data);
    }
}


public class StackLinkedList {
    
    private static Stack stack;
    
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Stack Data Structure");
            System.out.println("-------------------------------------------");
            System.out.print("Enter Stack Size : ");
            stack = new Stack(sc.nextInt());
            RunMenu();
    }
    public static void RunMenu(){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
        System.out.println();
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
                    Push();
                    break;
                case 2:
                    Pop();
                    break;
                case 3:
                    System.out.println("Choose Traversion Operation");
                    System.out.println("1. Show all values");
                    System.out.println("2. Show the last value");
                    choice2 = sc.nextInt();
                    switch(choice2)
                    {
                        case 1:
                            Display();
                            break;
                        case 2:
                            Peek();
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
    public static void Push(){
        System.out.print("Enter the number to be Pushed: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        stack.Push(data);
    }
    public static void Pop(){
        stack.Pop();
    }
    public static void Display(){
        stack.Display();
    }
    public static void Peek(){
        stack.peek();
    }
    
}
