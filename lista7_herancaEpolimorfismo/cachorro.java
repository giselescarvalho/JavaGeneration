package lista7_herancaEpolimorfismo;

public class cachorro extends animais {
	
	public cachorro (String nome, String som, int idade, String comportamento)
	{
		super(nome, som, idade, comportamento);
	}

	public void imprimir() 
	{
		System.out.println("Cachorro: "+super.getNome()+"\nSom: "+super.getSom()+"\nIdade: "+super.getIdade()+" anos\nComportamento: "+super.getComportamento());
	}
}