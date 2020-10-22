/*2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.
*/
package Extras;
import java.util.Scanner;
public class lista3_exercicio6laçorepetição {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n,cont=1,tot=0;

		System.out.println("Entre com um número inteiro: ");
		n = ler.nextInt();
		
		do
		{
		tot=cont+tot;
		cont++;
		} while(n>=cont);
			
		System.out.println("O resultado dessa progressão é: "+tot);
	}
}
