/*
  Objetivo do programa: Calcule o quadrado de um número
  Data da criacao: 2025-08-28
  Criado por: @programacaomentoria
 */
import java.util.Scanner;

public class Exercicio04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número a ser calculado: ");
        Float numero = sc.nextFloat();
        System.out.println("O numero informado ao quadrado é: " + (numero * numero));
        sc.close();
    }
}
