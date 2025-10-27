/*
1 3
Calcule o fatorial de um número.
Pergunte o número, faça o loop e exiba o resultado no final. Exemplo: Fatorial de 5 => 5 * 4 *
3 * 2 * 1 = 120
*/

import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Digite o numero a ser calculado: ");
        // double numero = sc.nextDouble();
        // double somaFatorial = numero;
        // for (int i = 0; i < numero; i++){
        //     somaFatorial = somaFatorial * (numero - 1);
        //     numero -= 1;
        // }
        // System.out.println("O resultado é: " + somaFatorial);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número a ser calculado: ");
        int numero = sc.nextInt();
        int fatorial = 1;

        for (int i = numero; i > 0; i--) {
            fatorial *= i;
        }

        System.out.println("O resultado é: " + fatorial);
        sc.close();
    }
}

