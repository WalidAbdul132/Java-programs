/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringFunctionsAndStuff;

/**
 *
 * @author Hp
 */
public class StrFunctions {
    public static void main(String []args){
        String Str = "Manipal Academy of Higher Education";
        System.out.println(Str);
        System.out.println(Str.length());
        System.out.println(Str.isEmpty());
        System.out.println(Str.charAt(13));
        System.out.println(Str.concat(" MAHE"));
        System.out.println(Str.endsWith("ion"));
        System.out.println(Str.startsWith("Ma"));
        System.out.println(Str.toLowerCase());
        System.out.println(Str.toUpperCase());
        System.out.println(Str.trim());
        System.out.println(Str.contains("cao"));
        System.out.println(Str.indexOf("t"));
        System.out.println(Str.replace('a', 'e'));
        System.out.println(Str.replace('E','a'));
    } 
}
