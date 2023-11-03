/*
 * Currently, Client extends the Autenticable class, which is now an interface
 * and it cannot extend from an interface
 * but it can implement it, so 'extends' is replaced by 'implements'
 1* any class that implements an interface is required to implement its methods
 */
public class Cliente implements Autenticable {
	
	private String nombre;
	private String documento;
	private String telefono;
	
	private AutenticacionUtil util;
	
	
	public Cliente() {
		this.util = new AutenticacionUtil();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
