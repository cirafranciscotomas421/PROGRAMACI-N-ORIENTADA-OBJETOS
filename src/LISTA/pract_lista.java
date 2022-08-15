package LISTA;

import java.util.ArrayList;

public class pract_lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista_marca_laps= new ArrayList<String>();//objetos
		lista_marca_laps.add("LENOVO");//0
		lista_marca_laps.add("HP");//1
		lista_marca_laps.add("HUAWEI");//2
		lista_marca_laps.add("DELL");//3
		System.out.println("Marcas LAPTOD" + lista_marca_laps);
		System.out.println(lista_marca_laps.get(2));
		
		System.out.println(lista_marca_laps.size());//tamaño de elementos se usa size
		
		lista_marca_laps.remove(1);//eluminar elemento
		System.out.println(lista_marca_laps);
		
		lista_marca_laps.set(2, "TOSHIBA");//nuevo elemento se usa set=ESTABLECER
		System.out.println(lista_marca_laps);
		
		for(String i: lista_marca_laps) {
			System.out.println(i);
		}
	

	}

}
