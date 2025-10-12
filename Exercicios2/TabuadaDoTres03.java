package Exercicios2;
// 3 Pergunte um número. Diga se este numero faz parte da tabuada do 3, escrevendo na tela.

import java.util.Scanner;

public class TabuadaDoTres03 {

        public static void verificaNumeroTabuadaDoTres(Integer numero){
            String numeroToString = String.valueOf(numero);
            int soma = 0;
        for (int i = 0; i < numeroToString.length(); i++) {
            int digito = Character.getNumericValue(numeroToString.charAt(i));
            System.out.println("Dígito: " + digito);
            soma += digito;
        }

        if(soma == 3 || soma == 6 || soma == 9){
            System.out.println("Resultado: " + soma);
            System.out.println("Este número é da tabuada do 3!");
        } else{
            System.out.println("Este número não é da tabuada do 3.");
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            verificaNumeroTabuadaDoTres(numero);
        }
}
