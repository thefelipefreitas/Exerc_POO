package telas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FormFixo extends Application {
	public void start(Stage stage) {
		Pane pane = new Pane();
		Scene scn = new Scene(pane);
		Label label = new Label("\n    Id\n\n    Nome\n\n    Telefone");
		TextField txtFld = new TextField (" ");
		TextField txtFld2 = new TextField (" ");
		TextField txtFld3 = new TextField (" ");
		Button btn = new Button("Salvar");
		Button btn2 = new Button("Pesquisar");
		pane.getChildren().add(label);
		pane.getChildren().add(txtFld);
		pane.getChildren().add(txtFld2);
		pane.getChildren().add(txtFld3);
		pane.getChildren().add(btn);
		pane.getChildren().add(btn2);
		txtFld.relocate(150, 9);
		txtFld2.relocate(150, 49);
		txtFld3.relocate(150, 89);
		btn.relocate(10, 115);
		btn2.relocate(58, 115);
		stage.setScene(scn);
		stage.setTitle("Formulário");
		stage.setWidth(650);
		stage.setHeight(200);
		stage.show();
	}

	public static void main(String[] args) {
		System.out.println("Teste de Java FX");
		Application.launch(FormFixo.class, args);
	}
}