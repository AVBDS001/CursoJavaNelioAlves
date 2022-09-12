/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.ContagemVotos;
import entities.Eleitor;
import entities.Estatistica;
import java.util.*;

/**
 *
 * @author aluno
 */
public class Program {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Eleitor> list = new ArrayList<>();
        List<ContagemVotos> count = new ArrayList<>();
        
        System.out.print("Digite o número de eleitores a serem cadastrados: ");
        int N = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o nome do eleitor: ");
            String name = sc.nextLine();
            System.out.print("Digite o local aonde esse eleitor irá votar: ");
            String voteLocation = sc.nextLine();
            System.out.print("Digite o cpf desse eleitor no seguinte formato (999.888.777-66): ");
            String cpf = sc.nextLine();
            list.add(new Eleitor(name, voteLocation, cpf));
        }
        
        System.out.println();
        System.out.println("Iniciando a contagem dos votos !!!");
        int n = 1;
        System.out.println();
        
        for(int i = 0; i < n; i++) {
            System.out.println("Insira o total de votos na região: ");
            double totalVotos = sc.nextDouble();
            System.out.println("Insira o número de votos brancos: ");
            double  votosBrancos = sc.nextDouble();
            System.out.println("Insira o número de votos nulos: ");
            double  votosNulos = sc.nextDouble();
            System.out.println("Insira o número de votos válidos: ");
            double  votosValidos = sc.nextDouble();
            System.out.println();
            count.add(new ContagemVotos(votosBrancos, votosNulos, votosValidos, totalVotos));
            Estatistica stats = new Estatistica(votosBrancos, votosNulos, votosValidos, totalVotos);
            System.out.println("Porcentagem de votos brancos: " + stats.contagem(votosBrancos) + " %");
            System.out.println("Porcentagem de votos votos nulos: " + stats.contagem(votosNulos) + " %");
            System.out.println("Porcentagem de votos votos validos: " + stats.contagem(votosValidos) + " %");
        }
        
        System.out.println();
        System.out.println("DADOS DOS ELEITORES !!!");
        System.out.println();
        System.out.println(list);  
        
        sc.close();
    }   
}
