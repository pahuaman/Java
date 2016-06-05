/**
 * @(#)Euler.java
 *
 * como calcular el número euler en java
 * @author BenderRadio
 * @version 1.00 2015/8/4
 */

public class Euler {

    //constructor vacio :(
    public Euler() {
    }

    //metodos para calcular el factorial
    public static long Factorial(int x){
    	long temp = 1;
    	for(int i=1; i<x; i++){
    		temp = temp * i;
    	}//fin de for
    	return temp;
    }//fin de metodo

    public static double Euler(){
    	double e = 0;
    	for(int i=1; i<50; i++){
    		e = e + 1 / (double) (Factorial(i));
    	}//fin de for
    	return e;
    }//fin de metodo

    public static void main(String[] args) {

        System.out.println("Euler = "+Euler());

    }//main
}//class
