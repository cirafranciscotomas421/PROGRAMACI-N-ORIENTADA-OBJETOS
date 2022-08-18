package reto_01;


public class principal {
	public static void main(String [] args) {
	
	menu operaciones=new implementar_menu();
	//operaciones.guardartodo("cira","21");
	operaciones.guardartodo("cira", "21");
	operaciones.editar("cira");
	operaciones.eliminar("21");
	operaciones.mostrar_datos("cira", "21");
	
	
	}
}
