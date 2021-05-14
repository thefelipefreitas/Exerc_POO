package aluno_bce_tradicional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AlunoControl {

	private List<Aluno> lista = new ArrayList<>();

	private IntegerProperty id = new SimpleIntegerProperty(0);

	public IntegerProperty idProperty() {
		return id;
	}

	private StringProperty ra = new SimpleStringProperty("");

	public StringProperty raProperty() {
		return ra;
	}

	private StringProperty nome = new SimpleStringProperty("");

	public StringProperty nomeProperty() {
		return nome;
	}
	
    private final ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<>(this, "");
    
    public final ObjectProperty<LocalDate> nascimentoProperty() {
        return nascimento;
    }
	

	public Aluno getEntity() {
		Aluno a = new Aluno();
		a.setId(id.get());
		a.setRa(ra.get());
		a.setNome(nome.get());
		a.setNascimento(nascimento.get());
		return a;
	}

	private void setEntity(Aluno a) {
		if (a != null) {
			id.set(a.getId());
			ra.set(a.getRa());
			nome.set(a.getNome());
			nascimento.set(a.getNascimento());
		}
	}

	public void adicionar() {
		lista.add(getEntity());
	}

	public void pesquisarPorNome() {
		for (Aluno a : lista) {
			if (a.getNome().contains(nome.get())) {
				setEntity(a);
			}
		}
	}

}