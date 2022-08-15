package PRACTICA_CURSO_1;

import java.util.Scanner;

public class SENTENCIA_IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		int edad;
		System.err.println("introduzca tu edad");
		edad=leer.nextInt();
		if(edad>=18 ) {
			System.out.println("Mayor de edad");
		}else {
			System.out.println("Menor de edad");
		}
	}

}
