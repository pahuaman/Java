/**
 * @(#)FiguraGeometrica.java
 *
 *
 * @author garfia pahua jose g.
 * @version 1.00 2014/3/7
 */
import java.util.*;
public class FiguraGeometrica {

    /**
     * Creates a new instance of <code>FiguraGeometrica</code>.
     */
    public FiguraGeometrica() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    	int a,l,r,b,z,x,t,y,q,c=0;
    	double j,h;

do
 {
 	    System.out.println("figuras geometricas");
        System.out.println("de que figura quieres calcular el area?");
        System.out.println("1.un cuadrado");
        System.out.println("2.un rectangulo");
        System.out.println("3.un triangulo");
        System.out.println("4.un circulo");
        System.out.println("5.salir");
        a=s.nextInt();
        switch(a)
        	{
        		case 1:System.out.println("dame el lado del cuadrado");
        		       l=s.nextInt();
        		       r=l*l;
        		       System.out.println("el are del cuadrado es "+r);
        		       break;
        		case 2: System.out.println("dame la base");
        		       b=s.nextInt();
        		       System.out.println("dame la altura");
        		       z=s.nextInt();
        		       x=b*z;
        		       System.out.println("el area del rectangula es "+x);
        		       break;
        		 case 3: System.out.println("dame la base");
        		        t=s.nextInt();
        		        System.out.println("dame la altura");
        		        y=s.nextInt();
        		        q=(t*y)/2;
        		        System.out.println("el area es: "+q);
        		        break;
        		 case 4: System.out.println("dame el valor del radio");
        		         j=s.nextFloat();
        		         h=(j*j)*3.1415f;
        		         System.out.println("el area del circulo es: "+h);
        		         break;
        		 case 5: c=1;
        		        System.out.println("adios");
                        break;


        }


  }while(c==0);


    }
}
