/*
  Objetivo do programa: Calcule a área de um círculo com base no raio informado.
						Como calcular: A = PI . R ao quadrado
  Data da criacao: 2025-08-28
  Criado por: @programacaomentoria
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio06 {
    public static void main(String[] args) {
      DecimalFormat dfTwoDecimals = new DecimalFormat("#.##");
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o valor do raio para calcular a area do circulo: ");
      double raio = sc.nextFloat();
      final double PI = 3.14159;
      System.out.println("A area do circulo é: " + dfTwoDecimals.format(( PI * (raio * raio))));
      sc.close();
    }
}
