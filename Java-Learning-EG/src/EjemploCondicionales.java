
public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("Comienza");

		int edad = 16;
		int cantidad = 2;

		if (edad >= 18) {
			// sis sólo es una instrucción puedo obviar las llaves, toma sólo una línea de
			// instrucciones
			System.out.println("Usted puede entrar");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de edad pero puede entrar");
			} else {
				System.out.println("Usted no está permitido a " + "entrar");
			}

		}
		System.out.println("Benvenido");
	}

}
