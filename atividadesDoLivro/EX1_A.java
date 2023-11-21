//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg52 -> Exercicio 1. a) Faça um programa que receba quatro numeros inteiros, calcule e mostre a soma desses numeros

import java.util.Scanner;

class EX1_A {
    /**
     * @param args
     */
    public static void main (String [] args){
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo valor");
        int n2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor");
        int n3 = scanner.nextInt();

        System.out.println("Digite o quarto valor");
        int n4 = scanner.nextInt();

        scanner.close();

        int soma = n1+n2+n3+n4;

        System.out.println("Suas escolhas foram: " + n1 + ", " + n2 + ", " + n3 + " e " + n4);
        System.out.println("A soma dessas escolhas é igual a: " + soma); 
    }
}