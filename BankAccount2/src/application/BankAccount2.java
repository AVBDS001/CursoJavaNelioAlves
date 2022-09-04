package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
		int numConta = sc.nextInt();
		System.out.println();
		
		sc.nextLine();
		
		System.out.print("Digite o nome do titular da conta: ");
		String titular = sc.nextLine();
		System.out.println();
		
		System.out.println("Deseja fazer algum deposito inicial? (Aperte S --> Sim / Aperte N --> Não)");
		char escolha = sc.next().charAt(0);
		
		double valor;
		ContaBancaria conta = new ContaBancaria(numConta, titular);
		if (escolha == 'S') {
			System.out.print("Digite o valor do deposito inical que você deseja colocar na conta: ");
			valor = sc.nextDouble();
			System.out.println();
			
			System.out.println("Cliente depositou: R$ "+ String.format("%.2f", conta.deposito(valor)));
			System.out.println();
		}
		else {
			System.out.println("Cliente não optou por fazer nenhum depósito inicial");
		}
		
		System.out.println("Dados da conta atualizados\n" + conta.toString());
		System.out.println();
		
		System.out.println("O cliente deseja realizar mais algum depósito? (Aperte S --> Sim / Aperte N --> Não)");
		escolha = sc.next().charAt(0);
		
		if (escolha == 'S') {
			System.out.print("Digite o valor que você deseja colocar na conta: ");
			valor = sc.nextDouble();
			System.out.println();
			
			System.out.println("Cliente depositou: "+ String.format("%.2f", conta.deposito(valor)));
			System.out.println();
		}
		else {
			System.out.println("Cliente não optou por fazer nenhum depósito");
		}
		
		System.out.println("Dados da conta atualizados\n" + conta.toString());
		System.out.println();

		System.out.println("O cliente deseja efetuar operação de saque? (Digite S --> Sim / Digite N -->)");
		escolha = sc.next().charAt(0);
		
		if (escolha == 'S') {
			System.out.println("Digite o valor do saque: ");
			valor = sc.nextDouble();
			System.out.println("O cliente sacou: R$ " + String.format("%.2f", conta.saque(valor)));
			System.out.println();
		}
		else {
			System.out.println("O cliente não deseja realizar saque");
		}
		
		System.out.println("Dados da conta atualizados\n" + conta.toString());
		System.out.println();
		
		sc.close();
	}

}
