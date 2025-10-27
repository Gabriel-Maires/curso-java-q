/*
3 3 Faça um programa que exiba de 0 a 100, somente os números ímpares e não divísiveis por 5,
e exiba o resultado.
*/

public class ImparesNaoDivisiveisPorCinco {
    public static void main(String[] args) {
        for(int i=0; i <= 100; i++){
            if(i % 2 != 0){
                if(i % 5 != 0){
                    System.out.print(i);
                    System.out.print(" ");
                }
            }
        }
    }
}