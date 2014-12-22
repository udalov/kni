# Kotlin Native Interop

This project aims to bring native libraries to [Kotlin](https://github.com/JetBrains/kotlin) on JVM.
This is **work in progress** and currently only basic Objective-C interoperability on Mac OS X is supported.

## Prerequisites

You should have Xcode Command Line Tools installed.

Also, unfortunately, at the moment you need to install system-wide LLVM (3.5.0) via [Homebrew](http://brew.sh)
(this is likely to improve in the future):

```sh
$ brew install llvm --with-clang
```

Be aware that LLVM build can take a long time (about half an hour on an average Mac).

See [these instructions](http://stackoverflow.com/questions/3987683/homebrew-install-specific-version-of-formula)
on installing a specific version of a formula if, for example, you have a newer version already installed.

## Building

Before the first build you should run

```sh
$ ant -f update_dependencies.xml
```

or "Update dependencies" run configuration from IDEA (Ant support plugin should be turned on).
This will fetch dependencies and build third-party libraries.

Then run

```sh
$ ant
```

or "Build" run configuration to build artifacts needed for the tests.
Each change to modules "indexer" or "runtime-objc" then needs to be followed by `ant`.

Every time you change .proto or signatures of native methods in Java you need to manually invoke

```sh
$ ant gen
```

If you forget to do so and run `ant` as usual, the build will fail, prompting you to invoke `ant gen` first.

## Running tests

Run "All Tests" run configuration from IntelliJ IDEA.

Note that manual running of tests (right-click + Run/Debug) will not work unless the options are set to those of the "All Tests" run configuration.
To fix this for the local project, go to Run Configurations -> Defaults -> JUnit and copy VM options and working directory of "All Tests" there.

## License

Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).
