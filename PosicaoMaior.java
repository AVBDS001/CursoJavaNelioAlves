package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
    //Esse exercicio nao consegui fazer sozinho e vi a resolução
		
		int n, posmaior;
		double maior;
		
		System.out.println("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		double nums[] = new double[n];
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Digite um número: ");
			nums[i] = sc.nextDouble();
		}
		
		maior = nums[0];
		posmaior = 0;
		
		for(int i = 1; i < nums.length; i++) {
			if (nums[i] > maior) {
				System.out.println(nums[i]);
				maior = nums[i];
				posmaior = i;
			}
		}
		
		System.out.printf("MAIOR VALOR: %.1f \n",maior);
		System.out.printf("POSIÇÃO DO MAIOR VALOR: %d \n", posmaior);

		
		sc.close();
	}

}
