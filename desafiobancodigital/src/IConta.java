
public interface IConta {

	void transferir(Conta conta, double valor) throws ExceptionSaldoInsuficiente;
	
	void sacar  (double valor) throws ExceptionSaldoInsuficiente;
	
	void depositar(double valor);
	
	void imprimirExtrato();
		
}
