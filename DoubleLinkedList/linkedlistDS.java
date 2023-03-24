/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoubleLinkedList;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
class Node {
    public String data;
    public Node next;
    public Node prev;
    public Node(String data){
        this.data = data;
    }
    
}
class LinkedList {
    public Node head; 

    public void Display(){
        Node currentNode = head; 
        System.out.print("LinkedList: ");     
        while (currentNode != null) { 
            System.out.print(currentNode.data + " "); 
            currentNode = currentNode.next; 
        } 
    }
    
    public void InsertAtFront(String data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        else{
            head.prev = n;
            n.next = head;
            head = n;
        }
        Display();
    }
    
    public void InsertAtEnd(String data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        else{
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = n;
            n.prev = currentNode;
        }
        Display();
    }
    
    public void InsertAtMiddle(String data , int place){
        Node n = new Node(data);
        int i = 1;
        Node TempNode = head;
        while(i < place - 1){
            if(TempNode == null){
                System.out.println("Place is Outside from the LinkedList");
                break;
            }
            else{
                TempNode = TempNode.next;
                ++i;
            }  
        }
        if(TempNode != null){
            n.next = TempNode.next;
            n.prev = TempNode;
            TempNode.next = n;
            Display();
        }
    }
    
    public void RemoveAt(int place){
        if(place == 1){
            if(head.next == null)
                head = null;
            else
                head = head.next;
            System.out.println("Removing Item : " + head.data);
        }
        else{
            Node temp = head;
            int i = 1;
            while(i < place){
                if(temp == null){
                    System.out.println("Place is Out of Bounds!");
                    break;
                }
                else{
                    temp = temp.next;
                    ++i;
                }             
            }
            if(temp != null){
                System.out.println("Removing Item : " + temp.data);
                temp.prev.next = temp.next;
                temp =null;
            }
        }
        Display();
    }
}
public class linkedlistDS {
    static LinkedList list;
    
    public static void main(String[] args){
            System.out.println("\t\t\tLinked Link\n\n");
            list = new LinkedList();
            RunMenu();
    }
    
    public static void RunMenu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int input;
            System.out.println("");
            System.out.println("");
            System.out.println("1.Insert Node at Front");
            System.out.println("2.Insert Node at Middle");
            System.out.println("3.Insert Node at End");
            System.out.println("4.Diplay the Link List");
            System.out.println("5.Remove Node at Place");
            System.out.println("6.Exit");
            System.out.print("Enter Your Selection: ");
            input = scanner.nextInt();
            switch(input){
                case 1 : InsertAtFront();break;
                case 2 : InsertAtMiddle();break;
                case 3 : InsertAtEnd();break;
                case 4 : DisplayList();break;
                case 5 : RemoveAt();break;
                case 6 : return;
                default: break;
            } 
            if(input == 6){
                break;
            }
        }
    }
    
    public static void InsertAtFront(){
        System.out.print("Enter (String) Data for New Node: ");
        Scanner scanner = new Scanner(System.in);
        String Data = (scanner.next());
        list.InsertAtFront(Data);
    }
    
    public static void InsertAtMiddle(){
        System.out.print("Enter (String) Data for New Node: ");
        Scanner scanner = new Scanner(System.in);
        String Data = (scanner.next());
        System.out.print("Enter (int) Place for New Node: ");
        int Place = (scanner.nextInt());
        list.InsertAtMiddle(Data,Place);
    }
    
    public static void InsertAtEnd(){
        System.out.print("Enter (String) Data for New Node: ");
        Scanner scanner = new Scanner(System.in);
        String Data = (scanner.next());
        list.InsertAtEnd(Data);
    }
    
    public static void RemoveAt(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter (int) Place for Remove Node: ");
        int Place = (scanner.nextInt());
        list.RemoveAt(Place);
    }
    
    public static void DisplayList(){
        list.Display();
    }
}
