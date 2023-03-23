/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CircularQueue;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
class Node {
    public String data;
    public Node next;
    
    public Node(String d){
        data = d;
    }
}
class Queue {
    
    private Node front;
    private Node rear;
    private int size;
    private int count;
    
    public Queue(int s){
        size = s;
        count = 0;
    }
    
    
    public void Enqueue(String d){

        if(!IsFull()){
            Node n = new Node(d);
            if(IsEmpty())
                front = n;           
            else
                rear.next = n;
            rear = n;
            rear.next = front;
            ++count;
        }else{
            System.out.println("Queue is Full!");
        }
    }
    
    public void Dequeue(){
        if(!IsEmpty()){
            if(front == rear){
                System.out.println("Removing Item: " + front.data);
                front = null;
                rear = null;
            }
            else{
                System.out.println("Removing Item: " + front.data);
                front = front.next;
                rear.next = front;
            }
            --count;
        }else{
            System.out.println("Queue is Empty!");
        }
    }
    
    public void Display(){
        Node temp = front;
        while(temp.next != front){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data + " ");
    }
    
    
    public boolean IsEmpty(){
        return(front == null);
    }
    
    public boolean IsFull(){
        return(count == size);
    }
    
    
}

public class circularQueue {
    private static Queue queue;

     public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\t\t\tCircular Queue\n\n");
            System.out.print("Enter Queue Size : ");
            queue = new Queue(scanner.nextInt());
            RunMenu();
    }
    
    public static void RunMenu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            int input;
            System.out.println("");
            System.out.println("");
            System.out.println("1.Add New Data to Queue");
            System.out.println("2.Remove Data from Queue");
            System.out.println("3.Display Queue");
            System.out.println("4.Exit");
            System.out.print("Enter Your Selection: ");
            input = scanner.nextInt();
            switch(input){
                case 1 : EnQ();break;
                case 2 : DeQ();break;
                case 3 : Show();break;
                case 4 : return;
                default: break;
            } 
            if(input == 5){
                break;
            }
        }
    }
    public static void EnQ(){
        System.out.print("Enter (string) Data for New Element: ");
        Scanner scanner = new Scanner(System.in);
        String Data = (scanner.next());
        queue.Enqueue(Data);
    }
    
    public static void DeQ(){
        queue.Dequeue();
    }
    
    public static void Show(){
        queue.Display();
    }
}
