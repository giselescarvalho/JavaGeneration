/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */
package Extras;

import java.util.*;

public class lista2_exercicio3lace {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a,b,c,d,aa,bb,cc,dd;
		
		System.out.println("Entre com o primeiro número: ");
		a = ler.nextInt();
		System.out.println("Entre com o segundo número: ");
		b = ler.nextInt();
		System.out.println("Entre com o terceiro número: ");
		c = ler.nextInt();
		System.out.println("Entre com o quarto número: ");
		d = ler.nextInt();
		
		aa = a*a;
		bb = b*b;
		cc = c*c;
		dd = d*d;
		
		if (cc>=1000) 
		{
			System.out.println("O quadrado do terceiro número é: "+cc+".\nPrograma finalizado :)");
		}
		
		else
		{
			System.out.println("O quadrado do primeiro número é: "+aa);
			System.out.println("O quadrado do segundo número é: "+bb);
			System.out.println("O quadrado do terceiro número é: "+cc);
			System.out.println("O quadrado do quarto número é: "+dd);
		}
		
	}
}
