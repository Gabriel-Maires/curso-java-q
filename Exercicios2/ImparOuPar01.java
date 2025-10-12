package Exercicios2;
// 1 Pergunte um número. Diga se este numero é par ou ímpar, escrevendo na tela.

import java.util.Scanner;

public class ImparOuPar01 {
    public static void CalculadoraImparPar(Integer numero){
        if(numero % 2 == 0){
            System.out.println("Número Par!");
        }else{
            System.out.println("Número Impar");
        }
    }

    // Sofri um pouco pois nao lembrava que tinha que conter o Main

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        CalculadoraImparPar(numero);
    }
}
