/**
 * @(#)CuadroMagico.java
 *
 *
 * @author El Bender.
 * @version 1.00 2014/3/28
 */
import java.util.Scanner;
public class CuadroMagico {
        
   //constructor vacio
    public CuadroMagico() {
    }
    
    //el main de nuestro programa
    public static void main(String[] args) {
        int cuadro[][]=new  int[3][3];
        Scanner in = new Scanner(System.in);
        int x1,x2,x3,x4,x5,x6,x7,x8,i,j;
        
        System.out.print("cuadro magico\npara ganar el juego debes lograr\nque la siguiente matriz\nen sus diagonales,filas y columnas sume 15\n");
        System.out.print("solo puedes usar numeros del 1 al 9 sin repetir numeros\n");
      
       // for principal, para llenar el cuadro 
       for(i=0;i<3;i++){
         for(j=0;j<3;j++){
          System.out.print("dame los numeros: ");
           cuadro[i][j]=in.nextInt();
           }//for anidado
       }//for 
       
       //lineas para mostrar los numeros al usuario
       System.out.print("tus numeros fueron:\n");
       for(i=0;i<3;i++){
        for(j=0;j<3;j++){
         System.out.print(" "+cuadro[i][j]);
       }System.out.print("\n"); //se ponen para imprimir correctamente la matriz
     }System.out.print("\n");   //se ponen para imprimir correctamente la matriz
     
    //calcular los resultados en las filas y columnas
    x1=cuadro[0][0]+cuadro[0][1]+cuadro[0][2];
    x2=cuadro[1][0]+cuadro[1][1]+cuadro[1][2];
    x3=cuadro[2][0]+cuadro[2][1]+cuadro[2][2];

    x4=cuadro[0][0]+cuadro[1][0]+cuadro[2][0];
    x5=cuadro[0][1]+cuadro[1][1]+cuadro[2][1];
    x6=cuadro[2][0]+cuadro[2][1]+cuadro[2][2];

    x7=cuadro[0][0]+cuadro[1][1]+cuadro[2][2];
    x8=cuadro[0][2]+cuadro[1][1]+cuadro[2][0];
    
    //impresion final de numeros  
    System.out.print(" "+x1);
    System.out.print(" "+x2); 
    System.out.print(" "+x3);	
    System.out.print(" "+x4);
    System.out.print(" "+x5);
    System.out.print(" "+x6);
    System.out.print(" "+x7);
    System.out.print(" "+x8);
    System.out.println(" ");
    
    //condicion para ganar XD
    if(x1==15&& x2==15&& x3==15&& x4==15&& x5==15 &&x6==15 &&x7==15 &&x8==15)
      {
       System.out.print("\nGANASTE\n ");
      } //if
  
    else
      {
        System.out.print("\nPERDISTE\n ");
      } //else
    
     } //main  
 } //class

