# Eclipse ShellWax

[![Build Tycho](https://github.com/eclipse-shellwax/shellwax/actions/workflows/maven.yml/badge.svg)](https://github.com/eclipse-shellwax/shellwax/actions/workflows/maven.yml)
<a href="https://mickaelistria.github.io/redirctToEclipseIDECloneCommand/redirect.html"><img src="https://mickaelistria.github.io/redirctToEclipseIDECloneCommand/cloneToEclipseBadge.png" alt="Clone to Eclipse IDE"/></a>

### Shell script edition in Eclipse IDE

ShellWax is a shell script development plugin for the Eclipse IDE, providing a rich edition experience through integration with the [Bash Language Server](https://github.com/bash-lsp/bash-language-server).

## Download/Install

With Eclipse IDE properly installed on your machine, just click [HERE](eclipse+mpc://marketplace.eclipse.org/install/4528322)

_OR_

Browse to https://marketplace.eclipse.org/content/shellwax and follow installation instructions

_OR_

From a working Eclipse IDE, install from the Update Site:
- Releases: [https://download.eclipse.org/shellwax/releases/latest/](https://download.eclipse.org/shellwax/releases/latest/)
- Snapshots (built from `master`): [https://download.eclipse.org/shellwax/snapshots/](https://download.eclipse.org/shellwax/snapshots/)

### Prerequisites
- Eclipse IDE running on Java 25 or newer.
- Bash (`bash`) available on the `PATH`, needed to run scripts. Note: Windows users should have bash installed via [Windows Subsystem For Linux and their distro of choice](https://docs.microsoft.com/en-us/windows/wsl/install-win10).
- Optional: [`shfmt`](https://github.com/mvdan/sh) on the `PATH` to enable the Format command.

Node.js and the Bash Language Server itself are provided automatically: Node.js is embedded via the Wild Web Developer node embedder and the language server is installed on first use.

## Features

ShellWax brings together multiple different sources of features to make an enjoyable developing environment. Here are just a few of the most common features. Download today to discover all ShellWax has to offer.

### Theming

The syntax highlighting is "externalized" to TM4E plugins. You can configure a theme (in the TextMate meaning of a theme) for specific file type in Preferences > TextMate > Grammar, select a language and then click the "Theme" tab on that same page.

### Bash Language Server
The Bash Language Server supplies ShellWax with the majority of the edition abilities. More information can be found at the [Bash Language Server GitHub Repository](https://github.com/bash-lsp/bash-language-server).
- Jump to declaration
- Find references
- Code Outline & Show Symbols
- Highlight occurrences
- Code completion
- Simple diagnostics reporting
- Documentation for flags on hover
- Formatting (when `shfmt` is installed)

### Shebang detection

Files without an extension whose first line is a `#!/bin/sh` or `#!...bash` shebang are recognized as shell scripts: they open in the shell script editor and get the shell script icon.

### Running scripts

Right click a shell script and choose _Run As > Shell Script_ to run it in the Console view. The launch configuration allows setting arguments, the working directory and enabling `-x` to trace executed commands.

### License

ShellWax is an Open Source project licensed under [The Eclipse Public License - v 2.0](https://www.eclipse.org/legal/epl-2.0/)

[More Licensing Information](LICENSE)

### Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md). Issues are tracked in [GitHub issues](https://github.com/eclipse-shellwax/shellwax/issues).
