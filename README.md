# LibraryExample

> Full explanation here: https://jeroenmols.com/blog/2020/12/02/inproject-maven/

In (Android) library development, the local development setup differs from how customers integrate the library.

Local development uses a module dependency:

```groovy
dependencies {
    implementation project(':library')
}
```

Customers integrate through Maven:

```groovy
dependencies {
    implementation `com.jeroenmols.lib:library:1.0.0`
}
```

Now because both integration mechanisms are fundamentally different, they can also lead to different results.

Wouldn’t it be great if you could test the Maven version of your library directly in your project?

This project shows how this can be done!

Benefits:

- avoids deploying the library to Maven
- more realistic testing
- speeds up release testing

Code change here: https://github.com/JeroenMols/LibraryExample/pull/1/files
