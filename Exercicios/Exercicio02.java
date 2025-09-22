/*
  Objetivo do programa: Perguntar o nome de quem está usando o programa e sua idade. Faça duas perguntas.
  Data da criacao: 2025-08-28
  Criado por: @programacaomentoria
 */
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Qual seu nome? ");
        String name = scanner.nextLine();
        System.out.println("E qual sua idade? ");
        Integer idade = scanner.nextInt();
        System.out.println("Seu nome é " + name + " e você tem " + idade);
    }
}