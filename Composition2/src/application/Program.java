package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int N = sc.nextInt();

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        for(int i = 1; i <= N; i++) {
            System.out.printf("Tax payer #%d data: \n", i);
            System.out.print("Individual or Company (i/c): ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine(); //cleaning the input buffer
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if(type == 'i') {
                System.out.println("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                Individual individual = new Individual(name,annualIncome, healthExpenditures);
                list.add(individual);
            }
            else {
                System.out.print("Number of Employees: ");
                int numberOfEmployees = sc.nextInt();
                Company company = new Company(name, annualIncome, numberOfEmployees);
                list.add(company);
            }
        }
        System.out.println();
        System.out.println("Paid taxes: ");
        for(TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f",tp.tax()));
        }

        System.out.println();
        double sum = 0.0;
        for(TaxPayer tp : list) {
            sum += tp.tax();
        }

        System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));

        sc.close();
    }
}
