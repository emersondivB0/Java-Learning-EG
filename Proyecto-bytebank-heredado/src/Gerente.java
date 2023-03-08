
public class Gerente extends Funcionario implements Autenticable {
	//Puedo hacer lo mismo que para el Funcionario, sólo que la bonificacón es un salario
	// Mejor que crear una nueva clase repitiendo todo el código, es modificar la primera un poco
	
	@Override
	public double getBonificacion() {
		return getSueldo() + this.getSueldo()*0.05;
	
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
