package lista7_herancaEpolimorfismo;

public class preguica extends animais {
	
	public preguica(String nome, String som, int idade, String comportamento)
	{
		super(nome, som, idade, comportamento);
		
	}
	public void imprimir() 
	{
		System.out.println("Preguiça: "+super.getNome()+"\nSom: "+super.getSom()+"\nIdade: "+super.getIdade()+" anos\nComportamento: "+super.getComportamento());
	}
}
