/**
 * @(#)Congreso.java
 *
 *
 * @author Garfia Pahua José G.
 * @version 1.00
 */

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

public class Congreso  extends WindowAdapter implements ActionListener {
    
    //variable de referencia
    Frame      menu,m;
    TextArea  invitados;
    Button     guardar, mostrar;
    JLabel     nombre, apellido;
    JTextField tex1, tex2;
    //JScrollBar Barra;

  //constructor
  public Congreso() {
    	
    	//construimos nuestra ventana DUUU!
    	menu      = new Frame("Comgreso");
    	m         = new Frame("Lista De Invitados");
    	invitados = new TextArea(30,4);
    	guardar   = new Button("Registrar");
    	mostrar   = new Button("Mostrar");
    	nombre    = new JLabel("Nombre");
    	apellido  = new JLabel("Apellido");
    	tex1      = new JTextField(30);
    	tex2      = new JTextField(30);

 }//constructor

  //metodo para mostrar nuestras ventanas
  public void mostrarMarco(){
    	
    	//agregamos los componentes a nuestra ventana menu
    	menu.setLayout(new GridLayout(3,2));
    	menu.add(nombre);
    	menu.add(tex1);
    	menu.add(apellido);
    	menu.add(tex2);
    	menu.add(guardar);
    	menu.add(mostrar);
    	guardar.addActionListener(this);//accion en button
    	mostrar.addActionListener(this);//accion en button

        //damos dimensiones a nuestra ventana menu
        menu.setBounds(400,250,300,100);
    	menu.setResizable(false);
    	menu.setVisible(true);
    	menu.addWindowListener(this);//oreja ventana

    	//damos dimensiones y agregamos componentes a nuestra ventana mostrar
    	m.setLayout(new GridLayout(1,1));
    	m.add(invitados);
    	m.setBounds(400,250,300,200);
    	m.setResizable(false);
    	m.setVisible(false);
    	m.addWindowListener(this);//oreja ventana

}//metodo mostrar

  //metodo para capturar nombre y apellido
  public void actionPerformed(ActionEvent e){

  	if(e.getSource()== guardar){
       captura();//función capturar
  	}//fin button guardar
  	
  	else if(e.getSource()== mostrar){
           m.setVisible(true);//hacer visible la ventana mostrar
    } //fin button mostrar

}//accion en button

  //metodo para capturar datos
  public void captura(){

  	invitados.append("Nombre: "+tex1.getText()+"\nApellido: "+tex2.getText()+"\n\n");

}//capturar datos

  //metodo para abrir y cerrar ventanas
  public void windowClosing(WindowEvent e){
    
   if(e.getSource()== menu){
   	  System.exit(0); //es para cerrar toda la aplicación
   }//if
   
   if(e.getSource()== m){
   	  m.dispose(); //cerramos ventana mostrar
   }//if

}//metodo cerrar ventanas

  //Principal *.*
  public static void main(String[] args) {
    	
    	//creación de objetos
    	Congreso C = new Congreso();
        C.mostrarMarco();

    }//principal
    
}//clase congreso



