/*******************************************************************************
 * Copyright (c) 2019 Red Hat Inc. and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Alexander Kurtakov (Red Hat Inc.)- initial implementation
 *******************************************************************************/
package org.eclipse.shellwax.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.lsp4e.server.ProcessStreamConnectionProvider;
import org.eclipse.swt.widgets.Display;

public class BashLanguageServer extends ProcessStreamConnectionProvider {

	private static boolean alreadyWarned;

	public BashLanguageServer() {
		List<String> commands = new ArrayList<>();
		String nodePath = getNodeJsLocation();
		if (nodePath != null) {
			commands.add(nodePath);
			try {
				URL url = FileLocator.toFileURL(
						getClass().getResource("/languageserver/node_modules/bash-language-server/bin/main.js"));
				commands.add(new java.io.File(url.getPath()).getAbsolutePath());
				commands.add("start");
				setCommands(commands);
				setWorkingDirectory(System.getProperty("user.dir"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static String getNodeJsLocation() {
		String res = "/path/to/node";
		String[] command = new String[] { "/bin/bash", "-c", "which node" };
		if (Platform.getOS().equals(Platform.OS_WIN32)) {
			command = new String[] { "cmd", "/c", "where node" };
		}
		BufferedReader reader = null;
		try {
			Process p = Runtime.getRuntime().exec(command);
			reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			res = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Try default install path as last resort
		if (res == null && Platform.getOS().equals(Platform.OS_MACOSX)) {
			res = "/usr/local/bin/node";
		}

		if (res != null && Files.exists(Paths.get(res))) {
			return res;
		} else if (!alreadyWarned) {
			warnNodeJSMissing();
			alreadyWarned = true;
		}
		return null;
	}

	private static void warnNodeJSMissing() {
		Display.getDefault().asyncExec(() -> {
			MessageDialog.openWarning(Display.getCurrent().getActiveShell(), "Missing node.js",
					"Could not find node.js. This will result in editors missing key features.\n"
							+ "Please make sure node.js is installed and that your PATH environement variable contains the location to the `node` executable.");
		});
	}
}
