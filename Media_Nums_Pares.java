package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos elementos serão armazenados no array: ");
		int n = sc.nextInt();
		
		double nums[] = new double[n];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Digite um número: ");
			nums[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				sum += nums[i];
			}
		}
		
		double media = sum / n;
		System.out.printf("VALOR DA MÉDIA = %.2f", media);		
		
		sc.close();
	}
}
