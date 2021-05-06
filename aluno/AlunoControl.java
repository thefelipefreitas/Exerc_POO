package aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoControl {

	private List<Aluno> lista = new ArrayList<>();

	public void adicionar(Aluno a) {
		lista.add(a);
	}

	public Aluno pesquisarPorNome(String nome) {
		for (Aluno a : lista) {
			if (a.getNome().contains(nome)) {
				return a;
			}
		}
		return null;
	}
}
