/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchesAndSorts;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class QuickSort {
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("\t\t\tQuick Sort\n\n");
        
        System.out.print("Enter the List size: ");
        int arraysize = scan.nextInt();
        int[] arr = new int[arraysize];
        
        for(int j = 0; j <= arraysize-1; j++){
            System.out.print("Enter an element: ");
            arr[j] = scan.nextInt();
        }

        System.out.print("Before Sorting Array: ");
        for (int i = 0; i < arraysize; i++) {
            System.out.print(arr[i] + ",");
        } 
        System.out.println("");
        
        PerformQuickSort(arr, 0, arr.length - 1);
        System.out.print("After Sorting Array: ");
        for (int i = 0; i < arraysize; i++) {
            System.out.print(arr[i] + ",");
        }
        
    }
    public static int Partition (int arr[], int start, int end) { 
        int pivot = arr[end]; 
        int i = (start - 1);  

        for (int j = start; j <= end - 1; j++)  {
            if (arr[j] < pivot)  {
                i++; 
                int t = arr[i];  
                arr[i] = arr[j];  
                arr[j] = t;  
            }  
        }  
        int t = arr[i+1];  
        arr[i+1] = arr[end];  
        arr[end] = t;  
        return (i + 1);  
    }  
    
    public static void PerformQuickSort(int a[], int start, int end){
        if (start < end){  
            int p = Partition(a, start, end);
            PerformQuickSort(a, start, p - 1);  
            PerformQuickSort(a, p + 1, end);  
        }  
    }  
}
