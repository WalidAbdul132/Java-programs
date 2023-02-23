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
class faculty{
    int eid;
    String name;
    String des;
    double sal;
    
    faculty(int i){
        eid = i;
    }
    faculty(int i, String n){
        eid = i;
        name = n;
    }
}
public class Constructor {
    public static void main(String[] args) {
        faculty f = new faculty(20);
        faculty f1 = new faculty(20,"Walid");
        System.out.println(f1.eid + " " + f1.name);
    }
}
