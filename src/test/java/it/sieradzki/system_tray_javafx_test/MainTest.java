package it.sieradzki.system_tray_javafx_test;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hamcrest.Matcher;
import org.hamcrest.beans.HasPropertyWithValue;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.testfx.api.FxAssert;
import org.testfx.framework.junit.ApplicationTest;

import static org.hamcrest.core.Is.is;
import static org.testfx.api.FxAssert.verifyThat;

public class MainTest extends ApplicationTest {

	private SystemTrayController systemTrayController;

	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene(new MainPane(), 400, 300);
		stage.setScene(scene);

		systemTrayController = new SystemTrayController();

		stage.show();
	}

	@Override
	public void stop() throws Exception {
		systemTrayController.shutdown();
	}

	@Test
	public void clickingButtonChangesItsText() {
		clickOn(".button");
		verifyThat(".button", HasPropertyWithValue.<Node>hasProperty("text", is("Clicked")));
	}
}
