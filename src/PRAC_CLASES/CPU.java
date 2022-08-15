package PRAC_CLASES;

public class CPU {
	//asbtraccion
private String color;
private String procesadoor;
private String marca;
private String capacidad_alm;
private int Num_procesadoor;



public CPU(String color, String procesadoor, String marca, String capacidad_alm, int num_procesadoor) {
	this.color = color;
	this.procesadoor = procesadoor;
	this.marca = marca;
	this.capacidad_alm = capacidad_alm;
	this.Num_procesadoor = num_procesadoor;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getProcesadoor() {
	return procesadoor;
}
public void setProcesadoor(String procesadoor) {
	this.procesadoor = procesadoor;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getCapacidad_alm() {
	return capacidad_alm;
}
public void setCapacidad_alm(String capacidad_alm) {
	this.capacidad_alm = capacidad_alm;
}
public int getNum_procesadoor() {
	return Num_procesadoor;
}
public void setNum_procesadoor(int num_procesadoor) {
	Num_procesadoor = num_procesadoor;
}






}
