package RETO_O1_INTERFAZ;

import javax.swing.JOptionPane;

public abstract class menu {
	protected String guardado,guardar, editado, eliminado, mostrar_dato;
	private static String actualizado;
	
	public void Operaciones() {
		int opc = 0;
		int op = 0;
		do {
			do {
				opc = Integer.parseInt(JOptionPane
						.showInputDialog("Porfavor seleccione una opcion:" + "\n" + "[1].-GUARDAR TODO" + "\n"
								+ "[2].-EDITAR" + "\n" + "[3].-ELIMINAR" + "\n" + "[4].-MOSTRAR DATOS" + "\n" 
								+ "[5].-SALIR"

						));
				if (opc>= 1 && opc <= 5) {
					op = 1;
				} else {
					JOptionPane.showMessageDialog(null, "Opcion no encontrada");
				}
			} while (op == 0); //para que vuelva a retonar
			
			switch (opc) { //se crea las opciones
			case 1: //guardar todo
				menu creando_guardado= new guardar_todo();
				creando_guardado.guardado();
				break;
				
			case 2: //editar
				menu creando_editacion= new editar();
				creando_editacion.guardado();
				
				break;
				
			case 3://eliminar
			menu creando_eliminacion= new eliminar();
				creando_eliminacion.guardado();
				break;
			case 4://mostrar datos
				menu creando_mostrar= new mostrar_datos();
				creando_mostrar.guardado();
				break;
				
			case 5://salir
				JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
				op=2;
				break;

			}

		} while (op != 2);
	}
	
	public void guardar() {
	guardar = (JOptionPane.showInputDialog(null,"Datos guardados: "));
}

	public void editado() {
	editado =(JOptionPane.showInputDialog(null,"¿desea editar sus datos?"));
	
}
	public void eliminado() {
		eliminado =(JOptionPane.showInputDialog(null,"¿desea eluminar datos?"));
	}
	public void mostrar_dato() {
		mostrar_dato =(JOptionPane.showInputDialog(null,"mostrar datos"));
	}
	public abstract void guardado();//es de tipo asbstract sig que se va sobreescribir

	public static String getactualizado() {
	return actualizado;
}

	public static void setactualizado() {
	menu.actualizado=actualizado;
} 

}
