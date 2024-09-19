
public abstract class Conta implements IConta {
	
	private static int SEQUENCIAL = 1;
	private static final int AGENCIA_PADRAO = 1;
	
	protected double saldo;
	protected String nomeUsuario;
	protected int numero;
	protected int agencia;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.numero = SEQUENCIAL ++;
		this.agencia = Conta.AGENCIA_PADRAO;
		this.cliente = cliente;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void depositar(double valor) {
		saldo+= valor;
	}
	
	public void sacar (double valor) throws ExceptionSaldoInsuficiente {
		
		if(valor > saldo) {
			throw new ExceptionSaldoInsuficiente("Saldo insuficiente!");
		}
		
		saldo-=valor;
	}
	
	public void transferir(Conta contaDestino, double valor) throws ExceptionSaldoInsuficiente {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInformacoes() {
		System.out.println("Agencia: " +this.agencia);
		System.out.println("Número da conta: " +this.numero);
		System.out.println("Nome do cliente: " + cliente.getNome());
		System.out.println("Saldo: " + this.saldo);
	}
	
	

}
