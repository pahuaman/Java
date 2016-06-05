/* @(#)ElementalHero.java */

public class ElementalHero {
	String nombre;
	String atributo;
	int nivel;
      
    public ElementalHero(String nombre,String atributo,int nivel) {
    	this.nombre   = nombre;
    	this.atributo = atributo;
    	this.nivel    = nivel;
    }//constructor
    
    //principal
    public static void main(String[] args) {
       //Creamos Heroe
       ElementalHero B = new ElementalHero("Bubbleman","Agua",4);
       System.out.println("\t\t\tMOSTRANDO HEROE ELEMENTAL\n ");
       System.out.println("Nombre del heroe: "+B.nombre);
       System.out.println("Atributo:         "+B.atributo);
       System.out.println("Nivel:            "+B.nivel+"\n");	 
       	 
   }//fin de main
}//fin de clase

