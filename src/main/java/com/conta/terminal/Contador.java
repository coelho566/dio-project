package com.conta.terminal;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Exibindo a mensagem de erro em caso de exceção
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Fechando o scanner
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) th3 {
        // Validar se parametroUm é maior que parametroDois e lançar exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        // Realizando a contagem
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

