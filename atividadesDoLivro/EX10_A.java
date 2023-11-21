//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg57 -> Exercicio 10. a) Faça um programa que calcule e mostre a área de um circulo. Sabe-se que: Área = π * R².

import java.util.Scanner;
import java.text.*;

public class EX10_A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");

        double area, raio;

        System.out.print("Digite o raio do circulo que deseja calcular: ");
        raio = scan.nextDouble();
        scan.close();

        area = 3.1415 * (raio * raio);

        System.out.print("A área do circulo é de " + casas.format(area));

    }
    
}
