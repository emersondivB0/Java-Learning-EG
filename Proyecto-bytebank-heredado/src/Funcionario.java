/*As the Funcionario class may be a general concept, we can say it's abstract
 * But abstract class can not be instanced
 * You can instance their children
 */
public abstract class Funcionario {
	
	private String nombre;
	private String documento;
	private double sueldo;
	private int tipo;
	
	public Funcionario() {
		
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
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	/* Every abstract class can get abstract methods, in this case, getBonificacion 
	 * can be an abstract method, any child class can implement by their own
	 
	public double getBonificacion() {
		return this.sueldo * 0.05;
		
	}
	Every child should implement the method, or will be an error
	 */
	public abstract double getBonificacion();
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	

}
//Este código no es escalable, es complicado hacerlo crecer o mejorarlo