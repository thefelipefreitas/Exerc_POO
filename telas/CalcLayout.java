package telas;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalcLayout extends Application {
	public void start(Stage stage) {

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(10);
		grid.setVgap(8);

		Scene scn = new Scene(grid, 225, 205);
		stage.setScene(scn);
		stage.setTitle("Calculadora");

		TextField txtFld = new TextField("0");
		GridPane.setConstraints(txtFld, 0, 0);

		Button btnZera = new Button("CE");
		GridPane.setConstraints(btnZera, 1, 0);

		Button btn1 = new Button("1");
		GridPane.setConstraints(btn1, 0, 1);

		Button btn2 = new Button("2");
		GridPane.setConstraints(btn2, 1, 1);

		Button btn3 = new Button("3");
		GridPane.setConstraints(btn3, 2, 1);

		Button btnSoma = new Button("+");
		GridPane.setConstraints(btnSoma, 3, 1);

		Button btn4 = new Button("4");
		GridPane.setConstraints(btn4, 0, 2);

		Button btn5 = new Button("5");
		GridPane.setConstraints(btn5, 1, 2);

		Button btn6 = new Button("6");
		GridPane.setConstraints(btn6, 2, 2);

		Button btnSub = new Button("-");
		GridPane.setConstraints(btnSub, 3, 2);

		Button btn7 = new Button("7");
		GridPane.setConstraints(btn7, 0, 3);

		Button btn8 = new Button("8");
		GridPane.setConstraints(btn8, 1, 3);

		Button btn9 = new Button("9");
		GridPane.setConstraints(btn9, 2, 3);

		Button btnMult = new Button("*");
		GridPane.setConstraints(btnMult, 3, 3);

		Button btnVirg = new Button(",");
		GridPane.setConstraints(btnVirg, 0, 4);

		Button btn0 = new Button("0");
		GridPane.setConstraints(btn0, 1, 4);

		Button btnResul = new Button("=");
		GridPane.setConstraints(btnResul, 2, 4);

		Button btnDiv = new Button("/");
		GridPane.setConstraints(btnDiv, 3, 4);

		grid.getChildren().addAll(txtFld, btnZera, btn1, btn2, btn3, btnSoma, btn4, btn5, btn6, btnSub, btn7, btn8,
				btn9, btnMult, btnVirg, btn0, btnResul, btnDiv);

		stage.show();
	}

	public static void main(String[] args) {

		System.out.println("Teste de Java FX");
		Application.launch(CalcLayout.class, args);
	}
}
