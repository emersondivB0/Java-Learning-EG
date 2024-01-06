
public class EjemploCaracteres {
	
	public static void main(String[] args) {
		
		char caracter = 'a';
		
		caracter = 65 + 1;
		System.out.println(caracter);
		
		char nuevoCaracter = (char ) (caracter + 1);
		System.out.println(nuevoCaracter);
		/* la variable char sólo acepta 1 caracter, no se declara con comillas dobles
		 también acepta números que los traduce a caracteres de la tabla ASCII
		 el String es un objeto de Java, no es una palabra reservada de Java, ni es una variable
		 primitiva.
		 Aunque se usa como tal
		*/
		
		String palabra = "Alura cursos online";
		System.out.println(palabra + "2023");
		
	}

}
