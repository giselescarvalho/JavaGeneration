/*4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira 
 diagonal, ou seja, diagonal principal. */

package Extras;

import java.util.*;

public class lista4_exercicio4matriz {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		int TAMANHO = 3;
		int[][] matriz = new int[3][3];
		int linha,col,somadiag=0,somatodos=0;

			for(linha=0;linha<TAMANHO;linha++)
			{
				for (col=0;col<3;col++)
				{
					System.out.println("Valor: ");            // recebe os valores
					(matriz[linha][col])= ler.nextInt();
				
					somatodos=somatodos+matriz[linha][col];			
				}			
			}

			
			for(linha=0;linha<TAMANHO;linha++)    //só escreve (print)
			{
				for(col=0;col<3;col++)
				{
					System.out.printf(" ["+ matriz[linha][col]+"] ");

					if(linha==col)
					{
						somadiag=somadiag+matriz[linha][col];
					}
					
				}	System.out.println("\n");
						
			}
				

			System.out.println("\nA soma dos valores colocados foi: "+ somatodos);
			System.out.println("A soma dos valores diagonais foi: "+ somadiag);
		}
}