/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. 
 * O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.	 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor 
e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

package Vetores;

import java.util.*;

public class ex1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
				
		int[] a = {1,0,5,-2,-5,7};
		int sum=0, i;
		
		System.out.printf("Os elementos A[0], A[1] e A[5] do vetor s�o: "+ a[0] + ", " + a[1] + " e " + a[5]);
		System.out.printf("\nA soma dos elementos nas posi��es A[0], A[1] e A[5] do vetor: "+(a[0]+a[1]+a[5])); 
		a[3] = 100;
		
		System.out.printf("\nOs valores do vetor agora s�o: ");
		for (i=0;i<6;i++)
		{
			System.out.printf("\n "+a[i]);
		}		
	}
}
