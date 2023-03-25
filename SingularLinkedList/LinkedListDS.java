/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingularLinkedList;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
class Node{
    int data;
    Node next;
}
class LinkedList{
    Node head;
    
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null)
        {
            head = node;
        } else {
            Node n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    
    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    
     public void insertAt(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        
        if(index == 0){
            insertAtStart(data);
        } else {
        Node n = head;
        for(int i = 0; i<index-1; i++)
        {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
        }
    }
    public void traverse(int index){
        Node n = head;
        for(int i = 0; i<index-1; i++)
        {
            n = n.next;
        }
        System.out.println(n.data);
    }
     
    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for(int i = 0; i<index-1; i++)
            {
                n = n.next;
            } 
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }
     
    public void show()
    {
        Node node = head;
        
        while(node.next!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

public class LinkedListDS {
    public static void main(String [] args){
        //new linked list
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        
        //switch case statement
        int choice;
        do{
        System.out.println("Choose operation to be performed: ");
        System.out.println("1. Insertion");
        System.out.println("2. Travesing");
        System.out.println("3. Deletion");
        System.out.println("4. Exit program");
        choice = sc.nextInt();
        int choice2;
            switch(choice)
            {
                case 1:
                    System.out.println("Choose where to insert: ");
                    System.out.println("1. At the start");
                    System.out.println("2. At the end");
                    System.out.println("3. At a specific point");
                    choice2 = sc.nextInt();
                    int data;
                    switch(choice2)
                    {
                        case 1:
                            System.out.println("Enter Value to be inserted at the start: ");
                            data = sc.nextInt();
                            list.insertAtStart(data);
                            break;
                        case 2:
                            System.out.println("Enter Value to be inserted at the end: ");
                            data = sc.nextInt();
                            list.insert(data);
                            break;
                        case 3:
                            System.out.println("Enter Value to be inserted: ");
                            data = sc.nextInt();
                            System.out.println("Enter the position: ");
                            int index = sc.nextInt();
                            list.insertAt(index, data);
                        break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Choose Traversion Operation");
                    System.out.println("1. Show all values");
                    System.out.println("2. Show a value at a particular location");
                    choice2 = sc.nextInt();
                    switch(choice2)
                    {
                        case 1:
                            System.out.println("This are all the values:");
                            list.show();
                            break;
                        case 2:
                            System.out.println("Choose the index to be displayed:");
                            int index = sc.nextInt();
                            list.traverse(index);
                            break;
                        default:
                            System.out.println("invalid choice.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("These are the values");
                    list.show();
                    System.out.println("Choose the index to delete from");
                    int index = sc.nextInt();
                    list.deleteAt(index);
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
