
public class CrearCuenta {
	
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		Cliente cliente1 = new Cliente();
		//primeraCuenta.saldo = 1000;
		cliente1.setNombre("Pedro");
		primeraCuenta.setTitular(cliente1);
		//System.out.println(primeraCuenta.saldo);
		System.out.println(primeraCuenta.getTitular().getNombre());
		
		Cuenta segundaCuenta = new Cuenta();
		//segundaCuenta.saldo = 500;
		//System.out.println(segundaCuenta.saldo);
	}

}
