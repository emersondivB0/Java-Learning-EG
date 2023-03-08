//Java trabaja todo en base a referencias
public class TestReferencias {
	
	public static void main(String[] args) {
		
		
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSueldo(2000);
		gerente.setSueldo(10000);
		
		//el elemento más generico puede ser adaptado al elemento más específico
		//se puede decir que:
		//Funcionario funcionario = new Gerente();
		//funciona porque todo gerente es funcionario, al revés no sirve
		Funcionario funcionario1 = new Gerente();
		funcionario1.setNombre("Pedro");
		funcionario1.setSueldo(10000);
		//funcionario1.setClave(); //me da error porque a pesar de que es gerente, se inició dentro de la clase funcionario
		//en cambio si uso :
		gerente.setClave("dfgdfg"); //si funciona
	}

}
