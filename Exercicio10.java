package br.com.kaua.lista05;

import java.util.Scanner;

public class Exercicio10 {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int somar(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }

    public static void exibir(int[] v) {
        String saida = "";
        for (int i = 0; i < v.length; i++) {
            saida += v[i] + " ";
        }
        System.out.println(saida.trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N (1 a 30): ");
        int n = sc.nextInt();

        if (n < 1 || n > 30) {
            System.out.println("Quantidade inválida.");
            sc.close();
            return;
        }

        int[] sequencia = new int[n];
        for (int i = 0; i < n; i++) {
            sequencia[i] = fibonacci(i);
        }

        exibir(sequencia);
        System.out.println("Soma: " + somar(sequencia));

        sc.close();
    }
}
