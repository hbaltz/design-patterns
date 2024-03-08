# Strategy pattern

## Definition

The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

## UML Diagram

```mermaid
classDiagram
    class Client {
        -strategy: Startegy
        +setStrategy(Strategy)
        +executeStrategy()
    }
    class Strategy {
        +algorithmInterface()
    }
    class ConcreteStrategyA {
        +algorithmInterface()
    }
    class ConcreteStrategyB {
        +algorithmInterface()
    }
    class ConcreteStrategyC {
        +algorithmInterface()
    }

    Client --> Strategy
    Strategy <|-- ConcreteStrategyA
    Strategy <|-- ConcreteStrategyB
    Strategy <|-- ConcreteStrategyC
```

## Duck example

```mermaid
classDiagram
    class Duck {
        -flyBehavior: FlyBehavior
        -quackBehavior: QuackBehavior
        +quack()
        +swim()
        +display()
        +fly()
        +setFlyBehavior(FlyBehavior)
        +setQuackBehavior(QuackBehavior)
    }

    class MallardDuck {
        +display()
    }
    class RubberDuck {
        +display()
    }
    class DecoyDuck {
        +display()
    }
    
    class FlyBehavior {
        +fly()
    }
    class QuackBehavior {
        +quack()
    }
    class FlyWithWingsBehavior {
        +fly()
    }
    class NoFlyBehavior {
        +fly()
    }
    class FlyWithRocketPoweredBehavior {
        +fly()
    }
    class SimpleQuackBehavior {
        +quack()
    }
    class SqueakBehavior {
        +quack()
    }
    class NoQuackBehavior {
        +quack()
    }

    MallardDuck --|> Duck
    RubberDuck --|> Duck
    DecoyDuck --|> Duck

    Duck --> FlyBehavior
    Duck --> QuackBehavior
    
    FlyBehavior <|-- FlyWithWingsBehavior
    FlyBehavior <|-- NoFlyBehavior
    FlyBehavior <|-- FlyWithRocketPoweredBehavior

    QuackBehavior <|-- SimpleQuackBehavior
    QuackBehavior <|-- SqueakBehavior
    QuackBehavior <|-- NoQuackBehavior
```

In the example, we encapsulate the fly behavior and the quack behavior. Think of them as family of algorithm.
In both of these family, the algorithms are interchangeable. We can change the NoFlyBehavior to the FlyWithRocketPower 
or with FlyWithWingsBehavior.
Each behavior can vary without having to change the duck class or one of his subclass.

Now you can read the definition again :

```text
The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.
```

## Benefits

* Responds to the OO principe : Identify the aspects of yours application that vary and separate them from hat stays the same.
* Responds to the OO principe : Program to an interface, not an implementation
* Responds to the OO principe : Favor composition over inheritance
* Offer the possibility to change behavior at run time
* Avoid duplicate code in subclass using the same algorithm