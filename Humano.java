/**
 * @(#)Humano.java
 *
 *
 * @author Bender
 * @version 1.00 2015/7/15
 */


public class Humano {

	private int edad;
	private int peso;
	private int altura;
	private String nombre;

    //constructor
    public Humano(int edad, int peso, int altura, String nombre ) {
    	this.edad = edad;
    	this.peso = peso;
    	this.altura = altura;
    	this.nombre = nombre;
    } //fin constructor

    public void asignarEdad(int edad){
    	this.edad = edad;
    }//fin de metodod

    public int obtenerEdad() {
    	return edad;
    }//fin de metodo

     public int obtenerPeso() {
    	return peso;
    }//fin de metodo

    public int obtenerAltura() {
    	return altura;
    }//fin de metodo

    public String obtenerNombre() {
    	return nombre;
    }//fin de metodo


}//fin de clase