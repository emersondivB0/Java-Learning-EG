
public class Cuenta {
	
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	
	private static int total = 0;
	
	public Cuenta(int agencia) {
		if (agencia <= 0) {
			System.out.println("No se permiten 0 en agencia");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando " + total + " cuentas.");
		
	}
	
	//Vamos a definir el primer método
	//el void indica que no tiene porque retornar nada del método
	public void depositar (double saldo) {
		this.saldo += saldo;
	}
	
	public boolean retirar (double saldo) {
		if (this.saldo >= saldo) {
			this.saldo -= saldo;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir (double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	//por convención para un método para obtener valores privados se usa get al principio
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia (int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No se permiten valores negaivos para agencia.");
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	


}
