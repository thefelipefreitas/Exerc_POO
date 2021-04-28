package aeroporto;

public class Piloto extends Pessoa {

	protected String categoria;
	protected int breve;
	protected int horasVoo;

	public Piloto(String nome, String sobrenome, int idade, String categoria, int breve, int horasVoo) {
		super(nome, sobrenome, idade);
		this.categoria = categoria;
		this.breve = breve;
		this.horasVoo = horasVoo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getBreve() {
		return breve;
	}

	public void setBreve(int breve) {
		this.breve = breve;
	}

	public int getHorasVoo() {
		return horasVoo;
	}

	public void setHorasVoo(int horasVoo) {
		this.horasVoo = horasVoo;
	}

	@Override
	public String toString() {
		return "Nome Completo Piloto: " + nome + " " + sobrenome + "| Idade:" + idade + "| Categoria: " + categoria
				+ "| Brevê: " + breve + "| Horas Voo: " + horasVoo;
	}

	public void pilotar() {
		System.out.println(this.nome + " pilotando...");
	}

}
