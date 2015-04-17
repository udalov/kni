# /bin/sh

java -classpath out/production/knirator/:out/production/indexer/:out/production/stub-generator/:lib/kotlin-runtime.jar:lib/protobuf-java-2.6.0.jar:lib/kotlinc/lib/kotlin-reflect.jar -Djava.library.path=dist/build/indexer/native org.jetbrains.kni.jnrator.JnratorPackage "$@"
