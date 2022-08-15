package PRACTICA_CURSO_1;

import java.util.Scanner;

public class ENTRADA_SALIDA_DE_DATOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura_datos=new Scanner(System.in);
		double numero1,numero2,suma;
		System.out.println("Anota numero 1: ");
		numero1=captura_datos.nextDouble();
		//string=captura_datos.nextLine();
		System.out.print("Anota numero 2:");
		numero2=captura_datos.nextDouble();
		//string=captura_datos.nextLine();
		suma=numero1+numero2;
		//int suma=Integer.parseInt(numero1)+Integer.parseInt(numero2);
			       
		System.out.println("la suma es "+suma);
			  
	}
	}
