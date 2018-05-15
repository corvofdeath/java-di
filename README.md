# java-di
Dependency Injection for java

Study project.

Does not resolve constructors dependency.

The framework not checks if a type already exists as key. You can put a dependecy as singleton and transient,
but this will not cause erros, but the framework can't get the right type. Don't do this!
