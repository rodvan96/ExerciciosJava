//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg59 -> Exercicio 13. a) Sabe-se que: 1 pé são 12 polegadas; 1 jarda são 3 pés; 1 milha é 1 760 jarda. Com base nessas informações faça um programa que receba uma medida em pés, faça as conversões a seguir e mostre os resultados de polegadas, jardas e milhas.

import java.util.Scanner;
import java.text.DecimalFormat;

public class EX13_A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");

        double pe, poleg, jarda, milhas;

        System.out.print("Informe uma medida em pés: ");
        pe = scan.nextDouble();
        scan.close();

        poleg = pe * 12;
        jarda = pe / 3;
        milhas = jarda / 1760;

        System.out.println("A medida de " + pe + " pés em polegadas é: " + casas.format(poleg));
        System.out.println("A medida de " + pe + " pés em jardas é: " + casas.format(jarda));
        System.out.println("A medida de " + pe + " pés em milhas é: " + casas.format(milhas));

    }
    
}
