package lista7_herancaEpolimorfismo;

public class cavalo extends animais {
		
	public cavalo (String nome, String som, int idade, String comportamento)
	{
		super(nome, som, idade, comportamento);
	}
	
	public void imprimir() 
	{
		System.out.println("Cavalo: "+super.getNome()+"\nSom: "+super.getSom()+"\nIdade: "+super.getIdade()+" anos \nComportamento: "+super.getComportamento());
	}
	
}
