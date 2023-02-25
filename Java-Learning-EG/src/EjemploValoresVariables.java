
public class EjemploValoresVariables {
	
	public static void main(String[] args) {
		int numero1 = 5;
		int numero2 = 9;
		
		System.out.println(numero2);
		
		numero2 = numero1;
		System.out.println(numero2);
		
		numero1 = 11;
		System.out.println(numero2);
		/* Java no trabaja con punteros o pointers, por lo que almacena los valores en memoria sin link
		 * por eso, sigue valiendo 5 aunque numero1 cambie de valor luego. */
		
	}

}
