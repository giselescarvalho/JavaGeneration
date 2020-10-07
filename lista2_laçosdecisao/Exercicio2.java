/* 2- Faça um programa que entre com três números e coloque em ordem crescente. */

package PacoteJava;

import java.util.*;

public class Exercicio2 {
	public static void main(String args[]){
		
		int a, b, c;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Esse programa ordena números em ordem crescente");
		System.out.println("Entre com o primeiro número: ");
		a = ler.nextInt();
		System.out.println("Entre com o segundo número: ");
		b = ler.nextInt();
		System.out.println("Entre com o terceiro número: ");
		c = ler.nextInt();
		
		if (a>b & b>c) 										//verifica se A>B>C
		{
			System.out.println("O maior valor é "+ a + ", o segundo maior é "+ b +" e o menor é "+ c);
		}
		if (a>c & c>b)										//verifica se A>C>B
		{
			System.out.println("O maior valor é "+ a + ", o segundo maior é "+ c +" e o menor é "+ b);
		}
		
				
		if (b>a & a>c)										//verifica se B>A>C
		{
			System.out.println("O maior valor é "+ b + ", o segundo maior é "+ a +" e o menor é "+ c);
		}
		
		if (b>c & c>a )										//verifica se B>C>A
		{
			System.out.println("O maior valor é "+ b + ", o segundo maior é "+ c +" e o menor é "+ a);
		}
		
						
		if (c>a & a>b)										//verifica se C>A>B
		{
			System.out.println("O maior valor é "+ c + ", o segundo maior é "+ a +" e o menor é "+ b);
		}
		
		if (c>b & b>a)										//verifica se C>B>A
		{
			System.out.println("O maior valor é "+ c + ", o segundo maior é "+ b +" e o menor é "+ a);
		}
		
		else if(a == c | b == a |c == b)
		{
			System.out.println("Alguns valores são iguais, não será possível colocar em ordem crescente");
		}
	}
}
