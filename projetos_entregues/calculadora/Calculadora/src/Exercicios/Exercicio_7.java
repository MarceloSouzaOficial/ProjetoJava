package Exercicios;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 100;
        int quantidade = 13;

        // Fazendo o cast explícito de 'total' para double antes da divisão
        double media = (double) total / quantidade;

        System.out.println("Total: " + total);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Média exata: " + media);
    }
}

