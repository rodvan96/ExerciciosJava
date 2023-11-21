//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg59 -> Exercicio 12. a) Faça um programa que receba dois números maiores que zero, calcule e mostre um elevado ao outro.

import java.util.Scanner;

public class EX12_A {
    public static void main (String[] args){

    Scanner scan = new Scanner(System.in);

    double num1, num2;
    System.out.print("Digite o primeiro número:");
    num1 = scan.nextDouble();
    System.out.print("Digite o segundo número: ");
    num2 = scan.nextDouble();
    scan.close();

    if (num1 >= 0 && num2 >= 0){
        calculoEResultado1(num1,num2);
        calculoEResultado2(num1,num2);
    }else{
        System.out.println("Número inválido, tente novamente!");
    }

    System.out.println("Fim do programa!");

    }

    private static double calculoEResultado1(double num1, double num2){
        double r1;
        r1 = Math.pow(num1, num2);
        System.out.println(num1 + " elevado a " + num2 + " é " + r1);
        return r1;
    }

    private static double calculoEResultado2(double num1, double num2){
        double r2;
        r2 = Math.pow(num2, num1);
        System.out.println(num2 + " elevado a " + num1 + " é " + r2);
        return r2;
    }
}