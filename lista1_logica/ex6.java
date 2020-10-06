/*Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
 * P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �: V(x2-x1)^2 + (y2-y1)^2 */
package PacoteJava;

import java.util.Scanner;
import java.lang.Math;


public class ex6 {
	public static void main (String args[])
	{
		int x1, x2, y1, y2, d;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com o valor de x1: ");
		x1 = ler.nextInt();
		System.out.println("Entre com o valor de x2: ");
		x2 = ler.nextInt();
		System.out.println("Entre com o valor de y1: ");
		y1 = ler.nextInt();
		System.out.println("Entre com o valor de y2: ");
		y2 = ler.nextInt();
	
		d = (int) (Math.sqrt((Math.pow(x2-x1,2.0))+(Math.pow(y2-y1,2.0))));
		
		System.out.printf("O valor do c�culo da raiz quadrada de (x2-x1)^2 + (y2-y1)^2 �: " + d);
	
	}
}
