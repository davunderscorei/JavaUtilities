# davunderscorei Java Utilities

## NullPropagator

The null propagation operator in other languages allows you to not care if a property in a call chain is null.

For example, in C#:

    value = foo.Bar.Baz; // will throw NullReferenceException if foo or Bar is null
    value = foo?.Bar?.Baz; // will not throw. Value may or may not be null

This is lacking in Java so this class allows you do do the following for the same effect:

    value = new NullPropagator<>(foo).then(f -> f.bar).then(b -> b.baz).getValue();

