
public class Funcionario {
	
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
	
	public double getBonificacion() {
		return this.sueldo * 0.05;
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	

}
//Este código no es escalable, es complicado hacerlo crecer o mejorarlo