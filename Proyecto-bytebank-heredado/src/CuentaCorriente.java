
public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean retirar(double saldo) {
		// TODO Auto-generated method stub
		double comision = 0.2;
		return super.retirar(saldo + comision);
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
	}

}
