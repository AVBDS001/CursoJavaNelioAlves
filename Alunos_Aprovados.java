package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de alunos que foram avaliados: ");
		int n = sc.nextInt();
		
		String nomes[] = new String[n];
		double notas1[] = new double[n];
		double notas2[] = new double[n];
		double notas3[] = new double[n];
		double notas4[] = new double[n];
		
		
		for (int i = 0; i < n; i ++) {
			sc.nextLine();
			System.out.printf("Digite o nome do %dº aluno(a): ", (i+1));
			nomes[i] = sc.nextLine();
			System.out.print("Digite a nota da primeira avaliação: ");
			notas1[i] = sc.nextDouble();
			System.out.print("Digite a nota da segunda avaliação: ");
			notas2[i] = sc.nextDouble();
			System.out.print("Digite a nota da terceira avaliação: ");
			notas3[i] = sc.nextDouble();
			System.out.print("Digite a nota da quarta avaliação: ");
			notas4[i] = sc.nextDouble();
			System.out.println();
		}
		
		System.out.println("ALUNOS APROVADOS: ");
		System.out.println();
		
		double media;
		for(int i = 0; i < n; i++) {
			media = (notas1[i] + notas2[i] + notas3[i] + notas4[i]) / 4;
			
			if(media >= 7) {
				System.out.printf("%s \n", nomes[i]);
			}
			else {
				System.out.println("ALUNOS REPROVADOS: ");
				System.out.printf("%s \n", nomes[i]);
			}
		}
		sc.close();
	}
}
