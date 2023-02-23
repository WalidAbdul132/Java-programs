/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project1;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Project1 {

    public static void main(String[] args) {
        System.out.println("Hello this is my first program");
        System.out.println("Enter Your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Your name is : " + name);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        System.out.println("Your name is : " + i + d);
        
    }
}
