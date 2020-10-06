/* 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, 
 * minutos e segundos. */
package PacoteJava;

import java.util.Scanner;

public class ex3 {
	public static void main (String args[])
	{
		
		int segundosTotais, seg, min=0, horas, h, m=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o tempo do evento em segundos: ");
		segundosTotais = ler.nextInt();
		
		horas = segundosTotais/3600; 		//descobrir as horas como um inteiro
		h = horas*3600; 					//para subtrair a hora como inteiro dos segundos totais e continuar a conta
		min = 	(segundosTotais - h)/60;    //descobrir os minutos
		m = min*60;  						//para substrair os minutos como inteiro dos segundos totais
		seg = (segundosTotais - m)/60;		//descobrir os segundos restantes
		
		System.out.println("O evento durou: "+horas+" horas "+min+" minutos e "+seg+" segundos");
		
	}

}
