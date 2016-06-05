/*
 * @(#)Album.java
 * @author Garfia pahua Jose G.
 * @version 1.00 2015/12/27
 */
import java.awt.*;
import java.awt.event.*;

public class Album extends WindowAdapter implements ActionListener {
   //variables de referencia     
   Frame Inicio, Disco, Mostrar;
   
   //frame inicio
   Label  etiqagre, eticanc;
   Button agregar, mirar;
   
   //frame discos
   Label     artista, nombreA, pistas, anio;
   TextField art, nom, pis, Texanio;
   Button    captuta, cancelar;
   
   //frame mostrar
   TextArea muestra;
   
    //constructor
    public Album() {
    	
    	//frames
    	Inicio  = new Frame("Disquera Personal");
    	Disco   = new Frame("Agregar Disco");
    	Mostrar = new Frame("Mostra Discos");
    	
    	//Labels inicio
    	etiqagre = new Label("Agregar Disco");
    	eticanc  = new Label("mostrar Discos");
    	
    	//buttons inicio
    	agregar = new Button("OK");
    	mirar   = new Button("OK");
    	
    	//Labels Disco
    	artista = new Label ("Artista");
    	nombreA = new Label ("Album");
    	pistas  = new Label ("Pistas");
    	anio    = new Label ("Año");
    	
    	//Texfields Discos
    	art     = new TextField(30);
    	nom     = new TextField(30);
    	pis     = new TextField(30);
    	Texanio = new TextField(30);
    	
    	//Buttons Discos
    	captuta  = new Button("Capturar");
    	cancelar = new Button("Cancelar");
    	
    	//TexArea
    	muestra = new TextArea(30,4); 
        
        //colores a nuestros componentes
        Inicio.setBackground(Color.white);
        Disco.setBackground(Color.white);
        art.setBackground(Color.white);
        nom.setBackground(Color.white);
        pis.setBackground(Color.white);
        Texanio.setBackground(Color.white);
        muestra.setBackground(Color.white);		
    	 	
    }//constructor
    
public void MostrarVentana(){
	
	//Creamos ventana inicio
	Inicio.setLayout(new GridLayout(2,2));
	Inicio.add(etiqagre);
	Inicio.add(agregar);
	Inicio.add(eticanc);
	Inicio.add(mirar);
	agregar.addActionListener(this);
	mirar.addActionListener(this);
	Inicio.addWindowListener(this);
	
	//dimensiones Inicio
    Inicio.setBounds(400,250,300,100);
    Inicio.setVisible(true);
    
    //Creamos ventana Disco
    Disco.setLayout(new GridLayout(5,2));
    Disco.add(artista);
    Disco.add(art);
    Disco.add(nombreA);
    Disco.add(nom);
    Disco.add(pistas);
    Disco.add(pis);
    Disco.add(anio);
    Disco.add(Texanio);
    Disco.add(captuta);
    Disco.add(cancelar);
    captuta.addActionListener(this);//oreja
    cancelar.addActionListener(this);//oreja
    Disco.addWindowListener(this);//oreja
    
    //Dimensiones Discos
    Disco.setBounds(400,300,300,200);
    Disco.setVisible(false);
    
    //Creamos ventana Mostrar
    Mostrar.setLayout(new GridLayout(1,1));
    Mostrar.add(muestra);
    Mostrar.addWindowListener(this);//oreja
    
    //dimesiones mostrar
    Mostrar.setBounds(400,300,300,400);
    Mostrar.setVisible(false);
	
	
}//mostrara ventana

public void Cacha(){
	muestra.append("Artista: "+art.getText()+"\nAlbum: "+nom.getText()+"\nPistas: "+pis.getText()+"\nAño: "+Texanio.getText()+"\n\n");
}//metodo cachar

public void actionPerformed(ActionEvent e){
  	
	if(e.getSource()== agregar){ 
		Disco.setVisible(true);	   	
  	}
  	if(e.getSource()== mirar){
  	  Mostrar.setVisible(true);
  	}
  	if(e.getSource()== captuta){
  		Cacha();
  	}
	if(e.getSource()== cancelar){
		Disco.setVisible(false);
	}
}//accion en button

public void windowClosing(WindowEvent e){
   
   if(e.getSource()==Inicio){
   	System.exit(0);
   }
   if(e.getSource()==Disco){
   	Disco.dispose();
   }
   if(e.getSource()==Mostrar){
   	Mostrar.dispose();
   }

}//metodo cerrar ventanas 

                     //************************ METODO PRINCIPAL ***************************
    public static void main(String[] args) {     
    	
    	//creamos Un Objeto
    	Album A = new Album();
    	A.MostrarVentana();
        
    }//main
}//class
