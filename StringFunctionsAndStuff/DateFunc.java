/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringFunctionsAndStuff;
import java.util.*;
import java.time.LocalDate;

/**
 *
 * @author Hp
 */
public class DateFunc {
    public static void main(String []args){
       Date dt = new Date();
       LocalDate date = LocalDate.now();
       System.out.println(dt);
       System.out.println(dt.toString());
       System.out.println(dt.after(dt));
       System.out.println(date.getDayOfWeek());
       System.out.println(date.getMonth());
       System.out.println(dt.getDay());
       System.out.println(dt.getYear());
       System.out.println(dt.getYear()+1900);
    } 
}
