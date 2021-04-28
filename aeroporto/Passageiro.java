package aeroporto;

public class Passageiro extends Pessoa {

	protected int numRg;
	protected int numPassagem;
	protected int numPassaporte;

	public Passageiro(String nome, String sobrenome, int idade, int numRg, int numPassagem, int numPassaporte) {
		super(nome, sobrenome, idade);
		this.numRg = numRg;
		this.numPassagem = numPassagem;
		this.numPassaporte = numPassaporte;
	}

	public int getNumRg() {
		return numRg;
	}

	public void setNumRg(int numRg) {
		this.numRg = numRg;
	}

	public int getNumPassagem() {
		return numPassagem;
	}

	public void setNumPassagem(int numPassagem) {
		this.numPassagem = numPassagem;
	}

	public int getNumPassaporte() {
		return numPassaporte;
	}

	public void setNumPassaporte(int numPassaporte) {
		this.numPassaporte = numPassaporte;
	}

	@Override
	public String toString() {
		return "Nome Completo Passageiro: " + nome + " " + sobrenome + "| Idade: " + idade + "| RG: " + numRg
				+ "| Passagem: " + numPassagem + "| Passaporte: " + numPassaporte;
	}

	public void entrar() {
		System.out.println(this.nome + " entrou no avão!");
	}
}
