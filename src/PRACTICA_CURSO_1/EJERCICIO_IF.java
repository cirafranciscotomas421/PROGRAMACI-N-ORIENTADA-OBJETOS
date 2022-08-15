package PRACTICA_CURSO_1;

import java.util.Scanner;

public class EJERCICIO_IF {

	public static void main(String[] args) {
		   Scanner leer=new Scanner(System.in);
		   
	       String CURSO="POO";
	       System.out.println("introduce su promedio: ");
	       String promedio=leer.nextLine();
	       
	        if (Integer.parseInt(promedio)>=70 && CURSO=="POO"){
	            System.out.println("bienvenidos al curso poo");
	        }else{
	        	System.out.println("REPROBADO");}
	                

	    }
	    

	}


