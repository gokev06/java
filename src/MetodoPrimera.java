package plantrabajo;

import javax.swing.JOptionPane;

public class MetodoPrimera {
	
	public MetodoPrimera(){
		nombre();
	}
	
	  public void nombre() {
		  String nombre1 = JOptionPane.showInputDialog("ingrese su primer nombre");
		  String nombre2 = JOptionPane.showInputDialog("ingrese su segundo nombre");
		  String apellido1 = JOptionPane.showInputDialog("ingrese su primer apellido");
		  String apellido2 = JOptionPane.showInputDialog("ingrese su segundo apellido");
		  
		  System.out.print( "hola "+nombre1+" "+nombre2+" " +apellido1+" " +apellido2);
	  }
}
