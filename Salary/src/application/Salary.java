package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Worker;

public class Salary {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = scan.nextLine();
		
		System.out.print("Gross salary: ");
		double grossSalary = scan.nextDouble();
		
		System.out.print("Tax: ");
		double tax = scan.nextDouble();
		
		Worker worker = new Worker(name, grossSalary, tax);
		
		System.out.printf("Employee: %s", worker);
		
		System.out.println();
		System.out.println("Which percentage to increase salary: ");
		double percentage = scan.nextDouble();
		worker.increaseSalary(percentage);
		
		System.out.print("Updated data: " + worker);
		
		scan.close();
	}
}
