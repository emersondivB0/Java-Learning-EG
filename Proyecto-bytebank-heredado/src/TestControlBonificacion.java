
public class TestControlBonificacion {
	
	public static void main(String[] args) {
		Funcionario diego = new Gerente();
		diego.setSueldo(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSueldo(10000);
		
		Contador alexiz = new Contador();
		alexiz.setSueldo(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexiz);
		
	}

}
