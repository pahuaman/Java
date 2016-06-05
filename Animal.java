/**
 * @(#)Animal.java
 *
 *
 * @author Garfia pahua jose g.
 * @version 1.00 2014/3/28
 */

public class Animal {
/**

* Metodo de la clase base

*/

public void doSound(){

System.out.println("brrrr");

}  

 

public static void main(String[] args){

new Cat().doSound();

}  

}

 class Cat extends Animal {
/**
* Metodo sobrescrito (override)
*/

public void doSound() {

super.doSound();

System.out.println("meow");
} 
        
    
}  




