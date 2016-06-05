/**
 * @(#)Fibonacci.java
 * @author Bender_Radio
 * @version 1.00 2015/10/18
 */
 import java.io.*;
 import java.util.*;

public class Fibonacci {
    public Fibonacci() {
    }//fin constructor
    
    public static void main(String[] args) {
    
    Scanner leer = new Scanner (System.in);
    
    System.out.println("\t\t\tBIENVENIDO ");
    System.out.println("\t\t\tFIBONACCI ");
    System.out.println("Hasta que numero quieres imprimir esta serie? ");
    
    int n = leer.nextInt(); 
    int a=0, b=1, c;
    
    
    System.out.println(b + " ");
    
    for(int i=2; i<=n; i++ )
    	{
    	
    	c = a + b;
    	
    	System.out.print(c + "\n ");
    	a = b;
    	b = c;
    	
        }//for
       
    }//main
}//class
