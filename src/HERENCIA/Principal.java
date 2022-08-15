package HERENCIA;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bebidas crear_produc=new Bebidas("Coca cola",748932214, 13, "coca-cola", "bebida", "coca", "lata");//obtener datos de atributos
		System.out.println("Bebida");
		System.out.println("Nombre del producto: " +crear_produc.getNombre());//SE INSTANCIA PARAMETROS
		System.out.println("Marca poducto. " +crear_produc.getMarca());
		System.out.println("Sabor producto. " +crear_produc.getSabor());
		System.out.println("Código del producto: " +crear_produc.getCodigo()+"\n");
		
		
		System.out.println("Lacteos");
		Lacteos crear_lacteos=new Lacteos("crema",8715,15.3, "Lala", "crema", "18/08/2022",0.17);
		System.out.println("Nombre del producto: " +crear_lacteos.getNombre());
		System.out.println("Código del producto: "+crear_lacteos.getCodigo());
		System.out.println("Precio del producto: "+crear_lacteos.getPrecio());
		System.out.println("Marca del producto: "+crear_lacteos.getMarca());
		System.out.println("Tipo del producto: "+crear_lacteos.getTipo());
		System.out.println("Fecha de caducidad: "+crear_lacteos.getFecha_caducidad());
		System.out.println("Descuento: "+crear_lacteos.getDescuento()+"%");
		System.out.print("total a pagar=");
		System.out.println(crear_lacteos.calcular_precio(crear_lacteos.getPrecio(),crear_lacteos.getDescuento()));
		
		

	}
	
	

}
