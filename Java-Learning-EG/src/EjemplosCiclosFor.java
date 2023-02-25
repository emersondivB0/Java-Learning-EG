
public class EjemplosCiclosFor {
	public static void main(String[] args) {
		int total = 0;
		for (int contador = 0; contador <= 10; contador ++) {
			System.out.println(contador);
			total += contador;
		}
		System.out.println("La suma toal es: " + total);
	}

}
