/**
 * @(#)ArrayList2.java
 *
 * LISTAS 
 * @author Garfia Pahua Jose G.
 * @version 1.00 2014/5/15
 */
import java.util.*;
public class ArrayList2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int n;
        do {
            System.out.println("Introduce n�meros enteros. 0 para acabar: ");
            System.out.println("Numero: ");
            n = sc.nextInt();
            if (n != 0)
                numeros.add(n);
        }while (n != 0);
       
        System.out.println("Ha introducido: " + numeros.size() + " n�meros:");
       
        //mostrar el arrayList completo
        System.out.println(numeros);
       
        //recorrido usando un iterador para mostrar un elemento por l�nea
        Iterator it = numeros.iterator();
        while(it.hasNext())
              System.out.println(it.next());
        
        //recorrido usando foreach para sumar los elementos
        double suma = 0;
        for(Integer i: numeros){
            suma = suma + i;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + suma/numeros.size());
    }
}
