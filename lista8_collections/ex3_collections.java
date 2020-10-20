package lista8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ex3_collections {
	public static void main (String args[])
	{
		Collection<String> produtos = new ArrayList();
		
		Scanner ler = new Scanner(System.in);
		int opc;
		boolean sair = false;
		
		do {
			System.out.println("Entre com uma opção:\n"
					+"\n1 - Adicionar produto"
					+"\n2 - Remover produto"
					+"\n3 - Atualizar produto"
					+"\n4 - Mostrar lista de produtos "
					+ "\n0 - Para sair do programa");
			opc = ler.nextInt();
			
			if (opc < 0 || opc >4)
			{
				System.out.println("Opção inválida!!!");
				System.out.println("\nEntre com uma opção:"
						+"\n1 - Adicionar produto"
						+"\n2 - Remover produto"
						+"\n3 - Atualizar produto"
						+"\n4 - Mostrar lista de produtos "
						+ "0 - Para sair do programa: ");
				opc = ler.nextInt();
			}
			
			switch(opc)
			{
			case 0: 
				sair = true;
				break;
				
			case 1:
				ler.nextLine();
				System.out.println("Digite o nome do produto que será adicionado: ");
				String insere = ler.nextLine();
				produtos.add(insere);
				System.out.println("Lista: "+produtos);
				break;
			
			case 2:
				ler.nextLine();
				System.out.println("Digite o nome do produto que será removido: ");
				String deleta = ler.nextLine();
				produtos.remove(deleta);
				System.out.println("Lista: "+produtos);
				break;	
			
			case 3:
				ler.nextLine();
				System.out.println("Digite o nome do produto que será atualizado: ");
				String verifica = ler.nextLine();
				System.out.println("Digite o novo nome do produto atualizado: ");
				String novoProduto = ler.nextLine();
								
				if(produtos.contains(verifica))
				{
					produtos.remove(verifica);
					produtos.add(novoProduto);
				}
				
				System.out.println("Com item atualizado: "+produtos+"\n");
				break;
				
			case 4: 
				for (String product : produtos) 
				{
					System.out.println("Item: "+produtos);
				}
				break;
				
			default: 
				System.out.println("Opção inválida");
				break;
			
			
		} 
		} while(sair != true);
	}
}