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

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.lsp4e.server.ProcessStreamConnectionProvider;

public class BashLanguageServer extends ProcessStreamConnectionProvider {

	public BashLanguageServer() {
		List<String> commands = new ArrayList<>();
		commands.add("/usr/bin/node");
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
