/*2- Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os
n�meros de 1 at� ele. Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.
*/
package Extras;
import java.util.Scanner;
public class lista3_exercicio6la�orepeti��o {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n,cont=1,tot=0;

		System.out.println("Entre com um n�mero inteiro: ");
		n = ler.nextInt();
		
		do
		{
		tot=cont+tot;
		cont++;
		} while(n>=cont);
			
		System.out.println("O resultado dessa progress�o �: "+tot);
	}
}
