/* 7. Um sistema de equações lineares do tipo:  ax+by=c   e   dx+ey = f
 * pode ser resolvido segundo mostrado abaixo : x=(ce-bf)/(ae-bd), y=(af-cd)/(ae-bd)
 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
 */

package PacoteJava;

import java.util.Scanner;

public class ex7 {
	public static void main (String args[])
	{
	
		int a,b,c,d,e,f,x,y;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com o valor de A: ");
		a = ler.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = ler.nextInt();
		System.out.println("Entre com o valor de C: ");
		c = ler.nextInt();
		System.out.println("Entre com o valor de D: ");
		d = ler.nextInt();
		System.out.println("Entre com o valor de D: ");
		e = ler.nextInt();
		System.out.println("Entre com o valor de F: ");
		f = ler.nextInt();
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
			
		
		System.out.printf("O valor de x é: "+ x +"\ne o valor de y é: "+ y);
		
	}

}
