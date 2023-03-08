/*
 * Class Cuenta should be abstract too, as is a general concept, in a bank you have a lot
 * of account types, none of them is just account
 */
public abstract class Cuenta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	

	
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
		System.out.println("Se van creando " + total + " cuentas.");
		
	}
	
	//Vamos a definir el primer método
	//el void indica que no tiene porque retornar nada del método
	/*
	 * If we make Depositar() abstract, we should implement in their children too
	 */
	//public void depositar (double saldo) {
	//	this.saldo += saldo;
	//}
	
	public abstract void depositar(double valor);
	
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
			this.retirar(valor);
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

	public int getNumero() {
		return numero;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Cuenta.total = total;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	


}
