/*  1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.  */
package PacoteJava;

import java.util.Scanner;

public class ex1 {
	public static void main (String arg[])
	{
		int anos, dias, meses, diastotais;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com sua idade em anos: ");
		anos=ler.nextInt();
		System.out.println("Entre com os meses: ");
		meses=ler.nextInt();
		System.out.println("Entre com os dias: ");
		dias=ler.nextInt();
	
		diastotais = (anos*365) + (meses*12) + (dias);
		
		System.out.println("Você tem por volta de: "+diastotais+" dias de vida");
		
	}
	

}
