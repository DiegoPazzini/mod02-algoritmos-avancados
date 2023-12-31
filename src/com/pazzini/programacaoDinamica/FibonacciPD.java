// Definição do pacote onde a classe está localizada
package com.pazzini.programacaoDinamica;

// Declaração da classe FibonacciPD
public class FibonacciPD {
    // Constante que define o número máximo de elementos para armazenar valores da sequência Fibonacci na abordagem de programação dinâmica
    private static final int MAX_ELEMENTOS = 100;

    // Array para armazenar os resultados dos elementos da sequência Fibonacci para evitar recálculos na abordagem de programação dinâmica
    private static final long[] elementosFib = new long[MAX_ELEMENTOS];

    // Método principal que chama a versão de programação dinâmica do cálculo de Fibonacci
    public static long encontrarElementosPD(int n) {
        // Inicializa o array de elementosFib com -1 para indicar que os resultados ainda não foram calculados
        for (int i = 0; i < MAX_ELEMENTOS; i++)
            elementosFib[i] = -1;

        // Chama a versão recursiva de programação dinâmica para encontrar o elemento n da sequência Fibonacci
        return encontrarElemento(n);
    }

    // Método recursivo para calcular o elemento n da sequência Fibonacci, utilizando a abordagem de programação dinâmica
    public static long encontrarElemento(int n) {
        // Verifica se o resultado do elemento n da sequência Fibonacci já foi calculado e armazenado
        if (elementosFib[n] == -1) {
            // Se n for menor ou igual a 1, atribui n diretamente (caso base)
            if (n <= 1)
                elementosFib[n] = n;
            else
                // Se não, calcula o elemento n somando os elementos n-1 e n-2 da sequência Fibonacci
                elementosFib[n] = (encontrarElemento(n - 1) + encontrarElemento(n - 2));
        }
        // Retorna o resultado armazenado para o elemento n da sequência Fibonacci
        return elementosFib[n];
    }

    // Método principal (main) que é executado ao iniciar o programa
    public static void main(String[] args) {
        // Exemplo de cálculo do elemento n = 50 da sequência Fibonacci usando programação dinâmica
        int n = 50;
        System.out.println("Elemento " + n + ": " + encontrarElementosPD(n));
    }
}
