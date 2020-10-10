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
		int i, contpar=0, contimpar=0;
		
		for (i=0; i<6;i++)
		{	System.out.println("Digite um valor que será armazenado: ");
			num[i]=ler.nextInt();
			
			if(num[i]%2 == 0)
			{
				contpar++;
			}
			
			else
			{
				contimpar++;
			}
			
		}
		
		System.out.println("A quantidade de números par foi: " + contpar);
		System.out.println("A quantidade de números ímpares foi: " + contimpar);
	
	}

}
