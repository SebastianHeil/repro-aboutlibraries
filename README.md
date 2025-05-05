# Repro for AboutLibraries issue with jakarta:inject-api

Steps to reproduce:
* Run `./gradlew exportLibraries` against aboutlibraries 12.0.0 (commit 930b487) => No Unknown licenses found
* Run `./gradlew exportLibraries` against aboutlibraries 12.1.0 (commit 69ee532) => 2 Unknown licenses found


```
    ./gradlew exportLibraries
    
    
    LIBRARIES:
    AboutLibraries View Library;com.mikepenz:aboutlibraries-android:12.1.0;Apache-2.0
    AboutLibraries Core Library;com.mikepenz:aboutlibraries-core:12.1.0;Apache-2.0
    AboutLibraries Core Library;com.mikepenz:aboutlibraries-core-android:12.1.0;Apache-2.0
    FastAdapter Library;com.mikepenz:fastadapter:5.7.0;Apache-2.0
    Jakarta Dependency Injection;jakarta.inject:jakarta.inject-api:2.0.1;Eclipse Public License v. 2.0,Apache-2.0,GNU General Public License, version 2 with the GNU Classpath Exception
    Kotlin Stdlib;org.jetbrains.kotlin:kotlin-stdlib:2.1.20;Apache-2.0
    kotlinx-collections-immutable;org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.8;Apache-2.0
    kotlinx-collections-immutable;org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.8;Apache-2.0
    kotlinx-coroutines-bom;org.jetbrains.kotlinx:kotlinx-coroutines-bom:1.10.2;Apache-2.0
    kotlinx-coroutines-core;org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2;Apache-2.0
    kotlinx-coroutines-core;org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.10.2;Apache-2.0
    kotlinx-serialization-bom;org.jetbrains.kotlinx:kotlinx-serialization-bom:1.8.1;Apache-2.0
    kotlinx-serialization-core;org.jetbrains.kotlinx:kotlinx-serialization-core:1.8.1;Apache-2.0
    kotlinx-serialization-core;org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:1.8.1;Apache-2.0
    kotlinx-serialization-json;org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.1;Apache-2.0
    kotlinx-serialization-json;org.jetbrains.kotlinx:kotlinx-serialization-json-jvm:1.8.1;Apache-2.0
    JetBrains Java Annotations;org.jetbrains:annotations:23.0.0;Apache-2.0
    
    
    LICENSES:
    Apache-2.0;Apache License 2.0;https://spdx.org/licenses/Apache-2.0.html
    
    
    ARTIFACTS WITHOUT LICENSE:
    
    
    UNKNOWN LICENSES:
    Eclipse Public License v. 2.0
    -- [jakarta.inject:jakarta.inject-api:2.0.1]
    GNU General Public License, version 2 with the GNU Classpath Exception
    -- [jakarta.inject:jakarta.inject-api:2.0.1]
    
    BUILD SUCCESSFUL in 2s
    1 actionable task: 1 executed
```
