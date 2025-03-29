package com.conta.terminal;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        // Criação do Scanner para receber dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha pendente

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibindo mensagem final utilizando concatenação e interpolação de variáveis
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta +
                " e seu saldo R$ " + saldo + " já está disponível para saque.");

        // Fechamento do scanner
        scanner.close();
    }
}
