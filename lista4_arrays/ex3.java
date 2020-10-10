/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

package Vetores;

import java.util.*;

public class ex3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int[][] num = new int[3][3];
		int i, j, contdez=0;
		
		for (i=0; i<3;i++)
		{	
			for ( j = 0; j<3 ; j++)
			{
			System.out.printf("Digite um valor que será armazenado M[%d][%d]: ", + i+1, j+1);
			num[i][j]=ler.nextInt();
			
			if(num[i][j] > 10)
			{
				contdez++;
			}
			}
		} 	
		
		System.out.println("A matriz: ");
		
		for (i=0; i<3;i++)
		{	
			for ( j = 0; j<3 ; j++)
			{
			System.out.printf(" [%d] ", num[i][j]);
			}
			
			System.out.println(" ");
		}
			
		System.out.printf("A quantidade de números maior que 10 é: " + contdez);
		
	} 
			
}

