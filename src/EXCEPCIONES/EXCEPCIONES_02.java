package EXCEPCIONES;

import javax.swing.JOptionPane;

public class EXCEPCIONES_02 {//division_entre_cero
		
		public static int numerador = 10;
		public static Integer denominador = 0;
		public static float division;
		public static void main(String[] args) {
			System.out.println("ANTES DE HACER LA DIVISION");
			try {
				division = numerador / denominador ;
			}catch(ArithmeticException ex) {
				division = 0;//si hay una excepcion da valor a "0" al atributo  "division"
				JOptionPane.showInputDialog("Error: " +ex.getMessage());
			}finally {
				JOptionPane.showInputDialog("División: "+division);
				JOptionPane.showInputDialog("DESPUES DE HACER LA DIVISIÓN ");
			}
		}}


