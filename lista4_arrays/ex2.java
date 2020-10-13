/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  • A soma dos números pares digitados; 
• Os números ímpares digitados; • A quantidade de números ímpares digitados.
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
		{	System.out.println("Digite um valor que será armazenado: ");
			num[i]=ler.nextInt();
			
			if(num[i]%2 == 0)
			{
				contpar++;
				somapar = somapar + num[i];
				System.out.println("Número par: " + num[i]);
			}
			
			else
			{
				contimpar++;
				somaimpar = somaimpar + num[i] ;
				System.out.println("Número ímpar: " + num[i]);
			}
			
		}
		
		System.out.println("A quantidade de números pares digitados foi: " + contpar + ". E a soma dos números foi: " + somapar);
		System.out.println("A quantidade de números ímpares digitados foi: " + contimpar + ". E a soma dos números ímpares foi: " + somaimpar);
	
	}

}
