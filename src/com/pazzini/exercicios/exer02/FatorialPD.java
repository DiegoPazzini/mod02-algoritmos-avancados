// Definição do pacote onde a classe está localizada
package com.pazzini.exercicios.exer02;

// Declaração da classe FatorialPD
public class FatorialPD {
    // Constante que define o número máximo de elementos para armazenar fatoriais na abordagem de programação dinâmica
    private static final int MAX_ELEMENTOS = 100;

    // Array para armazenar os resultados dos fatoriais para evitar recálculos na abordagem de programação dinâmica
    private static final long[] elementosFat = new long[MAX_ELEMENTOS];

    // Método principal que chama a versão de programação dinâmica do cálculo de fatorial
    private static long fatorialPD(int n) {
        // Inicializa o array de elementosFat com -1 para indicar que os resultados ainda não foram calculados
        for (int i = 0; i < MAX_ELEMENTOS; i++)
            elementosFat[i] = -1;
        
        // Chama a versão recursiva de programação dinâmica para calcular o fatorial de n
        return fatorial(n);
    }

    // Método recursivo para calcular o fatorial de um número, utilizando a abordagem de programação dinâmica
    private static long fatorial(int n) {
        // Verifica se o resultado do fatorial para n já foi calculado e armazenado
        if (elementosFat[n] == -1) {
            // Se n for menor ou igual a 1, atribui n diretamente (caso base)
            if (n <= 1)
                elementosFat[n] = n;
            else {
                // Se não, calcula o fatorial de n multiplicando pelo fatorial de (n-1)
                elementosFat[n] = n * fatorial(n - 1);
            }
        }
        // Retorna o resultado armazenado para n
        return elementosFat[n];
    }

    // Método principal (main) que é executado ao iniciar o programa
    public static void main(String[] args) {
        // Exemplo de cálculo do fatorial para n = 3 e exibição do resultado usando programação dinâmica
        int n = 3;
        System.out.println("O fatorial de " + n + " é igual a " + fatorialPD(n));

        // Exemplo de cálculo do fatorial para n = 7 e exibição do resultado usando programação dinâmica
        n = 7;
        System.out.println("O fatorial de " + n + " é igual a " + fatorialPD(n));
    }
}
