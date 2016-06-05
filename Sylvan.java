/* @(#)Sylvan.java  */

public class Sylvan { 
    String Nombre, Atributo;
    int Nivel;   
    	 
    public Sylvan(String Nombre,String Atributo,int Nivel) {
    	this.Nombre   = Nombre;
    	this.Atributo = Atributo;
    	this.Nivel    = Nivel;
    }//Constructor
   
    //Clase principal
    public static void main(String[] args) {
    	//Creamos Sylvan
        Sylvan T = new Sylvan("Sylvan Hermitree","Fuego",8);
        System.out.println("\t\t\tMOSTRANDO SYLVAN\n ");
        System.out.println("Nombre del monstruo: "+T.Nombre);
        System.out.println("Atributo:            "+T.Atributo);
        System.out.println("Nivel:               "+T.Nivel+"\n");
        
    }//Main
}//Class
