//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg56 -> Exercicio 6. a) Faça um programa que receba o salário base um funcionário, calcule e mostre o salário  a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salario base e paga imposto de 7% também sobre o salário base.


import java.util.Scanner;
import java.text.*;


public class EX6_A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");

       float sal, grat, imp;
       
        grat = 5;
        imp = 7;

       System.out.print("Informe seu salário: R$");
       sal = scanner.nextFloat();
       scanner.close();

        float salReceber = novoSal(sal,grat,imp);
        System.out.println("Com base no salário fornecido, sua remuneração é de: R$" + casas.format(salReceber));
    }

    private static float novoSal(float sal, float grat, float imp){
        return (sal * grat / 100) - (sal * imp / 100) + sal;
    }
}
