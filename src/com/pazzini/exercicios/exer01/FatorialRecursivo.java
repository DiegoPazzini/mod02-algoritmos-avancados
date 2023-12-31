// Definição do pacote onde a classe está localizada
package com.pazzini.exercicios.exer01;

// Declaração da classe FatorialRecursivo
public class FatorialRecursivo {

    // Método privado que calcula o fatorial de um número de forma recursiva
    private static int fatorial(int n) {
        // Condição de parada da recursão: se n for menor ou igual a 1, retorna 1
        if (n <= 1) return 1;
        
        // Chamada recursiva para calcular o fatorial de (n - 1) e multiplicar pelo valor de n
        return n * fatorial(n - 1);
    }

    // Método principal (main) que é executado ao iniciar o programa
    public static void main(String[] args) {
        // Exemplo de cálculo do fatorial para n = 3 e exibição do resultado
        int n = 3;
        System.out.println("O fatorial de " + n + " é igual a " + fatorial(n));

        // Exemplo de cálculo do fatorial para n = 7 e exibição do resultado
        n = 7;
        System.out.println("O fatorial de " + n + " é igual a " + fatorial(n));
    }
}
