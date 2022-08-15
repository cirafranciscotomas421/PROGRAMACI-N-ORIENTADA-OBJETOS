package HERENCIA;

public class Producto {
	//abstracion
	private String nombre;//atributos
	private int codigo;
	private double precio;
	private String marca;
	private String tipo;
	
	public Producto(String nombre, int codigo, double precio, String marca, String tipo) {//constructor
		super();
		this.nombre = nombre;//se especifica variables
		this.codigo = codigo;
		this.precio = precio;
		this.marca = marca;
		this.tipo = tipo;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
