/* 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente. */

package PacoteJava;

import java.util.*;

public class Exercicio2 {
	public static void main(String args[]){
		
		int a, b, c;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Esse programa ordena n�meros em ordem crescente");
		System.out.println("Entre com o primeiro n�mero: ");
		a = ler.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
		b = ler.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
		c = ler.nextInt();
		
		if (a>b & b>c) 										//verifica se A>B>C
		{
			System.out.println("O maior valor � "+ a + ", o segundo maior � "+ b +" e o menor � "+ c);
		}
		if (a>c & c>b)										//verifica se A>C>B
		{
			System.out.println("O maior valor � "+ a + ", o segundo maior � "+ c +" e o menor � "+ b);
		}
		
				
		if (b>a & a>c)										//verifica se B>A>C
		{
			System.out.println("O maior valor � "+ b + ", o segundo maior � "+ a +" e o menor � "+ c);
		}
		
		if (b>c & c>a )										//verifica se B>C>A
		{
			System.out.println("O maior valor � "+ b + ", o segundo maior � "+ c +" e o menor � "+ a);
		}
		
						
		if (c>a & a>b)										//verifica se C>A>B
		{
			System.out.println("O maior valor � "+ c + ", o segundo maior � "+ a +" e o menor � "+ b);
		}
		
		if (c>b & b>a)										//verifica se C>B>A
		{
			System.out.println("O maior valor � "+ c + ", o segundo maior � "+ b +" e o menor � "+ a);
		}
		
		else if(a == c | b == a |c == b)
		{
			System.out.println("Alguns valores s�o iguais, n�o ser� poss�vel colocar em ordem crescente");
		}
	}
}
