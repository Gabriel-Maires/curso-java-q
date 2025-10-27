package Exercicios2;
// 4 Pergunte a data de nascimento e verifique se a data atual é a data de aniversário.
// Se for, printe a mensagem de Feliz Aniversário, senão printe a mensagem hoje e dia X de Y
// de ZZZZ.

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerificaAniversario04 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Qual sua data de aniversário? ");
    String dateInput = sc.nextLine();
    sc.close();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate dateConverted = LocalDate.parse(dateInput, formatter);
    LocalDate currentDate = LocalDate.now();
    if(dateConverted.format(formatter) == currentDate.format(formatter)){
        System.out.print("Feliz Aniversáriooo!!!");
    } else{
        System.out.print("Infelizmente hoje não é seu aniversário :( a data de hoje é: " + currentDate.format(formatter));
    }
    }
    
}