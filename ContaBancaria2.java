package entities;

public class ContaBancaria {
	private int numConta;
	private String titular;
	private double saldo = 0;
	
	
	public ContaBancaria(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	public double deposito(double valor) {
		return saldo += valor;
	}
	
	public double saque(double valor) {
		return saldo -= valor + 5;
	}
	
	
	@Override
	public String toString() {
		return "Nome do titular: " +
				titular + " \n"+
				"Número da conta: " +
				numConta + "\n" +
				"Saldo: R$ " + saldo;
	}
	
}
