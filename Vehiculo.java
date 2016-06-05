
public class Vehiculo {
    protected String color;
    protected int ruedas;
    protected int puertas;

    //encapsulamiento
    protected String Patente;


    //constructor
    public Vehiculo(String color, int ruedas, int puertas ) {
    	this.color = color;
    	this.ruedas = ruedas;
    	this.puertas = puertas;
    	}

   //polimorfismo ********
   public Vehiculo(){
   	this.color = "verde";
   	this.ruedas = 4;
   	this.puertas = 105;
   }

   //familia metodos gets
   public int ObtenerRuedas(){
   	return ruedas;
   }

   public int ObtenerPuertas(){
   	return puertas;
   }

   public String ObtenerColor(){
   	return color;
   }
   //fin metodos obtener

   //principal
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("rojo",4,4);
        Vehiculo v2 = new Vehiculo();

        //objeto de clase Auto
        Auto A = new Auto();

       /* System.out.println("Constructor con parametros: ");
        System.out.println("Color:   "+v.ObtenerColor());
        System.out.println("Puertas: "+v.ObtenerPuertas());
        System.out.println("Ruedas:  "+v.ObtenerRuedas());

        System.out.println("");
        System.out.println("Constructor sin parametros: ");
        System.out.println("Color:   "+v2.ObtenerColor());
        System.out.println("Puertas: "+v2.ObtenerPuertas());
        System.out.println("Ruedas:  "+v2.ObtenerRuedas());*/

         System.out.println("Color de auto: "+A.ObtenerColor());
    }//main
}//fin de clase


