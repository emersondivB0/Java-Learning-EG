
public class EjemploScope {
	public static void main(String[] args) {
		System.out.println("Comienza");
		
		/*
		 * Scope incica que las llaves son espacios cerrados, por ejemplo, si se declara
		 * una variable dentro, esta no puede ser usada fuera de sus llaves inmediatas
		 * y que Java no correrá si una variable no es inicializada con un valo, en caso que
		 * lo requiera
		 */

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
		
		/*
		 * En ese ejemplo el código no compila porque 'salario' no se inicializa fuera del ciclo
		 
		
		boolean fuePromovido = true;

        if (fuePromovido) {
            double salario = 4200.0;
        } else {
            double salario = 3800.0;
        }

        System.out.println(salario);
        */
	}

}
