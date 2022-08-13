package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro que irá representar a quantidade de pessoas dentro desse vetor: ");
		int n = sc.nextInt();
		
		String nomes[] = new String[n];
		int idades[] = new int[n]; 
		double alturas[] = new double[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dº pessoa \n",(i+1));
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += alturas[i];
		}
		
		double media = sum / n;
		System.out.printf("MEDIA DAS ALTURAS: %.2f%n", media);
		
		double cont = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] < 18) {
				cont += 1;
			}
		}
		
		double percent = cont * (100 / n);
		System.out.printf("Número de pessoas com menos de 18 anos: %.2f%%%n", percent);
		for(int i = 0; i < n; i++) {
			if (idades[i] < 18) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
}
