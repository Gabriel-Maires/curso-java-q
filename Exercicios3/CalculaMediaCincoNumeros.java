/*
Pergunte 5 números e calcule a média.
Atenção, utilize um loop FOR.
*/

import java.util.Scanner;

public class CalculaMediaCincoNumeros {
    
    public static void calculaMedia(double numero1, double numero2, double numero3, double numero4, double numero5){
        double[] numbers = {numero1, numero2, numero3, numero4, numero5};
        double mediaFinal = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            mediaFinal += numbers[i];
        }
        System.out.println("A media final é: " + (mediaFinal / numbers.length));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double numero3 = sc.nextDouble();
        System.out.print("Digite o quarto número: ");
        double numero4 = sc.nextDouble();
        System.out.print("Digite o quinto número: ");
        double numero5 = sc.nextDouble();

        calculaMedia(numero1, numero2, numero3, numero4, numero5);
    }
}