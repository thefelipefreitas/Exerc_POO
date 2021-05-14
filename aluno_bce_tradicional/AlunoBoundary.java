package aluno_bce_tradicional;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.LocalDateStringConverter;

public class AlunoBoundary extends Application {

	private TextField txtId = new TextField("");
	private TextField txtRa = new TextField("");
	private TextField txtNome = new TextField("");
	private TextField txtNascimento = new TextField("");
	private AlunoControl control = new AlunoControl();

	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public void start(Stage stage) throws Exception {

		GridPane gp = new GridPane();
		Scene scn = new Scene(gp, 470, 130);

		gp.add(new Label("Id:"), 0, 0);
		gp.add(txtId, 1, 0);
		gp.add(new Label("Ra:"), 0, 1);
		gp.add(txtRa, 1, 1);
		gp.add(new Label("Nome:"), 0, 2);
		gp.add(txtNome, 1, 2);
		gp.add(new Label("Nascimento:"), 0, 3);
		gp.add(txtNascimento, 1, 3);
		gp.add(btnAdicionar, 0, 4);
		gp.add(btnPesquisar, 1, 4);

		btnAdicionar.setOnAction((e) -> {
			control.adicionar();
		});
		btnPesquisar.setOnAction((e) -> {
			control.pesquisarPorNome();
		});

		StringConverter convId = new IntegerStringConverter();
		StringConverter formatter = new LocalDateStringConverter();

		Bindings.bindBidirectional(txtId.textProperty(), control.idProperty(), convId);
		Bindings.bindBidirectional(txtRa.textProperty(), control.raProperty());
		Bindings.bindBidirectional(txtNome.textProperty(), control.nomeProperty());
		Bindings.bindBidirectional(txtNascimento.textProperty(), control.nascimentoProperty(), formatter);

		stage.setScene(scn);
		stage.setTitle("Gestão de Alunos");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(AlunoBoundary.class, args);
	}

}
