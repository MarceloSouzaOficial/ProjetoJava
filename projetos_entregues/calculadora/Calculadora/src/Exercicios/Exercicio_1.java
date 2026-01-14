package Exercicios;

import java.util.Scanner;

    public class Exercicio_1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double dividendo = 50;
            double divisor = 7;


            // O operador % calcula o resto da divisão
            double resto = dividendo % divisor;

            System.out.println("O resto da divisão de " + dividendo + " por " + divisor + " é: " + resto);
        }
    }

