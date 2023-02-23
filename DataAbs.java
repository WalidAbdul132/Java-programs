/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
class Student{
    int slcm;
    String name;
    String prog;
    int dob;
    double cgpa;
    static int c = 0;
    static int date; //static class, is a global variable and can be assed with just the name of the class
    
    int ageCalc(){
        return date - dob;
    }
    static int countStud(){
        return c = c + 1;
    }
}
public class DataAbs {
    static{
        System.out.println("Welcome to my first program");
        int y = 1000;
        System.out.println(y);
    }
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(Student.countStud());
        Student s1 = new Student();
        System.out.println(Student.countStud());
        Student s2 = new Student();
        System.out.println(Student.countStud());
        s.slcm = 111;
        s.name = "Walid";
        s.prog = "MSC";
        s.dob = 2001;
        s.cgpa = 3.5;
        Student.date = 2023;
        System.out.println("Your age is : " + s.ageCalc());
        
    }
}
