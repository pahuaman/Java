/**
 * 
 *
 *
 * @author Garfia Pahua Jose G.
 * @version 1.00 2014/3/28
 */

// Practica 4 Realizar un programa que construya e imprima una serie de objetos de tipo Aceite el cual contiene origen,
//nombre, precio. De acuerdo a las siguientes restricciones:
//1. Constructor por defecto, 2. Constructor alternativo( valores ingresados por el usuario) 3. Constructor de copia.
//4. Constructor alternativo con valor calculando precio, preguntando al usuario (funcion static). 5 Salir

import java.util.Scanner;
public class Aceite 
{
	String origen, nombre;
	double precio;
	static Scanner Leer= new Scanner(System.in);
	static double iva;
	
public void Imprimir()
	{
		System.out.println("ORIGEN: " +origen);
		System.out.println("NOMBRE: " +nombre);
		System.out.println("PRECIO: " +precio);
	}
public Aceite()
	{
		origen="Soya";
		nombre="Nutrioli";
		precio=29.90;
	}

public Aceite(String origen, String nombre, double precio)
	{
	this.origen=origen;
	this.nombre=nombre;
	this.precio=precio;	
	}
	
public Aceite(Aceite x)
	{
	origen=x.origen;
	nombre=x.nombre;
	precio=x.precio;
	}
	
public Aceite(double precio, double iva)
	{
	origen="Vegetal";
	nombre="Capullo";
	this.precio=precio+iva;
	}

static double iva(double precio)
	{
	return iva=precio*.16;
	}

public static void main (String arg[])
	{
	
	Aceite a=new Aceite();
	int op;
	String nom,ori;
	double pre;
	
	do
	{
		
		System.out.println("Selecciona una opcion:\n1.Constructor por defecto\n2.Constructor Alternativo\n3.Constructor de Copia\n4.Constructor Alternativo con calculo de IVA\n5.Salir\n");
		op=Leer.nextInt();
		switch(op)
		{
		case 1:
			Aceite b=new Aceite();
			b.Imprimir();
			break;
		case 2:
			System.out.println("Ingresa el origen del aceite");
			ori=Leer.nextLine();
			ori=Leer.nextLine();
			System.out.println("Ingresa el nombre del aceite");
			nom=Leer.nextLine();
			System.out.println("Ingresa el precio del aceite");
			pre=Leer.nextDouble();
			Aceite c=new Aceite(ori,nom,pre);
			c.Imprimir();
			break;
		case 3:
			Aceite d=new Aceite(a);
			d.Imprimir();
			break;
		case 4:
			System.out.println("Ingresa el precio del aceite");
			pre=Leer.nextDouble();
			Aceite.iva(pre);
			Aceite e=new Aceite(pre,iva);
			e.Imprimir();
			break;
		}		
	}
	while (op!=5);	
	
	}


}
