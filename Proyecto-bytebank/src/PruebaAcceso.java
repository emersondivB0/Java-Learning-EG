
public class PruebaAcceso {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		//salo es privada, sólo accede a través de métodos
		/*
		cuenta.saldo = -100;
		System.out.println(cuenta.saldo);
		*/
		cuenta.depositar(500);
		cuenta.retirar(100);
		//ahora si compila
		System.out.println(cuenta.getSaldo());
		cuenta.setAgencia(3);
		System.out.println(cuenta.getAgencia());
	}

}
