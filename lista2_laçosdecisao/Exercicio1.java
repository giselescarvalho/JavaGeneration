/* 1-	Fa�a um programa que receba tr�s 
 * inteiros e diga qual deles � o maior.
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
			System.out.println("A � o maior dos valores que �: " + a);
		}
		
		if (b>a & b>c) {
			System.out.println("B � o maior dos valores que �: " + b);
		}
		if (c>a & c>b) {
			System.out.println("C � o maior dos valores que �: " + c);
		}
		
	}
}
