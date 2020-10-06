/* 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. */
package PacoteJava;

import java.util.Scanner;

public class ex2 {
	
	public static void main (String args[]) 
	{
		int diastotais, anos, meses, dias, rmes, rvari, rdias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com sua idade em dias: ");
		diastotais=ler.nextInt();
		
		anos = diastotais/365;
		rvari = anos*365;
		rmes = (diastotais - rvari)/12;
		rdias = (rmes-30);
		
		System.out.println("Você tem cerca de: "+anos+" anos e "+rmes+" mês/meses e "+rdias+" dias de vida");
		
		
	}
	
}
