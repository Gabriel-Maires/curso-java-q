/*
13 3
Imprima os primeiros 10 números da sequência de Fibonacci. A Sequência de Fibonacci é
uma série de números onde cada número subsequente é a soma dos dois anteriores,
começando geralmente com 0 e 1 (ou 1 e 1). A sequência inicia assim: 0, 1, 1, 2, 3, 5, 8, 13,
21, 34, e assim por diante.
Atenção, utilize um loop FOR.
*/

public class FibonacciFor {

    public static void main(String[] args) {
        int lastNumber = 0;
        for(int i = 0; i <= 100;i+=lastNumber){
            System.out.print(i+lastNumber);
            lastNumber = i-=1;
            System.out.print(" ");
        }
    }
}