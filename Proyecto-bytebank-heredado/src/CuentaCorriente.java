
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

}
