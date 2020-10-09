/*3-	Solicitar a idade de várias pessoas e imprimir: 
Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando 
 * idade for =-99. (WHILE)*/

package exerciciosfor;

import java.util.*;

public class ex3 {
	public static void main(String args[])
	{
		int anos=0, acumulador21=0, acumulador50=0; 
		
		Scanner ler = new Scanner (System.in);
		
		 while (anos != -99)
		 {
			 System.out.println("Entre com as idades: ");
			 anos = ler.nextInt();
			
			 if(anos > 0 && anos < 21)
			 {
				 acumulador21 = acumulador21+1; 
			 }   
			 
			 if (anos > 50)
			 {
				 acumulador50 = acumulador50+1;
			 }	  	
		 }
		 
		 System.out.println("A quantidade de pessoas menores de 21 foi de: " + acumulador21);
		 System.out.println("A quantidade de pessoas com mais de 50 anos foi: " + acumulador50);
	}

}
