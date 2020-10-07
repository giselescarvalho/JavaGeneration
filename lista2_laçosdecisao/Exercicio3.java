/*3-	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
•	10-14 infantil
•	15-17 juvenil
•	18-25 adulto
*/
package PacoteJava;

import java.util.*;

public class Exercicio3 {
	public static void main (String args[])
	{
		int idade;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com a sua idade para saber a categoria: ");
		idade = ler.nextInt();
		
		if (idade>=10 & idade<=14)
		{
			System.out.println("A categoria é infantil");
		}
		
		if (idade>=15 & idade<=14)
		{
			System.out.println("A categoria é juvenil");
		}
		
		if (idade>=18 & idade<=25)
		{
			System.out.println("A categoria é adulto");
		}
		
		else
		{
			System.out.println("Não tem uma categoria para essa idade");
		}
		
		
	}
}
