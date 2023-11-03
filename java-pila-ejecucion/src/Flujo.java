
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Iniciomain");
		metodo1();
		System.out.println("Fin de main");
	}

	public static void metodo1() {
		System.out.println("Inicio metodo1");
		try {
			metodo2();
		} catch(MiException me) {
			me.printStackTrace();
		}
		System.out.println("Fin metodo1");
	}

	public static void metodo2() {
		System.out.println("Inicio metodo2");
		//ArithmeticException ae = new ArithmeticException();
		//throw ae;
		// sólo se puede hacer throw de excepciones
		throw new MiException("Mi excepción fue lanzada");
		//System.out.println("Fin metodo2");
	}

}
