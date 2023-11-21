//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg60 -> Exercicio 15. a) O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de lucro do distribuidor e dos impostos aplicados ao preço de fábrica. Faça um programa que receba o preço de fábrica de um veículo, o percentual de lucro do distribuidor e o percentual de impostos, calcule e mostre: o valor correspondente ao lucro do distribuidor; o valor correspondente aos impostos; o preço final do veículo.

import java.util.Scanner;
import java.text.DecimalFormat;

public class EX15_A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat casas;
        casas = new DecimalFormat("0.00");

        double precoFabric, percLucro, percImp, lucroDist, imp, precoFinal;

        System.out.print("Entre com o valor de fábrica do veículo: ");
        precoFabric = scan.nextDouble();
        System.out.print("Entre com o percentual de lucro (somente números): ");
        percLucro = scan.nextDouble();
        System.out.print("Entre com o percentual de impostos (somente números): ");
        percImp = scan.nextDouble();
        scan.close();

        lucroDist = precoFabric * percLucro / 100;
        imp = precoFabric * percImp / 100;
        precoFinal = precoFabric + lucroDist + imp;

        System.out.println("O valor final do veículo para o consumidor será de R$" + casas.format(precoFinal) + " sendo: ");
        System.out.println("R$" + casas.format(lucroDist) + " o lucro do distribuidor;");
        System.out.println("R$" + casas.format(imp) + " o valor cobrado em impostos.");
    } 
}