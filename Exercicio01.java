package br.com.kaua.lista05;

import java.util.Scanner;

public class Exercicio01 {

    public static String gerarLinha(char simbolo, int tamanho) {
        String linha = "";
        for (int i = 0; i < tamanho; i++) {
            linha += simbolo;
        }
        return linha;
    }

    public static void desenharTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            System.out.println(gerarLinha('*', i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alturas = new int[3];

        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Digite a altura do triângulo " + (i + 1) + ": ");
            alturas[i] = sc.nextInt();
        }

        System.out.println();
        for (int i = 0; i < alturas.length; i++) {
            desenharTriangulo(alturas[i]);
            if (i < alturas.length - 1) {
                System.out.println();
            }
        }

        sc.close();
    }
}
