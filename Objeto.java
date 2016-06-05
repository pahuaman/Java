/**
 * @(#)Objeto.java
 *
 *
 * @author Bender
 * @version 1.00 2015/7/15
 */


//clase objeto
public class Objeto {
    //constructor
    public Objeto() {
    }

    //metodo principal
    public static void main(String[] args) {

     Humano H = new Humano(17,10,5,"Carlos");
     Humano R = new Humano(23,70,2,"Yashiro");

     System.out.println("mi nombre: "+H.obtenerNombre());
     System.out.println("mi Edad: "+H.obtenerEdad());
     System.out.println("mi peso: "+H.obtenerPeso());
     System.out.println("mi Altura: "+H.obtenerAltura());

     H.asignarEdad(90);
     System.out.println("mi Edad: \n"+H.obtenerEdad());
     
     System.out.println("");
     
     System.out.println("\tmi nombre: "+R.obtenerNombre()+" sin apellido GAY");
     System.out.println("\tmi Edad: "+R.obtenerEdad()+" años");
     System.out.println("\tmi peso: "+R.obtenerPeso()+" kilos");
     System.out.println("\tmi Altura: "+R.obtenerAltura()+" metros\n");


    }//fin main
}//fin de clase