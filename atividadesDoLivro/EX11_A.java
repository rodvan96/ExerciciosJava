//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg58 -> Exercicio 11. a) Faça um programa que receba um número positivo e maior que zero calcule e mostre: o número digitado ao quadrado; o numero digitado ao cubo; a raíz quadrada do número digitado; a raíz cúbica do número digitado.

import java.util.Scanner;
import java.text.*;

public class EX11_A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double num;

        System.out.print("Digite um número: ");
        num = scan.nextDouble();
        System.out.println("Você digitou o número " + num);
        scan.close();
        if (num <= 0 ){
            System.out.println("Devido o número digitado, ser menor que 0 não podemos prosseguir com a ação.");
        }else{
            aoQuadrado(num);
            aoCubo(num);
            raizQuadrada(num);
            raizCubica(num);
        }

        System.out.println("Fim do Programa!");
    }

    private static double aoQuadrado(double num){
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");
        double quadrado = Math.pow(num, 2);
        System.out.println("Este número elevado ao quadrado é " + casas.format(quadrado));        
        return quadrado;     
    }

    private static double aoCubo(double num){
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");
        double cubo = Math.pow(num,3);
        System.out.println("E elevado ao cubo é " + casas.format(cubo));
        return cubo;
    }

    private static double raizQuadrada(double num){
        double r2 = Math.sqrt(num);
        if (r2 % 1 == 0) {
            System.out.println("A raíz quadrada de " + num + " é igual a: " + r2);
        }else{
            System.out.println("Para a raíz quadrada de " + num + " o resultado é um número irracional, portanto, não podemos expressá-lo dentro da raíz.");
        }
        return r2;
    }

    private static double raizCubica(double num){
        double r3 = Math.cbrt(num);
        if (r3 % 1 == 0) {
            System.out.println("A raíz cúbica de " + num + "é igual a " + r3);
        } else{
            System.out.println("Para a raíz cúbica de " + num + " o resultado é um número irracional, portanto, não podemos expressá-lo dentro da raíz.");
        }
        return r3;
    }
}