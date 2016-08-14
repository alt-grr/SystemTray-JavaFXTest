package it.sieradzki.system_tray_javafx_test;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class MainPane extends HBox {

	public MainPane() {
		Button button = new Button("Test");
		button.setOnAction(event -> button.setText("Clicked"));
		getChildren().add(button);
	}
}
