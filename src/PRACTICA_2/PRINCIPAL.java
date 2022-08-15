package PRACTICA_2;

public class PRINCIPAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DATOS DE LOLA");
		PERSONA cap_datos=new PERSONA("LOLA",34,1.45, 45 );
		System.out.println("NOMBRE=  " + cap_datos.getNombre());
		System.out.println("EDAD= " + cap_datos.getEdad()+"AÑOS");
		System.out.println("ESTATURA= " +cap_datos.getEstatura()+"METROS");
		System.out.println("PESO= "+cap_datos.peso + "KG\n");

		System.out.println("DATOS DE FERNANDO");
		PERSONA PERSONA2=new PERSONA("FERNANDO", 24, 1.70, 48.7);
		System.out.println("NOMBRE=  " + PERSONA2.getNombre());
		PERSONA2.setEdad(18);
		System.out.println("EDAD= " + PERSONA2.getEdad()+"AÑOS");
		System.out.println("ESTATURA= " +PERSONA2.getEstatura()+"METROS");
		System.out.println("PESO= "+PERSONA2.peso + "KG");
	}

}
