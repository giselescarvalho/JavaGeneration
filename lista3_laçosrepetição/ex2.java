/*2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) */

package exerciciosfor;

import java.util.*;

public class ex2 {
 public static void main (String args[])
 {
	 int x, num, cont=0, contimpar=0, contpar=0;
	 
	Scanner ler = new Scanner (System.in);
		
	System.out.println("Esse programa lê 10 números e informa de quantos são pares ou ímpares");
	
	for(x=0;x<10;x++)
	{
		System.out.println("Entre com um número: ");
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
		
	System.out.println("O total de números pares foi: " + contpar);
	System.out.println("O total de números ímpares foi: " + contimpar);
	
 }
}
