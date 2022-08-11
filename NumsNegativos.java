package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você irá digitar: ");
		int n = sc.nextInt();
		
		int nums[] = new int[n];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Digite um número: ");
			nums[i] = sc.nextInt();
		}
		System.out.println("NÚMEROS NEGATIVOS: ");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				System.out.println(nums[i]);
			}
		}
		
		sc.close();
	}

}
