/**
 * @(#)Beatles.java
 *
 * VECTOR
 * @author 
 * @version 1.00 2014/5/15
 */
 import java.util.Vector;

public class Beatles {

    //constrcuctor
    public Beatles () {

    }//constructor

    /*********** METODO PRINCIPAL ****************/
    public static void main (String[] args)     {
        Vector band = new Vector ();
        band.addElement ("Paul");
        band.addElement ("Pete");
        band.addElement ("John");
        band.addElement ("George");

        System.out.println (band);

        band.removeElement ("Pete");

        System.out.println (band);
        System.out.println ("En la posición 1 está: " + band.elementAt (1));

        band.insertElementAt ("Ringo", 2);

        System.out.println ("Tamaño de la banda: " + band.size ()); 
        for (int i = 0; i < band.size (); i++)
            System.out.print ( band.elementAt (i) + " ");
    }
}
