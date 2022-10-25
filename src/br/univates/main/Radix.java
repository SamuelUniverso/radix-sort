package br.univates.main;
import java.util.Arrays;

import org.junit.Test;

/**
 * 
 * @author lucas.caumo
 * @author samuel.rockenbach
 *
 */
public class Radix 
{
    /**
     * Funcao principal que realiza ordenacao Radix
     * 
     * @param arr
     * @param n
     */
    public void radixsort(int arr[], int n)
    {
    	/**
    	 * Encontrar o maior numero para saber a quantidade de digitos
    	 */
        int m = getMax(arr, n);
 
        /**
         *  Fazer count-sort para cada dígito.
         *  
         *  Ao invez de usar o dígitio, o laço é iterado 
         *   com exponencial de 10^digito
         */
        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(arr, n, exp);
        }
    }

	/**
	 * Funcao para buscar maior valor do vetor[]
	 * @param arr
	 * @param n
	 * @return
	 */
    public int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    /**
     * Funcao para realizar count-sort do vetor arr[] de acordo com o 
     * digito representado pelo exponencial 
     * 
     * @param arr
     * @param n
     * @param exp
     */
    public void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        /**
         * armazenar as ocorrencias em count[]
         */
        for (i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
 
        /**
         * Mudar count[i] para que count[i] 
         *  contenha a posicao do digito em output[]
         */
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
 
        /**
         * Construir o vetor de saida
         */
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
 
        /**
         * Copiar o vetor de saida para arr[] para que arr[] agora
         *  contenha os numeros de acordo com o digito atual
         */
        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
 
    /**
     * Imprimir vetor na tela
     *  
     * @param arr
     * @param n
     */
        public void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
