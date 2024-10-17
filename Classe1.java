import java.util.*;

public class Classe1  {
    public static void main(String[] args) {
        Scanner scnInputUsuario = new Scanner(System.in);// criar o imput de entrada via terminar do usuario 
        System.out.println("Olá! Bem vindo a calculadora de java.  Digite  o primeiro numero a ser calculado e tecle: \" Enter\".");
        int intInputUsuario1 = scnInputUsuario.nextInt();// ELEMETO DE VIEW (fontend)
        System.out.println("Digite o segundo numero calculado  e tecle: \" Enter\".");
        int intInputUsuario2 = scnInputUsuario.nextInt();// interaçao com o usuario qu tem que enviar para uma variavel
        System.out.println("Digite o numero da opçao desejada e tecle: \"Enter\".");
        String[] opcoes = Classe2.mostrarOpcoes();

        for (int count = 0; count < opcoes.length; count++) {// estrutura de repetção
         System.out.println(count + " -" + opcoes[count]);
        }

        int opcaoEscolhida = scnInputUsuario.nextInt();

        System.out.println("O resultado da " + opcoes[opcaoEscolhida] + " é: " + Classe2.resultado(intInputUsuario1, intInputUsuario2, opcaoEscolhida));
        scnInputUsuario.close();

    }
}