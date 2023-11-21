//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg55 -> Exercicio 5. a) - Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e do novo salário.

import java.util.Scanner;
import java.text.*;



public class EX5_A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");

        double sal, perc, aumento, novoSal;

        System.out.print("Informe seu salário base: R$");
        sal = scanner.nextDouble();
        System.out.print("Infome o percentual de aumento (somente números)");
        perc = scanner.nextDouble();
        scanner.close();

        aumento = sal * perc/100;
        novoSal = sal + aumento;

        System.out.println("Seu aumento salarial foi de: R$" + casas.format(aumento));
        System.out.println("Seu novo salário agora é: R$" + casas.format(novoSal));
    }
    
}
