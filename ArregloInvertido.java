
/**
 * @(#)ArregloInvertido.java
 *
 *
 * @author Garfia Pahua Jose g.
 * @version 1.00 2014/3/27
 */
 import java.util.Scanner;

public class ArregloInvertido {
        
    /**
     * Creates a new instance of <code>ArregloInvertido</code>.
     */
    public ArregloInvertido() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String arg[])
   {
 
     int x[],temp;
 
     int n,i,j;
     Scanner in = new Scanner(System.in);
     do{
        System.out.print("Cantidad de elementos del arreglo : ");
        n=in.nextInt();
     }while(n<=0 || n>100);
 
     x=new int [n];
 
     for(i=0; i<n;i++)
     {
       System.out.print("x["+i+"]: ");
       x[i]=in.nextInt();
     }
 
     System.out.println("Arreglo Ingresado");
     for(i=0; i<n;i++)
        System.out.println("x["+i+"]: "+x[i]);
 
     for(i=0,j=n-1;i<n/2;i++,j--)
       {
         temp=x[i];
         x[i]=x[j];
         x[j]=temp;
       }
     System.out.println("Arreglo Invertido");
     for(i=0; i<n;i++)
        System.out.println("x["+i+"]: "+x[i]);
 
   }
}
