
public class EjemploCondicionales2 {

	public static void main(String[] args) {
		System.out.println("Comienza");

		int edad = 19;
		int cantidadPersonas = 2;
		boolean esPareja = cantidadPersonas > 1;
		// doble | es equivalente a OR booleano
		// doble & es quevalente a AND booleano	
		// la comparación se hace con ==
		if (edad >= 18 && esPareja) {
			// si es sólo es una instrucción puedo obviar las llaves, toma sólo una línea de
			// instrucciones
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no está permitido a " + "entrar");

		}
		System.out.println("Benvenido");
	}

}
