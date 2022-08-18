package RETO_O1_INTERFAZ;
import javax.swing.JOptionPane;

public class editar extends menu {
	public void guardado() {
		
	editado();
		guardado=getactualizado();
		setactualizado();
		JOptionPane.showMessageDialog(null, "editaste tus datos "+editado+"\n"+"datos actualizados: "+getactualizado());
		
		
	}

}
