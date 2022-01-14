# Eclipse ShellWax: Release notes

This page describes the noteworthy improvements provided by each release of Eclipse ShellWax.


### Next release...

## 1.1.6

* 📅 Release Date: January 14th, 2022
* All changes: https://github.com/eclipse/shellwax/compare/1.1.5...1.1.6

### Add MacOS AArch64 support ###

Node embedder from latest Wild Web Developer plugin has support for it thus allows installation on MacOS Arm with bundled Node.js so users don't have to manually install it.

## 1.1.5

* 📅 Release Date: November 15th, 2021
* All changes: https://github.com/eclipse/shellwax/compare/1.1.4...1.1.5

#### Fix content-type detection

Recent changes made that all files could be interpreted as ShellWax files and thus undesired operations from ShellWax could be shown on unrelated files. This is now fixed.

## 1.1.4

* 📅 Release Date: November 12th, 2021
* All changes: https://github.com/eclipse/shellwax/compare/1.1.3...1.1.4

#### Support shell script files without extensions

Files with the following shebang are supported:
- #!/bin/sh
- #!*bash

## 1.1.3

* 📅 Release Date: October 27th, 2021
* All changes: https://github.com/eclipse/shellwax/compare/1.1.2...1.1.3

#### Mac x86_64 and Linux AArch 64 Node.js embedder to the update site

#### Update to use Bash Language Server 2.0.0

Changes in it:
- BREAKING: Drop node 10 support
- Upgrade dependencies
- Adds support for completing command line arguments (https://github.com/bash-lsp/bash-language-server/pull/294)
