/*
  Objetivo do programa: Perguntar o nome de um aluno, pergunte as 4 notas e calcule a média aritmética, exibindo no final.
  Data da criacao: 2025-08-28
  Criado por: @programacaomentoria
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá! Qual seu nome? ");
        String name = sc.nextLine();
        System.out.println("Agora, digite a primeira nota: ");
        Integer primeiraNota = sc.nextInt();
        System.out.println("Agora, digite a segunda nota: ");
        Integer segundaNota = sc.nextInt();
        System.out.println("Agora, digite a terceira nota: ");
        Integer terceiraNota = sc.nextInt();
        System.out.println("Agora, digite a quarta nota: ");
        Integer quartaNota = sc.nextInt();
        Float media = (float)((primeiraNota + segundaNota + terceiraNota + quartaNota) / 4); 
        System.out.println("Sua média é: " + media);
        sc.close();
    }
}
