/*4) Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este
n�mero � par ou �mpar, e se � positivo ou negativo. 
 */
package Extras;

import java.util.*;

public class lista2_exercicio4lace {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a;
		
		System.out.println("Entre com um n�mero: ");
		a = ler.nextInt();
		
		if(a%2 == 0 && a != 0)
		{
			System.out.println("O n�mero "+a+" � par.\nFim do programa :)");
		}
		
		else
		{
			System.out.println("O n�mero "+a+" � �mpar.\nFim do programa :)");
		}
		
	}
}
