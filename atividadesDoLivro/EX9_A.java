//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg57 -> Exercicio 9. a) Faça um programa que calcule e mostre a área de um triangulo. Sabe-se que: Área = (base * altura) / 2.

import java.util.Scanner;

public class EX9_A {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    float base, altura, area;

    System.out.print("Entre com a altura do triângulo: ");
    altura = scanner.nextFloat();
    System.out.print("Entre com a base do triângulo: ");
    base = scanner.nextFloat();
    scanner.close();

    area = (base * altura)/2;

    System.out.println("A área do triângulo é " + area);

    }
}
