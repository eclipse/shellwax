# Eclipse ShellWax: Release notes

This page describes the noteworthy improvements provided by each release of Eclipse ShellWax.


### Next release...


## 1.1.4

* 📅 Release Date: October 12th, 2021
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
