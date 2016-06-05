/**
 * @(#)ConversionTemperatura.java
 *
 *
 * @author
 * @version 1.00 2014/2/28
 */

import java.util.*;
public class ConversionTemperatura {

    public static void main(String[] args) {
        int a,c=0;
        float cent,far;
        Scanner s=new Scanner(System.in);
   do
 {
 	    System.out.println("conversion de tyemperatura");
        System.out.println("quieres convertir de:");
       System.out.println("1.centigrados a farenheit");
        System.out.println("2.farenheit a centigrados");
        System.out.println("3.salir");

        a=s.nextInt();
    switch(a)
     {
     	case 1:System.out.println("ingrese los grados centigrados");
     	       cent=s.nextFloat();
     	       far=(cent*1.8f)+32;
     	       System.out.println("los grados son = "+far);
     	       break;

     	case 2:System.out.println("ingrese los grados farenheit");
     	       far=s.nextFloat();
     	       cent=(far-32)/1.8f;
     	       System.out.println("los grados son ="+cent);
     	       break;

        case 3: c=1;
               System.out.println("adios");
               break;
         }


      }while(c==0);
    }//main


}