package br.com.kaua.lista05;

import java.util.Scanner;

public class Exercicio04 {

    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int troca = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = troca;
                }
            }
        }
    }

    public static boolean estaOrdenado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] > v[i + 1]) {
                return false;
            }
        }
        return true;
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
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nAntes de ordenar:");
        exibir(numeros);
        System.out.println("Está ordenado? " + estaOrdenado(numeros));

        ordenar(numeros);

        System.out.println("\nDepois de ordenar:");
        exibir(numeros);
        System.out.println("Está ordenado? " + estaOrdenado(numeros));

        sc.close();
    }
}
