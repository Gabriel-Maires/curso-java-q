/*
17 3 (DESAFIO DA SEMANA 2) Crie um programa que permita cadastrar produtos com os
seguintes dados: Nome, Fabricante e Preço.
Após o cadastro de cada produto, pergunte ao usuário se deseja cadastrar outro. O processo
deve continuar até que o usuário decida parar.
Ao final, o programa deve pedir um valor limite e exibir apenas os produtos cujo preço seja
menor ou igual a esse valor.
Objetivos didáticos:
- Uso de loops com condição de parada
- Manipulação de estruturas de dados (arrays ou structs)
- Aplicação de filtros após o loop
*/

import java.util.Scanner;
import java.util.ArrayList;

public class DesafioFiltroProdutoPorPreco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        // Implementação do exercício aqui
        scanner.close();
    }
}