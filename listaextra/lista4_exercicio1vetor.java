/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente. */


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
			System.out.println("Entre com a pontuação da atividade: ");
			num[x] = ler.nextInt();

			if (maiornum<num[x])
			{
				maiornum=num[x];
			} 
		}
	
		for (x=0;x<5;x++)
		{
			System.out.println("O número " + num[x] + " foi digitado ");
		}
		
		System.out.println("\nE maior dentre estes números é: " + maiornum);
	
	}
}
