/*1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em seguida. 
 * Encontre ap�s a maior pontua��o e a apresente. */


package Extras;
import java.util.*;
public class exercicio1vetor {
	public static void main (String args[])
	{
		int x;
		double maiornum=0;
		double num[] = new double [5];
		
		Scanner ler = new Scanner(System.in);
		
		
		for (x=0;x<=4;x++)
		{
			System.out.println("Entre com a pontua��o da atividade: ");
			num[x] = ler.nextInt();

			if (maiornum<num[x])
			{
				maiornum=num[x];
			} 
		}
	
		for (x=0;x<5;x++)
		{
			System.out.println("O n�mero " + num[x] + " foi digitado ");
		}
		
		System.out.println("\nE maior dentre estes n�meros �: " + maiornum);
	
	}
}
