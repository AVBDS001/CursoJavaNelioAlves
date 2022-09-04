package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Juros;

public class CalcJuros {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de juros simples");
		System.out.print("Capital inicial: ");
		double capitalInicial = sc.nextDouble();
		System.out.print("Taxa de Juros: ");
		double taxaDeJuros = sc.nextDouble();
		System.out.print("Tempo da aplicação: ");
		double tempoDaAplicacao = sc.nextDouble();

		Juros juros = new Juros(capitalInicial, taxaDeJuros, tempoDaAplicacao);
		
		System.out.printf("Calculo dos juros simples: R$ %.2f", juros.jurosSimples(capitalInicial, taxaDeJuros, tempoDaAplicacao));
		System.out.println();
		System.out.printf("Calculo dos juros compostos: R$ %.2f", juros.jurosCompostos(capitalInicial, taxaDeJuros, tempoDaAplicacao));

	}

}
