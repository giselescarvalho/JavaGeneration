/*1- Fa�a um programa que mostre uma contagem na tela de 233 a 456, s� que
contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando n�o estiver.
 */
package Extras;

import java.util.Scanner;

public class lista3_exercicio5la�orepeti��o {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int num,res;
		
		System.out.println("Digite um n�mero inteiro: ");
		num = ler.nextInt();
		
		while (num<=100)
		{
			num=num*3;
			System.out.println("\nO resultado �: "+num);
		}
	}
}