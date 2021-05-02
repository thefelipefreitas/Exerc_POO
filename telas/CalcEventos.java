package telas;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalcEventos extends Application implements EventHandler<MouseEvent> {

	private TextField txtFld;
	private Button btnZera, btn1, btn2, btn3, btnSoma, btn4, btn5, btn6, btnSub, btn7, btn8, btn9, btnMult, btnVirg,
			btn0, btnResul, btnDiv;

	public void start(Stage stage) {
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(10);
		grid.setVgap(8);

		Scene scn = new Scene(grid, 280, 180);
		stage.setScene(scn);
		stage.setTitle("Calculadora");

		txtFld = new TextField("0");
		GridPane.setConstraints(txtFld, 0, 0);

		btnZera = new Button("CE");
		GridPane.setConstraints(btnZera, 1, 0);
		btnZera.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btn1 = new Button("1");
		GridPane.setConstraints(btn1, 0, 1);
		btn1.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btn2 = new Button("2");
		GridPane.setConstraints(btn2, 1, 1);
		btn2.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btn3 = new Button("3");
		GridPane.setConstraints(btn3, 2, 1);
		btn3.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btnSoma = new Button("+");
		GridPane.setConstraints(btnSoma, 3, 1);
		btnSoma.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btn4 = new Button("4");
		GridPane.setConstraints(btn4, 0, 2);
		btn4.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btn5 = new Button("5");
		GridPane.setConstraints(btn5, 1, 2);
		btn5.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btn6 = new Button("6");
		GridPane.setConstraints(btn6, 2, 2);
		btn6.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btnSub = new Button("-");
		GridPane.setConstraints(btnSub, 3, 2);
		btnSub.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btn7 = new Button("7");
		GridPane.setConstraints(btn7, 0, 3);
		btn7.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btn8 = new Button("8");
		GridPane.setConstraints(btn8, 1, 3);
		btn8.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btn9 = new Button("9");
		GridPane.setConstraints(btn9, 2, 3);
		btn9.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btnMult = new Button("*");
		GridPane.setConstraints(btnMult, 3, 3);
		btnMult.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btnVirg = new Button(",");
		GridPane.setConstraints(btnVirg, 0, 4);
		btnVirg.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btn0 = new Button("0");
		GridPane.setConstraints(btn0, 1, 4);
		btn0.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btnResul = new Button("=");
		GridPane.setConstraints(btnResul, 2, 4);
		btnResul.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		btnDiv = new Button("/");
		GridPane.setConstraints(btnDiv, 3, 4);
		btnDiv.addEventFilter(MouseEvent.MOUSE_PRESSED, this);

		grid.getChildren().addAll(txtFld, btnZera, btn1, btn2, btn3, btnSoma, btn4, btn5, btn6, btnSub, btn7, btn8,
				btn9, btnMult, btnVirg, btn0, btnResul, btnDiv);

		stage.show();
	}

	public void handle(MouseEvent event) {

		if (event.getSource() == btnZera) {
			txtFld.setText("0");
		} else if (event.getSource() == btn1) {
			txtFld.setText("1");
		} else if (event.getSource() == btn2) {
			txtFld.setText("2");
		} else if (event.getSource() == btn3) {
			txtFld.setText("3");
		} else if (event.getSource() == btnSoma) {
			txtFld.setText(" ");
		} else if (event.getSource() == btn4) {
			txtFld.setText("4");
		} else if (event.getSource() == btn5) {
			txtFld.setText("5");
		} else if (event.getSource() == btn6) {
			txtFld.setText("6");
		} else if (event.getSource() == btnSub) {
			txtFld.setText(" ");
		} else if (event.getSource() == btn7) {
			txtFld.setText("7");
		} else if (event.getSource() == btn8) {
			txtFld.setText("8");
		} else if (event.getSource() == btn9) {
			txtFld.setText("9");
		} else if (event.getSource() == btnMult) {
			txtFld.setText(" ");
		} else if (event.getSource() == btnVirg) {
			txtFld.setText(",");
		} else if (event.getSource() == btn0) {
			txtFld.setText("0");
		} else if (event.getSource() == btnResul) {
			txtFld.setText(" ");
		} else if (event.getSource() == btnDiv) {
			txtFld.setText(" ");
		}

	}

	public static void main(String[] args) {
		Application.launch(CalcEventos.class, args);
	}
}