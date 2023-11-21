//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg55 -> Exercicio a) Faça um programa que receba o salario de um funcionário, calcule e mostre o novo sálario sabendo-se que este sofreu um aumento de 25%.

import java.util.Scanner;
import java.text.*;

public class EX4_A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");

        float sal, aumento;
        aumento = 25;
        System.out.print("Informe seu salário: R$");
        sal = scanner.nextFloat();
        scanner.close();

        float novoSal = aumentoSal(sal, aumento);

        System.out.println("Com base no salário informado e referente ao aumento de " + aumento + "% seu novo salário é de R$" + casas.format(novoSal));
    }

    private static float aumentoSal(float a, float b){
        return a + (a*b/100);
    }       
}
