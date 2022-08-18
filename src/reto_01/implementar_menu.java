package reto_01;

import javax.swing.JOptionPane;

public class implementar_menu implements menu {

	@Override
	public String guardartodo(String nombre, String edad) {
		// TODO Auto-generated method stub
		System.out.println("datos guardados" + "\nnombre:" +nombre+ "\nedad: "+edad);
		//JOptionPane.showMessageDialog(null,"datos guardados" +"\nnnombre:" +nombre+ "\nedad:"+edad);
		return null;
	}

	@Override
	public String editar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Datos editados: "+"nombre"+nombre);
		return null;
	}

	@Override
	public String eliminar(String edad) {
		// TODO Auto-generated method stub
		System.out.println("Edad eliminada: "+edad);
		return null;
	}

	@Override
	public String mostrar_datos(String nombre, String edad) { 
		System.out.println("datos actualizados "+" Nombre: "+nombre + "  Edad: "+edad);
		return null;
	}

	
	

}
