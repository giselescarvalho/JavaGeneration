/*1-	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */

package PacoteJava;

import java.util.Scanner;
import java.math.*;

public class Exercicio4 {
	public static void main (String args[]) 
	{
		int num, quadrado;
		double raiz;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com um n�mero: ");
		num = ler.nextInt();
	
		if (num == 2) 
		{	
			System.out.println("O n�mero 2 � par e a raiz quadrada � irracional");
		}
		
		if (num % 2 == 0) 
		{
			raiz = Math.sqrt(num);
			System.out.println("O n�mero " + num + " � par e sua raiz quadrada �: " + raiz);
		}
	
		if (num % 2 == 1) 
		{
			quadrado = num*num;
			System.out.println(" O n�mero" + num + " � �mpar e o quadrado do n�mero �: " + quadrado);
		}
		
		else
		{
			System.out.println("N�o foi poss�vel calcular a raiz ou quadrado do n�mero informado");
		}
	
	
	}	

}