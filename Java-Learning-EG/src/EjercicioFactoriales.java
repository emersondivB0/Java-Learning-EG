
public class EjercicioFactoriales {
	
	public static void main(String[] args) {

		for (int contador = 1; contador <= 10; contador++) {
			int factorial = contador;
			for (int multiplicador = 1; multiplicador < contador; multiplicador++) {
				factorial *= multiplicador;				
			}
			System.out.println("El factorial de " + contador + " = " + factorial);
			System.out.println();
		}
	}

}
