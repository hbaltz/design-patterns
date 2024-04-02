# Design pattern

In this directory, I create examples of design pattern implementations, 
initially to see if I understand them well and secondly to serve as a memory aid when needed.

## Submodule

This repository as a git submodule (`coumpound-design-pattern`) that contains a project applying several design patterns
at the same time.

### Cloning the project

Use the `--recurse-submodules` parameters in the git clone command to initialize and update each submodule.

```bash
git clone --recurse-submodules https://github.com/hbaltz/design-patterns.git
```

If you didn't use the parameter you can use the following commands

```bash
git submodule init
git submodule update
```

### Updating submodule

```bash
git submodule update --remote
```

[For more information about git submodules](https://git-scm.com/book/en/v2/Git-Tools-Submodules)

## Summary

* [Strategy pattern](./src/strategy/README.MD)
* [Observer pattern](./src/observer/README.md)
* [Decorator pattern](./src/decorator/README.md)
* [Factory method pattern](./src/factory/README.md)
* [Abstract factory pattern](./src/abstract_factory/README.md)
* [Singleton pattern](./src/singleton/README.md)
* [Command pattern](./src/command/README.md)
* [Adapter pattern](./src/adapter/README.md)
* [Facade pattern](./src/facade/README.md)
* [Template method pattern](./src/template_method/README.md)
* [Iterator pattern](./src/iterator/README.md)
* [Composite pattern](./src/composite/README.md)
* [State patter](./src/state/README.md)
* [Proxy pattern](./src/proxy/README.md)

## References

* [Design Patterns in Object Oriented Programming](https://www.youtube.com/playlist?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc)
* Book : Head first design patterns by E. & E. Freeman
* Book : Design Patterns by Gang of Four
* [Refactoring guru](https://refactoring.guru/design-patterns)