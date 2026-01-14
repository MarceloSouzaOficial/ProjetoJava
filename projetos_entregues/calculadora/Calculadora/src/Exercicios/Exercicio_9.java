package Exercicios;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Armazena o valor -20
        int valor = -20;
        int absoluto;

        // Se o valor for negativo, aplica o operador de negação para torná-lo positivo
        if (valor < 0) {
            absoluto = -valor;
        } else {
            absoluto = valor;
        }

        System.out.println("O valor original é: " + valor);
        System.out.println("O valor absoluto é: " + absoluto);
    }
}
