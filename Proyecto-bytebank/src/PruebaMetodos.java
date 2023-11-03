
public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
		System.out.println(miCuenta.saldo);
		miCuenta.depositar(200);
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);
		
		Cuenta cuentaDeJimena = new Cuenta();
		
		cuentaDeJimena.depositar(1000);
		cuentaDeJimena.transferir(400, miCuenta);
		System.out.println(miCuenta.saldo);
	}

}
