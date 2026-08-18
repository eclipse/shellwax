# Eclipse ShellWax: Release notes

This page describes the noteworthy improvements provided by each release of Eclipse ShellWax.


### Next release...

## 1.4.0

* 📅 Release Date: TBD
* All changes: https://github.com/eclipse-shellwax/shellwax/compare/1.3.0...1.4.0

### Require Java 25 as runtime JVM ###

* Starting with this ShellWax release it requires Java 25 JVM to be used to run Eclipse for the plugin to work.

### Trace shell script execution ###

* Launch configurations gained an "Enable -x (trace commands)" option that runs the script with `sh -x` and interleaves the trace with the script output in the Console.

### Shell script icon for shebang files ###

* Extension-less files starting with a `#!/bin/sh` or `#!...bash` shebang now show the shell script icon in the Project Explorer and other views.

### Launch configuration names ###

* Newly created launch configurations are named after the script file.

### Bash LS update ###
* Bash LSP dependency has been updated to version 5.6.0 . See [changelog](https://github.com/bash-lsp/bash-language-server/blob/main/server/CHANGELOG.md#560 ) for details.

## 1.3.0

* 📅 Release Date: Oct 7th, 2025
* All changes: https://github.com/eclipse-shellwax/shellwax/compare/1.2.3...1.3.0

### Require Java 21 as runtime JVM ###

* Starting with these ShellWax release it requires Java 21 JVM to be used to run Eclipse for the plugin to work.

### Support Format

* Format command is functional when `shfmt` is installed locally.

### Bash LS update ###
* Bash LSP dependency has been updated to version 5.4.3 . See [changelog](https://github.com/bash-lsp/bash-language-server/blob/main/server/CHANGELOG.md#5.4.3 ) for details.


## 1.2.3

* 📅 Release Date: Jun 6th, 2023
* Bash LSP dependency has been updated to version 4.9.2 . See [changelog](https://github.com/bash-lsp/bash-language-server/blob/main/server/CHANGELOG.md#492 ) for details.
* All changes: https://github.com/eclipse-shellwax/shellwax/compare/1.2.2...1.2.3

## 1.2.2

* 📅 Release Date: Dec 9th, 2022
* Bash LSP dependency has been updated to version 4.1.0 . See [changelog](https://github.com/bash-lsp/bash-language-server/blob/main/server/CHANGELOG.md) for details.
* All changes: https://github.com/eclipse-shellwax/shellwax/compare/1.2.1...1.2.2

## 1.2.1

* 📅 Release Date: Aug 25th, 2022
* All changes: https://github.com/eclipse-shellwax/shellwax/compare/1.2.0...1.2.1

## 1.2.0

* 📅 Release Date: July 12th, 2022
* All changes: https://github.com/eclipse-shellwax/shellwax/compare/1.1.6...1.2.0

### Require Java 17 as runtime JVM ###

Starting with these ShellWax release it requires Java 17 JVM to be used to run Eclipse for the plugin to work.

### Update to Bash LSP 3.0.4 ###

Bash LSP dependency has been updated to version 3.0.4. See [changelog](https://github.com/bash-lsp/bash-language-server/blob/main/server/CHANGELOG.md) for details.

## 1.1.6

* 📅 Release Date: January 14th, 2022
* All changes: https://github.com/eclipse-shellwax/shellwax/compare/1.1.5...1.1.6

### Add MacOS AArch64 support ###

Node embedder from latest Wild Web Developer plugin has support for it thus allows installation on MacOS Arm with bundled Node.js so users don't have to manually install it.

## 1.1.5

* 📅 Release Date: November 15th, 2021
* All changes: https://github.com/eclipse-shellwax/shellwax/compare/1.1.4...1.1.5

#### Fix content-type detection

Recent changes made that all files could be interpreted as ShellWax files and thus undesired operations from ShellWax could be shown on unrelated files. This is now fixed.

## 1.1.4

* 📅 Release Date: November 12th, 2021
* All changes: https://github.com/eclipse-shellwax/shellwax/compare/1.1.3...1.1.4

#### Support shell script files without extensions

Files with the following shebang are supported:
- #!/bin/sh
- #!*bash

## 1.1.3

* 📅 Release Date: October 27th, 2021
* All changes: https://github.com/eclipse-shellwax/shellwax/compare/1.1.2...1.1.3

#### Mac x86_64 and Linux AArch 64 Node.js embedder to the update site

#### Update to use Bash Language Server 2.0.0

Changes in it:
- BREAKING: Drop node 10 support
- Upgrade dependencies
- Adds support for completing command line arguments (https://github.com/bash-lsp/bash-language-server/pull/294)
