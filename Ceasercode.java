/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceasercode;
import java.util.*;
/**
 *
 * @author ELCOT
 */
public class Ceasercode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
    System.out.print("Enter the string : ");
    String s = input.next();
    char str[] = s.toCharArray();
    for(int i = 0; i<=s.length()-1;i++){
    str[i]=(char)(str[i]+3);
   
    }

    for(int i = 0; i<=s.length()-1;i++){
    str[i]=Character.toUpperCase(str[i]);
    }
    System.out.println("The given string is "+s);
    System.out.print("The CaeserCode for the given string is(The position n is 3) : ");
    System.out.print(str);
    System.out.println();
    }
    
}
