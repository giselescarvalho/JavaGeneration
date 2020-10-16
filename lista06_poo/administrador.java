package lista06_poo;

public class administrador extends Pessoa {			//nao retorna nada
	private double ajudaDeCusto;
	
	public administrador(String nome, String endereco, String Cpf, int Telefone, int idade, double ajudaDeCusto)
	{
		super(nome,endereco,Cpf,Telefone,idade);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public void gastoAjuda(double valor){
		ajudaDeCusto -= valor;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public void imprimainf() {
		System.out.printf("Nome do administrador: %s",getNome());
		System.out.println("\nIdade: "+getIdade());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("CPF: "+getCpf());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("Saldo da ajuda de custo no valor de: "+ajudaDeCusto);
		
	}


}


