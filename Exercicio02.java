package br.com.kaua.lista05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        }
        return "Obesidade";
    }

    public static void exibirRelatorio(double[] pesos, double[] alturas) {
        Locale br = Locale.forLanguageTag("pt-BR");
        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);
            System.out.println(String.format(br, "Pessoa %d: IMC %.2f - %s",
                    i + 1, imc, classificarImc(imc)));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.forLanguageTag("pt-BR"));

        double[] pesos = new double[4];
        double[] alturas = new double[4];

        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Pessoa " + (i + 1) + " - peso (kg): ");
            pesos[i] = sc.nextDouble();
            System.out.print("Pessoa " + (i + 1) + " - altura (m): ");
            alturas[i] = sc.nextDouble();
        }

        System.out.println();
        exibirRelatorio(pesos, alturas);

        sc.close();
    }
}
