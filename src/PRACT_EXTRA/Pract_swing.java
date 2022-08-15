package PRACT_EXTRA;

import javax.swing.JOptionPane;



public class Pract_swing {
//cuadro_ de_dialogo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nombre=	JOptionPane.showInputDialog("Anota tu nombre");//solo_capturar
	
String apell_pa= JOptionPane.showInputDialog("Anota tu apellido paterno");
String apell_ma=	JOptionPane.showInputDialog("Anota tu apellido materno");
JOptionPane.showMessageDialog(null, "Tu nombre y apellido es: ["+(nombre + apell_pa +apell_ma)+"]:");

	}

}
