/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.*;
/**
 *
 * @author Rohit
 */
public class Calculator {

    
public static void main(String[] args) {
System.out.println("Type two words");
Scanner kbd= new Scanner (System.in);
    String i= kbd.next();
    String j=kbd.next();
System.out.println(getShortest(i , j));
}

public static String getShortest(String i, String j) {
    if (i.length() > j.length()) {
        String b= j + " " + i;
        return b;
    }
    else {
        String b= i + " " + j;
        return b;
    }
    
}
}


 

