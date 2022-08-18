package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("Enter how many employees will be registred: ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println();
			System.out.printf("Employee #%d: \n", (i+1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(hasId(employees, id)) {
				System.out.println("ID already taken!!!");
				System.out.print("Try again: ");
				id = sc.nextInt();
			}
			
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(name, id, salary);
			employees.add(emp);
		}
		
		System.out.println("Enter employee id that'll have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(employees, idSalary);
		if(pos == null) {
			System.out.println("ID DOES NOT EXIST!!!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			employees.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
		sc.close();
	}
	
	public static Integer position(List<Employee> idEmployees, int id) {
		for(int i = 0; i < idEmployees.size(); i++) {
			if (idEmployees.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> employees, int id) {
		Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
