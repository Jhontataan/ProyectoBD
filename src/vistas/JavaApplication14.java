package vistas;


 import java.awt.*;
/*
 * Created on Mar 24, 2008
 *
 */
 
/**
 * @author Anand
 */
 
public class JavaApplication14 
{
    private Frame f;
    private Button boton1,boton2,boton3,boton4,boton5,boton6;
   private Panel blanco, azul, amarillo;
  public JavaApplication14()
    {
       f = new Frame ("Botoncitos");
       blanco = new Panel();
       
       boton1= new Button("Boton1");   
       boton2= new Button("Boton2");       
       boton3= new Button("Boton3");       
       boton4= new Button("Boton4");       
       boton5= new Button("Boton5");       
       boton6= new Button("Boton6");       

    }
  public void launchFrame() {
blanco.setSize(300, 200);
blanco.setBounds( new Rectangle( 100,75,100,75 ) );
blanco.setBackground(Color. white);
f.add(blanco);
f.setVisible(true);

azul.setSize(100,200);
azul.setBackground(Color.blue);
f.add(azul);
f.setVisible(true);

amarillo.setSize(100, 200);
amarillo.setBackground(Color.yellow);
f.add(amarillo);
f.setVisible(true);
  }
  public static void main (String args[]){
    JavaApplication14 gui = new JavaApplication14();
    gui.launchFrame();
  }
  }
 
