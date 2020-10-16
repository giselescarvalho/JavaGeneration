package lista06_poo;

public class Pessoa {
	private String nome;
	private String endereco;
	private String Cpf;
	private int Telefone;
	private int idade;
	
	public Pessoa (String nome, String endereco, String Cpf, int Telefone, int idade)
	{
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.Cpf = Cpf;
		this.Telefone = Telefone;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String Cpf) {
		this.Cpf = Cpf;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int Telefone) {
		this.Telefone = Telefone;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void validaCpf()
	{
		if(getCpf().length()!=11)
		{
			System.out.println("CPF INVÁLIDO");
		}
		else {
			System.out.println("CPF VÁLIDO");
		}
	}

}
