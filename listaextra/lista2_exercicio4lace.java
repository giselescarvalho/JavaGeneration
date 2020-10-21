/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo. 
 */
package Extras;

import java.util.*;

public class lista2_exercicio4lace {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a;
		
		System.out.println("Entre com um número: ");
		a = ler.nextInt();
		
		if(a%2 == 0 && a != 0)
		{
			System.out.println("O número "+a+" é par.\nFim do programa :)");
		}
		
		else
		{
			System.out.println("O número "+a+" é ímpar.\nFim do programa :)");
		}
		
	}
}
