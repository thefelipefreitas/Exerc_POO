package telas;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FormLayout extends Application {
	public void start(Stage stage) {

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(10);
		grid.setVgap(8);

		Scene scn = new Scene(grid, 650, 200);
		stage.setScene(scn);
		stage.setTitle("Formulário");

		Label id = new Label("Id");
		GridPane.setConstraints(id, 0, 0);

		Label nome = new Label("Nome");
		GridPane.setConstraints(nome, 0, 1);

		Label telefone = new Label("Telefone");
		GridPane.setConstraints(telefone, 0, 2);

		TextField txtFld = new TextField("209384908");
		GridPane.setConstraints(txtFld, 1, 0);

		TextField txtFld2 = new TextField("Felipe Freitas da Silva");
		GridPane.setConstraints(txtFld2, 1, 1);

		TextField txtFld3 = new TextField("(11) 98347-3473");
		GridPane.setConstraints(txtFld3, 1, 2);

		Button btnSalvar = new Button("Salvar");
		GridPane.setConstraints(btnSalvar, 0, 3);

		Button btnPesq = new Button("Pesquisar");
		GridPane.setConstraints(btnPesq, 1, 3);

		grid.getChildren().addAll(id, nome, telefone, txtFld, txtFld2, txtFld3, btnSalvar, btnPesq);

		stage.show();
	}

	public static void main(String[] args) {
		System.out.println("Teste de Java FX");
		Application.launch(FormLayout.class, args);
	}
}
