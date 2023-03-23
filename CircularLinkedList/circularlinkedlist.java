/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CircularLinkedList;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
class Node {
    
    public String data;
    public Node next;
    
    public Node(String data){
        this.data = data;
    }
    
}
class LinkedList {
    public Node front;
    public Node rear;
    
    public void Display(){
        Node temp = front;
        while(temp.next != front){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
    }
    
    public void InsertAtFront(String data){
        Node n = new Node(data);
        if(front == null){
            front = n;
            rear = n;
            rear.next = front;
        }
        else{
            n.next = front;
            rear.next = n;
            front = n;
        }
        Display();
    }
    
    public void InsertAtEnd(String data){
        Node n = new Node(data);
        if(front == null){
            front = n;
        }
        else{
            Node currentNode = front;
            while(currentNode.next != front){
                currentNode = currentNode.next;
            }
            currentNode.next = n;
            n.next = front;
        }
        Display();
    }
    
    public void InsertAtMiddle(String data , int place){
        Node n = new Node(data);
        int i = 1;
        Node TempNode = front;
        while(i < place - 1){
            if(TempNode == null){
                System.out.println("Place is Outside from the LinkedList");
                break;
            }
            else{
                TempNode = TempNode.next;
            }
            ++i;
        }
        if(TempNode != null){
            n.next = TempNode.next;
            TempNode.next = n;
            Display();
        }
    }
    
    public void Remove(int place){
        if(place == 1){
            if(front.next == null)
                front = null;
            else
                front = front.next;
            System.out.println("Removing Item : " + front.data);
        }
        else{
            Node temp = front;
            Node prev = null;
            int i = 1;
            while(i < place){
                if(temp == null){
                    System.out.println("Place is Out of Bounds!");
                    break;
                }
                else{
                    prev = temp;
                    temp = temp.next;
                    ++i;
                }             
            }
            if(temp != null){
                System.out.println("Removing Item : " + temp.data);
                prev.next = temp.next;
            }
        }
        Display();
    }
}

public class circularlinkedlist {
    private static LinkedList list;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        System.out.print("Enter (int) Place for Remove Node: ");
        Scanner scanner = new Scanner(System.in);
        int Place = (scanner.nextInt());
        list.Remove(Place);
    }
    
    public static void DisplayList(){
        list.Display();
    }
}
