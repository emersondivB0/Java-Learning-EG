
public class PruebaEncapsulamiento {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Ramón");
		cliente.setDocumento("kjghk");
		
		cuenta.setTitular(cliente);
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
		
	}

}
