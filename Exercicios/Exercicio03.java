/*
  Objetivo do programa: Perguntar o nome de um aluno, pergunte as 4 notas e calcule a média aritmética, exibindo no final.
  Data da criacao: 2025-08-28
  Criado por: @programacaomentoria
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Qual seu nome? ");
        String name = scanner.nextLine();
        System.out.println("Agora, digite a primeira nota: ");
        Integer primeiraNota = scanner.nextInt();
        System.out.println("Agora, digite a segunda nota: ");
        Integer segundaNota = scanner.nextInt();
        System.out.println("Agora, digite a terceira nota: ");
        Integer terceiraNota = scanner.nextInt();
        System.out.println("Agora, digite a quarta nota: ");
        Integer quartaNota = scanner.nextInt();
        Float media = (float)((primeiraNota + segundaNota + terceiraNota + quartaNota) / 4); 
        System.out.println("Sua média é: " + media);
    }
}
