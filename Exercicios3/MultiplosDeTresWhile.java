/*
10 3 Imprima os múltiplos de 3 entre 1 e 30. Atenção, utilize um loop WHILE.
*/

public class MultiplosDeTresWhile {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 30){
            if(i % 3 == 0 || i == 1){
                System.out.print(i);
                System.out.print(" ");
            }
            i++;
        }
    }
}