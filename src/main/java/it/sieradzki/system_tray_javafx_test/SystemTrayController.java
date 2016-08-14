package it.sieradzki.system_tray_javafx_test;

import dorkbox.systemTray.SystemTray;

import java.net.MalformedURLException;

public class SystemTrayController {

	private SystemTray systemTray;

	public SystemTrayController() throws MalformedURLException {
		systemTray = SystemTray.getSystemTray();

		if (systemTray == null) {
			throw new IllegalStateException("No tray available!");
		}

		systemTray.setIcon(this.getClass().getResource("/experiment.png"));
		systemTray.setStatus("Status");
	}

	public void shutdown() {
		systemTray.shutdown();
	}
}
