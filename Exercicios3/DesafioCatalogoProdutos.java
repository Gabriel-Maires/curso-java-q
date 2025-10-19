/*
18 3 (DESAFIO DA SEMANA 1)
Crie um programa que permita ao usuário cadastrar produtos com os seguintes dados:
• Nome do produto
• Fabricante
• Preço
Após o cadastro de cada produto, o programa deve perguntar se o usuário deseja cadastrar
outro.
O processo deve continuar até que o usuário decida parar (válvula de escape).
Ao final, o programa deve exibir todo o catálogo de produtos cadastrados, mostrando os
dados de cada um.
Objetivos didáticos:
• Uso de vetores/arrays para armazenar múltiplos registros
• Manipulação de strings e números
• Controle de fluxo com loops e condição de parada
• Exibição estruturada de dados
*/

import java.util.Scanner;
import java.util.ArrayList;

public class DesafioCatalogoProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        // Implementação do exercício aqui
        scanner.close();
    }
}