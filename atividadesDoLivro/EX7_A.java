//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg56 -> Exercicio 7. a) Faça um programa que receba o salário base de um funcionário, calcule e mostre seu salário a receber, sabendo-se que o funcionario tem gratificação de R$50,00 e paga imposto de 10% sobre o salário base.

import java.util.Scanner;
import java.text.*;


public class EX7_A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");

        float sal, imp, bonus;
        
        System.out.print("Digite seu salário: R$");
        sal = scanner.nextFloat();
        scanner.close();

        imp = sal * 10/100;
        bonus = 50;

        float salReceber = salRec(sal, imp, bonus);
        System.out.println("Devido impostos ser de R$" + casas.format(imp) + " e sua bonificação ser de R$" + casas.format(bonus) + " você receberá R$" + casas.format(salReceber));
    }

    private static float salRec(float a, float b, float c){
        return a - b + c;
    }
}
