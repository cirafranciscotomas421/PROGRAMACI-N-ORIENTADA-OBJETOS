package HERENCIA;


public class Bebidas extends Producto {
	
	public Bebidas(String nombre, int codigo, double precio, String marca, String tipo, String sabor,
			String presentacion) {//inicializando_constructor
		super(nombre, codigo, precio, marca, tipo);
		this.sabor = sabor;//especifica variable
		this.presentacion = presentacion;
	}

	private String sabor;
	private String presentacion;


	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	} 
	


	
}

