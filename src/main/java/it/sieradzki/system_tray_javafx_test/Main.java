package it.sieradzki.system_tray_javafx_test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	private SystemTrayController systemTrayController;

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setScene(new Scene(new MainPane()));

		systemTrayController = new SystemTrayController();

		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		systemTrayController.shutdown();
	}
}
