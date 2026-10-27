package br.com.kaua.lista05;

import java.util.Scanner;

public class Exercicio06 {

    public static int contarVogais(String texto) {
        String vogais = "aeiouáéíóúàâêôãõü";
        String minusculo = texto.toLowerCase();
        int quantidade = 0;
        for (int i = 0; i < minusculo.length(); i++) {
            if (vogais.indexOf(minusculo.charAt(i)) >= 0) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static void exibirContagem(String[] frases) {
        int indiceMaior = 0;
        for (int i = 0; i < frases.length; i++) {
            int vogais = contarVogais(frases[i]);
            System.out.println("Frase " + (i + 1) + ": \"" + frases[i] + "\" - " + vogais + " vogais");
            if (vogais > contarVogais(frases[indiceMaior])) {
                indiceMaior = i;
            }
        }
        System.out.println("\nFrase com mais vogais: \"" + frases[indiceMaior] + "\"");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Digite a frase " + (i + 1) + ": ");
            frases[i] = sc.nextLine();
        }

        System.out.println();
        exibirContagem(frases);

        sc.close();
    }
}
