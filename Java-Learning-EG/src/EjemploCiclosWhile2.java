
public class EjemploCiclosWhile2 {

	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		while (contador <= 10) {
			
			total += contador;
			
			// contador += 1;
			contador++;
		}
		System.out.println("La suma de todos los números del 1 al 10 es: " + total);
	}

}
