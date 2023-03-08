/*
 * Si vuelvo esta clase una interace no puede tener métodos implementados
 * Todos los métodos son abstractos
 */
public abstract interface Autenticable {
	
	
	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);


}
