/*2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) */

package exerciciosfor;

import java.util.*;

public class ex2 {
 public static void main (String args[])
 {
	 int x, num, cont=0, contimpar=0, contpar=0;
	 
	Scanner ler = new Scanner (System.in);
		
	System.out.println("Esse programa l� 10 n�meros e informa de quantos s�o pares ou �mpares");
	
	for(x=0;x<10;x++)
	{
		System.out.println("Entre com um n�mero: ");
		num=ler.nextInt();
		
		if(num%2 == 0)
		{
			contpar ++;
		}
		
		else
		{
			contimpar ++;
		}
	 }
		
	System.out.println("O total de n�meros pares foi: " + contpar);
	System.out.println("O total de n�meros �mpares foi: " + contimpar);
	
 }
}
