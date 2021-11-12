/*******************************************************************************
 * Copyright (c) 2021 Red Hat Inc. and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.shellwax.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.ITextContentDescriber;

public class BashShebangContentDescriber implements ITextContentDescriber {

	@Override
	public int describe(InputStream contents, IContentDescription description) throws IOException {
		return describe(new InputStreamReader(contents), description);
	}

	@Override
	public QualifiedName[] getSupportedOptions() {
		return null;
	}

	@Override
	public int describe(Reader contents, IContentDescription description) throws IOException {
		if (description == null || description.getContentType() == null || !"org.eclipse.shellwax.shebang".equals(description.getContentType().getId())) {
			return INDETERMINATE;
		}
		BufferedReader reader = new BufferedReader(contents);
		String line = reader.readLine();
		if (line == null) {
			return INVALID;
		}
		if (line.startsWith("#!") && (line.contains("bash")|| line.contains("bin/sh"))) {
			return VALID;
		}
		return INVALID;
	}

}
