/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  � A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; � A quantidade de n�meros �mpares digitados.
 */
 
package Vetores;

import java.util.*;

public class ex2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int[] num = new int[6];
		int i, contpar=0, contimpar=0, somapar=0, somaimpar=0;
		
		for (i=0; i<6;i++)
		{	System.out.println("Digite um valor que ser� armazenado: ");
			num[i]=ler.nextInt();
			
			if(num[i]%2 == 0)
			{
				contpar++;
				somapar = somapar + num[i];
				System.out.println("N�mero par: " + num[i]);
			}
			
			else
			{
				contimpar++;
				somaimpar = somaimpar + num[i] ;
				System.out.println("N�mero �mpar: " + num[i]);
			}
			
		}
		
		System.out.println("A quantidade de n�meros pares digitados foi: " + contpar + ". E a soma dos n�meros foi: " + somapar);
		System.out.println("A quantidade de n�meros �mpares digitados foi: " + contimpar + ". E a soma dos n�meros �mpares foi: " + somaimpar);
	
	}

}
