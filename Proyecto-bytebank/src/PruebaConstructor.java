
public class PruebaConstructor {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(4);
		//cuenta.setAgencia(-5);
		
		Cuenta cuenta1 = new Cuenta(34);
		Cuenta cuenta2 = new Cuenta(67);
		
		System.out.println(cuenta.getAgencia());
	}

}
