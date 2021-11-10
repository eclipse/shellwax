package org.eclipse.shellwax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.ITextContentDescriber;

public class ContentDescriber implements ITextContentDescriber {

	public ContentDescriber() {
	}

	@Override
	public int describe(InputStream contents, IContentDescription description) throws IOException {
		String line = new BufferedReader(new InputStreamReader(contents)).readLine();
		if (line.startsWith("#!") && line.contains("bash")) {
			return VALID;
		}
		return INVALID;
	}

	@Override
	public QualifiedName[] getSupportedOptions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int describe(Reader contents, IContentDescription description) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

}
