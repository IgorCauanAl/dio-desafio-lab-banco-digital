
public class app {
	public static void main(String[] args) {
	
	Banco bancoBradesco = new Banco();
	
	Cliente cliente1 = new Cliente("Igor");
	
	Cliente cliente2 = new Cliente("Fernando");
	
	ContaCorrente correnteCliente1 = new ContaCorrente(cliente1);
	ContaPoupança poupancaCliente2 = new ContaPoupança(cliente2);
	
	bancoBradesco.adicionarConta(correnteCliente1);
	bancoBradesco.adicionarConta(poupancaCliente2);
	
	correnteCliente1.depositar(500);
	poupancaCliente2.depositar(1000);
	
	correnteCliente1.imprimirExtrato();
	poupancaCliente2.imprimirExtrato();
	
	try {
		correnteCliente1.transferir(poupancaCliente2, 500);
	}catch(ExceptionSaldoInsuficiente e) {
		System.out.println(e.getMessage());
	}
	
	
	correnteCliente1.imprimirExtrato();
	
	
}
}
