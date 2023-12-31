// Definição do pacote onde a classe está localizada
package com.pazzini.recursividade;

// Declaração da classe Fibonacci
public class Fibonacci {
    // Método privado que imprime a posição n na sequência Fibonacci
    private static void imprimeFibonacci(int n) {
        System.out.print("A posição " + n + " na sequência Fibonacci é " + fibonacci(n));
    }

    // Método privado que calcula o elemento n da sequência Fibonacci de forma recursiva
    private static int fibonacci(int n) {
        // Condição de parada da recursão: se n for menor ou igual a 1, retorna n
        if (n <= 1)
            return n;
        // Chamada recursiva para calcular o elemento n somando os elementos n-1 e n-2 da sequência Fibonacci
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Método principal (main) que é executado ao iniciar o programa
    public static void main(String[] args) {
        // Exemplo de impressão do elemento na posição n = 2 da sequência Fibonacci
        int n = 2;
        imprimeFibonacci(n);
    }
}
