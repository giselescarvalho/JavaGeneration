/*5-	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 * No final, mostre a soma dos n�meros digitados.
 * (DO...WHILE)*/

package exerciciosfor;

import java.util.*;

public class ex5 {
	public static void main (String args[])
	{
		int idade, cont=0;
		
		Scanner ler = new Scanner(System.in);

		do
		{
			System.out.println("Entre com a idade : ");
			idade=ler.nextInt();
			
			cont=cont+idade;
			
		}while(idade>0);
		
		System.out.println("a soma foi de : " + cont);
	}
}
