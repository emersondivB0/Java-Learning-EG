
public class TestFuncionario {
	
	public static void main(String[] args) {
		//Funcionario diego = new Funcionario(); this line doesn't work anymore if the class is abstract
		Funcionario diego = new Contador();
		diego.setDocumento("dgdshdjDGH");
		diego.setNombre("Diego");
		diego.setSueldo(2000);
		//diego.setTipo(0);
		
		//como la clase Geerente se extiende de Funcionario, tiene los mismos atributos y métodos
		Gerente gerente = new Gerente();
		gerente.setNombre("Pe");
		gerente.setDocumento("gdsfhsghgf");
		gerente.setSueldo(6000);
		//gerente.setTipo(1);
		gerente.setClave("AluraCursosOnline");
		
		
		
		System.out.println(diego.getSueldo());
		System.out.println(diego.getBonificacion());
		System.out.println(gerente.getSueldo());
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
	}

}
