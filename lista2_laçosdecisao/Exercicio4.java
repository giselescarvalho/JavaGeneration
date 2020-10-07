/*1-	Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

package PacoteJava;

import java.util.Scanner;
import java.math.*;

public class Exercicio4 {
	public static void main (String args[]) 
	{
		int num, quadrado;
		double raiz;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com um número: ");
		num = ler.nextInt();
	
		if (num == 2) 
		{	
			System.out.println("O número 2 é par e a raiz quadrada é irracional");
		}
		
		if (num % 2 == 0) 
		{
			raiz = Math.sqrt(num);
			System.out.println("O número " + num + " é par e sua raiz quadrada é: " + raiz);
		}
	
		if (num % 2 == 1) 
		{
			quadrado = num*num;
			System.out.println(" O número" + num + " é ímpar e o quadrado do número é: " + quadrado);
		}
		
		else
		{
			System.out.println("Não foi possível calcular a raiz ou quadrado do número informado");
		}
	
	
	}	

}