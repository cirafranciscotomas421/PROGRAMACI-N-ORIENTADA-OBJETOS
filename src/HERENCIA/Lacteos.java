package HERENCIA;

import java.util.ArrayList;

public class Lacteos extends Producto{
	private String fecha_caducidad;
	private double descuento;
	public Lacteos(String nombre, int codigo, double precio, String marca, String tipo, String fecha_caducidad,
			double descuento) {
		super(nombre, codigo, precio, marca, tipo);
		this.fecha_caducidad = fecha_caducidad;
		this.descuento = descuento;
	}
	public String getFecha_caducidad() {
		return fecha_caducidad;
	}
	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public double calcular_precio(double precio,double descuento) {
	precio=getPrecio();
	descuento=getDescuento();
	return precio-descuento;
	
	}
	public String Lista_lacteos(String nombre,double descuento){
	 double descontar=0.1;
	 nombre=getNombre();
	 descuento=getDescuento();
	 if(descuento==descontar) {
		 ArrayList<String> lista1=new ArrayList<String>();
		 lista1.add(nombre);
	 //lista1.add(descuento);
		 
	}
	return nombre;
}}
