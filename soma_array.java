package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos números você quer armazenar no array: ");
		int n = sc.nextInt();
		
		double nums[] = new double[n];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Digite um número: ");
			nums[i] = sc.nextDouble();
		}
		
		System.out.println("VALORES: \n");
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		double sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		System.out.println("SOMA: " + sum);
		
		double media = sum / n;
		System.out.println("Media: " + media);
		
		sc.close();
	}

}
