//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg56 -> Exercicio 8. a) Faça um programa que receba o valor de um depósito e o valor da taxa de juros, calcule e mostre o valor do rendimento e o valor total depois do rendimento.

import java.util.Scanner;
import java.text.*;

public class EX8_A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");

        double dep, taxa, rend, total;
        
        System.out.print("Informe o valor de depósito: R$");
        dep = scanner.nextDouble();
        System.out.print("Informe a taxa de juros (somente números): ");
        taxa = scanner.nextDouble();
        scanner.close();

        rend = dep * taxa/100;
        total = dep + rend;

        System.out.println("O rendimento referente ao valor de R$" + casas.format(dep) + " será R$" + casas.format(rend));
        System.out.println("O valor total ao final da aplicação com juros a " + casas.format(taxa) + "% será R$" + casas.format(total));
    }
}
