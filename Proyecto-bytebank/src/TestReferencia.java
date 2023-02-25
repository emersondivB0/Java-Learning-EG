
public class TestReferencia {
	
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 3500;
		
		System.out.println(primeraCuenta.saldo);
	}

}
