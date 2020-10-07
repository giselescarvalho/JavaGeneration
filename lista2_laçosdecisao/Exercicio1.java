/* 1-	Faça um programa que receba três 
 * inteiros e diga qual deles é o maior.
 */
package PacoteJava;
 

import java.util.*;

public class Exercicio1 {
	public static void main (String args[])
	{
		int a,b,c;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com o valor de A: ");
		a = ler.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = ler.nextInt();
		System.out.println("Entre com o valor de C: ");
		c = ler.nextInt();
		
		if (a>b & a>c) {
			System.out.println("A é o maior dos valores que é: " + a);
		}
		
		if (b>a & b>c) {
			System.out.println("B é o maior dos valores que é: " + b);
		}
		if (c>a & c>b) {
			System.out.println("C é o maior dos valores que é: " + c);
		}
		
	}
}
