
//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg54 -> Exercicio 3. a) Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.

import java.util.Scanner;
import java.text.*;

public class EX3_A {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");

        System.out.println("Qual o nome do aluno?");
        String aluno = scanner.nextLine();

        System.out.println("Insira o peso uma vez e tecle ENTER");
        double peso1 = scanner.nextDouble(); 
        double peso2 = scanner.nextDouble();
        double peso3 = scanner.nextDouble();

        System.out.println("Insira a nota e tecle ENTER");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        scanner.close();

        double media = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1 + peso2 + peso3);

        System.out.println("Os pesos digitados foram: " + peso1 + " - " + peso2 + " e " + peso3);
        System.out.println("As notas digitadas foram: " + nota1 + " - " + nota2 + " e " + nota3);
        System.out.println("Com base nos dados informados, a media ponderada de " + aluno + " é de " + casas.format(media));
    }  
}
