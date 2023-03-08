
public class Administrador extends Funcionario implements Autenticable {
	
	private AutenticacionUtil util;
	
	public Administrador() {
		this.util = new AutenticacionUtil();
	}
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return this.util.iniciarSesion(clave);
	}

}
