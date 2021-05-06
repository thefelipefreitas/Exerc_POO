package aluno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AlunoBoundary extends Application implements EventHandler<ActionEvent> {

	private TextField txtId = new TextField("");
	private TextField txtRa = new TextField("");
	private TextField txtNome = new TextField("");
	private TextField txtNascimento = new TextField("");

	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private AlunoControl control = new AlunoControl();

	public void start(Stage stage) throws Exception {

		GridPane grid = new GridPane();
		Scene scn = new Scene(grid, 450, 150);
		grid.setPadding(new Insets(10, 10, 10, 10));

		grid.add(new Label("Id: "), 0, 0);
		grid.add(txtId, 1, 0);
		grid.add(new Label("Ra: "), 0, 1);
		grid.add(txtRa, 1, 1);
		grid.add(new Label("Nome: "), 0, 2);
		grid.add(txtNome, 1, 2);
		grid.add(new Label("Nascimento: "), 0, 3);
		grid.add(txtNascimento, 1, 3);
		grid.add(btnAdicionar, 0, 4);
		grid.add(btnPesquisar, 1, 4);

		btnAdicionar.addEventFilter(ActionEvent.ACTION, this);
		btnPesquisar.addEventFilter(ActionEvent.ACTION, this);

		stage.setScene(scn);
		stage.setTitle("Gestão de Alunos");
		stage.show();
	}

	public Aluno boundaryToEntity() {
		Aluno e = new Aluno();
		try {
			e.setRa(txtRa.getText());
			e.setNome(txtNome.getText());

			e.setId(Long.parseLong(txtId.getText()));
			LocalDate n = LocalDate.parse(txtNascimento.getText(), formatter);
			e.setNascimento(n);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return e;
	}

	public void entityToBoundary(Aluno e) {
		if (e != null) {
			try {
				txtRa.setText(e.getRa());
				txtNome.setText(e.getNome());

				String txtData = e.getNascimento().format(formatter);
				txtNascimento.setText(txtData);
				txtId.setText(String.valueOf(e.getId()));
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public void handle(ActionEvent event) {
		if (event.getSource() == btnAdicionar) {
			Aluno a = this.boundaryToEntity();
			control.adicionar(a);
		} else if (event.getSource() == btnPesquisar) {
			Aluno a = control.pesquisarPorNome(txtNome.getText());
			this.entityToBoundary(a);
		}
	}

	public static void main(String[] args) {
		Application.launch(AlunoBoundary.class, args);
	}

}