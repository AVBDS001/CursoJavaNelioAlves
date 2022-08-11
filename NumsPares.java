package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você irá digitar: ");
		int n = sc.nextInt();
		
		double nums[] = new double[n];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("Digite um número: ");
			nums[i] = sc.nextDouble();
		}
		
		System.out.println("Números pares: ");
		for(int i = 0; i <nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.println(nums[i]);
			}
		}
		
		sc.close();
	}

}
