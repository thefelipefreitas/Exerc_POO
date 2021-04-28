package telas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CalcFixa extends Application {
	public void start(Stage stage) {
		Pane pane = new Pane();
		Scene scn = new Scene(pane);

		TextField txtFld = new TextField("0");

		Button btn0 = new Button("0");
		btn0.relocate(50, 135);

		Button btn1 = new Button("1");
		btn1.relocate(20, 45);

		Button btn2 = new Button("2");
		btn2.relocate(50, 45);

		Button btn3 = new Button("3");
		btn3.relocate(80, 45);

		Button btn4 = new Button("4");
		btn4.relocate(20, 75);

		Button btn5 = new Button("5");
		btn5.relocate(50, 75);

		Button btn6 = new Button("6");
		btn6.relocate(80, 75);

		Button btn7 = new Button("7");
		btn7.relocate(20, 105);

		Button btn8 = new Button("8");
		btn8.relocate(50, 105);

		Button btn9 = new Button("9");
		btn9.relocate(80, 105);

		Button btnSoma = new Button("+");
		btnSoma.relocate(110, 45);

		Button btnMult = new Button("*");
		btnMult.relocate(110, 105);

		Button btnSub = new Button("-");
		btnSub.relocate(110, 75);

		Button btnDiv = new Button("/");
		btnDiv.relocate(110, 135);

		Button btnVirg = new Button(",");
		btnVirg.relocate(20, 135);

		Button btnResul = new Button("=");
		btnResul.relocate(80, 135);

		Button btnZera = new Button("CE");
		btnZera.relocate(170, 9);

		pane.getChildren().add(txtFld);
		txtFld.relocate(17, 9);

		pane.getChildren().addAll(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSoma, btnMult, btnSub,
				btnDiv, btnVirg, btnResul, btnZera);

		stage.setScene(scn);
		stage.setTitle("Calculadora");
		stage.setWidth(225);
		stage.setHeight(205);
		stage.show();
	}

	public static void main(String[] args) {
		System.out.println("Teste de Java FX");
		Application.launch(CalcFixa.class, args);
	}
}