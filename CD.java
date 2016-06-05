/**
 * @(#)CD.java
 *
 *
 * @authores
 * Garfia Pahua Jose G.
 * 
 * PROBLEMA: En una tienda de discos se necesita se necesita un programa para guarda N unidades de discos de varios artistas
 *           (con su respectivo nombre,nombre del artista y precio del disco). Realizar la captura y copia de la catidad de discos
 *           con todos sus datos.  
 */

public class CD {
	
	    String disco;
	    String artista;
	    double  precio;
	    int catidad;
	
        
    
    public CD(String disco,String artista,double  precio,int catidad) {
    
	}
  public String getdisco () { return disco; }
  public String getartista () { return artista; }
  public int getcantidad () { return catidad; }
  public double  getprecio () { return precio; }
 
  public  void mostrar(){
  	System.out.print("nombre del disco: "+disco);
  	System.out.print("nombre del artista: "+artista);
  	System.out.print("precio : "+precio);
  	System.out.print("en existencia: "+catidad);
  }
   
   
   
    public static void main(String[] args) {
    	
        // TODO code application logic here
    }//main
}//clase
