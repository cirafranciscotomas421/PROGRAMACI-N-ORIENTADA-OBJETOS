package PRACTICA_2;

public class PERSONA {
public String nombre;
public int edad;
public double estatura;
public double peso;



public PERSONA(String nombre, int edad, double estatura, double peso) {
	this.nombre = nombre;
	this.edad = edad;
	this.estatura = estatura;
	this.peso = peso;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public double getEstatura() {
	return estatura;
}
public void setEstatura(double estatura) {
	this.estatura = estatura;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}







}
