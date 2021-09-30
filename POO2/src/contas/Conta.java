/**
 * POO2 - Encapsulamento
 * @author lucas.alima16
 */

package contas;

public class Conta {
	private double saldo;
	private String cliente;
	
	/**
	 * Obter o saldo
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Colocar o saldo
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * Retorna o nome 
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Conta() {
		System.out.println("Agência 0261");
	}
	
	/**
	 * exibir o saldo da conta
	 */
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
		
	}	
	
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: R$ " + valor);
	}
	
	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito: R$ " + valor);
	}
	
	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: R$ " + valor);

	}
	
	
	
	
}
	
