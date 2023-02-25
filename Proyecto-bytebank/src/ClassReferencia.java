
public class ClassReferencia {
	
	public static void main(String[] args) {
		//creo un cliente con la clase Clente()
		Cliente emerson = new Cliente(); 
		// le doy valores a los atributos
		emerson.nombre = "Emerson";
		emerson.telefono = "987654321";
		emerson.documento = "123456789";
		
		//creo una nueva cuenta que pertenece al mismo cliente
		Cuenta cuentaEmerson = new Cuenta();
		cuentaEmerson.agencia = 1;
		// ahora hago la referencia del objeto cuenta al objeto cliente
		cuentaEmerson.titular = emerson;
		//puedo acceder a los atributos de cliente a partir de la cuenta
		System.out.println(cuentaEmerson.titular.documento);
	}

}
