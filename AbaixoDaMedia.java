package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos irão ser armazenados no vetor? ");
		int n = sc.nextInt();
		
		double vetor[] = new double[n];
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0; i< vetor.length; i++) {
			sum += vetor[i];
		}
		
		double media = sum / n;
		System.out.printf("MEDIA = %.3f \n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}
}
