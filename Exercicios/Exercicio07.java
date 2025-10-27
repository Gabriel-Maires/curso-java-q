/*

Objetivo do programa: Calcule a área de um retângulo
                    Area = comprimento * altura
Data da criacao: 2025-08-28
Criado por: @programacaomentoria

*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o comprimento: ");
      double comprimento = sc.nextDouble();
      System.out.println("Digite a altura: ");
      double altura = sc.nextDouble();

      System.out.println("A area do retangulo é: " + (comprimento * altura));
      sc.close();
    }
}
