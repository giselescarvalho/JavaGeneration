package lista7_herancaEpolimorfismo;

public class animais {
	private String nome;
	private String som;
	private int idade;
	private String comportamento;
	
	public animais (String nome, String som, int idade, String comportamento)
	{
		this.nome = nome;
		this.som = som;
		this.idade = idade;
		this.comportamento = comportamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getComportamento() {
		return comportamento;
	}

	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}

	
}