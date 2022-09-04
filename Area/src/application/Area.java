package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Area {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width: ");
		double width = sc.nextDouble();
		
		System.out.println("Enter rectangle height: ");
		double height = sc.nextDouble();
		
		Rectangle rectangle = new Rectangle(width, height);
		
		System.out.printf("AREA: %.2f%n", rectangle.area(width, height));
		System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter(width, height));
		System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal(width, height));
		
		
		
		sc.close();
		
	}

}
