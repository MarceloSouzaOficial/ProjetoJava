package Exercicios;

import java.util.Scanner;

   public class Exercicio_4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Declaração das variáveis
            int largura = 8;
            int altura = 6;

            // Fórmulas:
            // Área = largura * altura
            // Perímetro = 2 * (largura + altura)
            int area = largura * altura;
            int perimetro = 2 * (largura + altura);

            // Impressão dos resultados
            System.out.println("Largura: " + largura);
            System.out.println("Altura: " + altura);
            System.out.println("Área do retângulo: " + area);
            System.out.println("Perímetro do retângulo: " + perimetro);
        }
    }

