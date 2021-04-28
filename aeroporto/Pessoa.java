package aeroporto;

public class Pessoa {

	protected String nome;
	protected String sobrenome;
	protected int idade;

	public Pessoa(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome Completo Pessoa: " + nome + " " + sobrenome + "| Idade: " + idade;
	}

	public void andar() {
		System.out.println(this.nome + " andando...");
	}

}
