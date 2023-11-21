//Livro: Fundamentos da Programação de Computadores - ASCENCIO, A. F. G.
//pg60 -> Exercicio 14. a) Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre: a idade dessa pessoa; quantos anos ela terá em 2050.

import java.util.Scanner;

public class EX14_A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int anoNasc, idade, idadeFut;
        String nome;

        System.out.println("------------------------------------------------------");
        System.out.println("----------------< 2050 TEREI >------------------------");
        System.out.println("------------------------------------------------------");
        System.out.println("         S E J A   B E M  -  V I N D O  !  !  !       ");
        System.out.println("------------------------------------------------------");
        System.out.println("Qual é o seu nome?");
        nome = scan.nextLine();
        System.out.println("Prazer em te conhecer " + nome + "!");
        System.out.println("Posso te contar um segredo? [ 1 ] Sim / [ 2 ] Não");
        String segredo = scan.nextLine();

        if (segredo.equals("1")){
            System.out.println("<(cochicho)> Eu sei que idade você terá em 2050 ");
            System.out.println("Só preciso que me diga em que ano você nasceu " + nome);
            System.out.print("Digite aqui: ");
            anoNasc = scan.nextInt();
            System.out.println("Obrigadooo!");
            scan.close();
            idade = 2023 - anoNasc;
            idadeFut = 2050 - anoNasc;
            System.out.println("UAAAU! Você tem " + idade + " anos!? Como se sente tendo essa idade? Já refletiu sobre isso?");
            System.out.println("Enfim!! vou te contar quantos anos você terá em 2050 ;D");
            System.out.println("Acessando meus dados e calculos...");
            System.out.println("Só mais um momento...");
            System.out.println("OMG!! Em 2050 se você sobreviver até lá, terá " + idadeFut + " anos.");
            System.out.println("E ai, curtiu?");
        }else{
            System.out.println("#Chateado");
            System.out.println("Só espero que não se arrependa de suas escolhas...");
            System.out.println("ADEUS!!");
        }    
        
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("   Obrigado por fazer parte de nossos testes! Ramos Tecnologias agradece seu acesso!   ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------");
    }       
}