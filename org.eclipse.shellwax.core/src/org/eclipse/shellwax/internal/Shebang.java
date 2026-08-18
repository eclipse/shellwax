/*******************************************************************************
 * Copyright (c) 2026 Aleksandar Kurtakov and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.shellwax.internal;

/**
 * Shared shebang detection used by content type describer and decorator.
 */
final class Shebang {

	private Shebang() {
	}

	/**
	 * @param line first line of a file, may be {@code null}
	 * @return {@code true} if the line is a shebang pointing to bash or sh
	 */
	static boolean isShell(String line) {
		return line != null && line.startsWith("#!") //$NON-NLS-1$
				&& (line.contains("bash") || line.contains("bin/sh")); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
