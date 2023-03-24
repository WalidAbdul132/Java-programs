/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchesAndSorts;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\t\t\tLinear Search\n\n");
        System.out.print("Enter the List size: ");
        int arraysize = scan.nextInt();
        int[] list = new int[arraysize];
        
        for(int j = 0; j <= arraysize-1; j++){
            System.out.print("Enter an element: ");
            list[j] = scan.nextInt();
        }
        
        System.out.print("\nEnter the element for Search: ");
        int num  = scan.nextInt();
        
        for (int i = 0; i < list.length; i++) {
            if(list[i] == num){
                System.out.println("Maching with Search Element. Found at position: " + (i + 1));
                break;
            }
            else if(i == list.length - 1){
                System.out.println("Element does not Exist in the list");
            }
        }
    }
}
