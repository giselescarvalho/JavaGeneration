/* Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
 * d = (r+s)/2    onde   r = (a+b)^2     e    s = (b+c)^2
 */
package PacoteJava;

import java.util.Scanner;

public class ex4 {
	public static void main (String args[])
	{
		
		int d, r, s, a,b,c;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o valor de a: ");
		a = ler.nextInt();
		System.out.println("Entre com o valor de b: ");
		b = ler.nextInt();
		System.out.println("Entre com o valor de c: ");
		c = ler.nextInt();
		
		
		r = ((a * a) + (2*( a * b)) + ( b * b));
		s = (b + b)+(2*(b*c))+(c*c);
		
		d = (r + s)/2;
		
		System.out.println("O valor de d = (r+s)/2 é: " + d);	
				
	}
	
}
