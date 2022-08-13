package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de pessoas que irão ser armazenadas no array: ");
		int n = sc.nextInt();
		
		String nomes[] = new String[n];
		int idades[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dº pessoa \n", (i+1));
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		int maior, posicaoDoMaior;
		maior = idades[0];
		posicaoDoMaior = 0;
		for (int i = 1; i < n; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				posicaoDoMaior = i;
			}
		}
		System.out.printf("IDADE DA PESSOA MAIS VELHA: %d anos \n", maior);
		System.out.printf("NOME DA PESSOA MAIS VELHA: %s \n", nomes[posicaoDoMaior]);
		
		sc.close();
	}
}
