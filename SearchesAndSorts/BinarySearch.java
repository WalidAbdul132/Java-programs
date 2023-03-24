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
public class BinarySearch {
    public static int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\t\t\tBinary Search\n\n");
        System.out.println("Given List: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("\n\nEnter int to Search : ");
        int num = scan.nextInt();
        
        int pos = Search(1,arr.length,num);
        if(pos == -1){
            System.out.println(num + " Not Found in Array");
        }
        else{
            System.out.println(num + " Found at Position " + pos);
        }
    }
    
    public static int Search(int start , int end , int searchValue){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == searchValue){
                return mid;
            }
            if (arr[mid] > searchValue){
                System.out.println("Searching Left Half");
                end = mid -1;
                Search(start, end , searchValue);
            }
            else{
                System.out.println("Searching Right Half");
                start = mid + 1;
                Search(start , end , searchValue);
            }
        }
        return -1;
    }
}
