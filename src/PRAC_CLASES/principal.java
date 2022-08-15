package PRAC_CLASES;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU crear_cpu=new CPU("NEGRO", "INTEL", "HP", "500 GB", 2);
		
		
		System.out.println("DATOS CPU 1:");
		System.out.println("COLOR CPU " +crear_cpu.getMarca());
		System.out.println("PROCESADOOR CPU " +crear_cpu.getProcesadoor());
		System.out.println("MARCA CPU " +crear_cpu.getMarca());
		System.out.println("CAPACIDAD ALMACENAMIENTO CPU " +crear_cpu.getCapacidad_alm());
		System.out.println("NUMERO DE PROCESADOR " +crear_cpu.getNum_procesadoor()+"\n");
		
		System.out.println("DATOS CPU 2");
		CPU cpu2=new CPU("gris", "AND", "lenovo", "256 GB", 4); //parametros
		System.out.println("MARCA CPU: " + cpu2.getMarca());//SE INSTANCIA PARAMETROS
		cpu2.setMarca("ACER");
		cpu2.setCapacidad_alm("1 TB");//SE USA SET PARA CAMBIAR NOMBRE DE PARAMETROS
		System.out.println("MARCA CPU: " + cpu2.getMarca());
		System.out.println("numero de procesadoor: "+ cpu2.getCapacidad_alm());
		
		

		
		

	}

}
