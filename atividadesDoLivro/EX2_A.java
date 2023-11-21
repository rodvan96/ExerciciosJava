
//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg52 -> Exercicio 2. a) Faça um programa que receba três notas, calcule e mostre a média aritmética.

import java.util.Scanner;
import java.text.*;

public class EX2_A {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");
        
        System.out.println("Qual o nome do aluno?");
        String aluno = scanner.nextLine();

        System.out.println("Insira a primeira nota:");
        float nt1 = scanner.nextFloat();

        System.out.println("Insira a segunda nota:");
        float nt2 = scanner.nextFloat();

        System.out.println("Insira a terceira nota:");
        float nt3 = scanner.nextFloat();

        scanner.close();

        float media = (nt1 + nt2 + nt3)/3;

        System.out.println("As notas informadas foram: " + nt1 + ", " + nt2 + " e " + nt3);
        System.out.println("Com base nas informações inseridas a média de " + aluno + " é de " + casas.format(media));
    }
}
