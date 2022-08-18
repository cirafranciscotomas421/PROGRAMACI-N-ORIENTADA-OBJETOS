package reto_01;
import javax.swing.JOptionPane;
public interface menu {
	
	//Object guardartodo.JOptionPane =(null String nombre, String edad);
	public String guardartodo(String nombre, String edad);
	public String editar(String nombre);
	public String eliminar(String edad);
	public String mostrar_datos(String nombre, String edad);
	
}
