package aeroporto;

public class Aeronave {

	protected String nome;
	protected String categoria;
	protected int capacidade;

	public Aeronave(String nome, String categoria, int capacidade) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.capacidade = capacidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "Nome Aeronave: " + nome + "| Categoria: " + categoria + "| Capacidade: " + capacidade;
	}

	public void decolar() {
		System.out.println("Avião decolou!");
	}

}
