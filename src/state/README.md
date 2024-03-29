# State pattern

## Definition

```text
The state pattern allow an object to alter its behavior when its internal state changes.
The object will appear to change its class.
```

## State diagram

```mermaid
stateDiagram
    A --> B
    B --> C
    C --> D
    D --> B
    B --> A
    D --> E
    E --> F
    F --> B
    F --> I
```

Example of a state machine representation, we have the different state A to I 
and the arrows represent the transition from a state to another.

## Diagram UML

```mermaid
classDiagram
    class Context {
        - state: State
        + setState(State) void
        + doThis() void
        + doThat() void
    }
    
    class State {
        + doThis() void
        + doThat() void
    }
    <<interface>> State
    
    class ConcreteStateA {
        - context: Context
        + setContext(context: Context)
        + doThis() void
        + doThat() void
    }
    class ConcreteStateB {
        - context: Context
        + setContext(context: Context)
        + doThis() void
        + doThat() void
    }
    
    Context o--> State
    Context <-- ConcreteStateA
    Context <-- ConcreteStateB
    State <|-- ConcreteStateA
    State <|-- ConcreteStateB
```

* `Context` stores a reference to one of the `concrete state` objects and delegates to it all state-specific work. 
  The `context` communicates with the `state` object via the `state` interface. 
  The `context` exposes a setter for passing it a new `state` object.
* The `State` interface declares the state-specific methods. 
  These methods should make sense for all concrete states because you don’t want some of your `states` to have useless 
  methods that will never be called.
* `Concrete States` provide their own implementations for the state-specific methods. 
  To avoid duplication of similar code across multiple `states`, 
  you may provide intermediate abstract classes that encapsulate some common behavior.
  `State` objects may store a backreference to the `context` object. 
  Through this reference, the `state` can fetch any required info from the `context` object, 
  as well as initiate `state` transitions.
* Both `context` and `concrete states` can set the next `state` of the `context`
  and perform the actual `state` transition by replacing the `state` object linked to the context.

## Gumball machine example

We model a gumball machine that has different state and apply in your implementation the state pattern.

### State diagram

First the state diagram with a phrase to qualify each transition

```mermaid
stateDiagram
    SoldOut --> NoQuarter : refill
    
    NoQuarter --> HasQuarter : inserts quarter
    
    HasQuarter --> NoQuarter : ejects quarter
    HasQuarter --> GumballSold : turns crank, no winner
    
    GumballSold --> NoQuarter : dispenses 1 gumball, gumballs > 0
    GumballSold --> SoldOut : dispenses 1 gumball, gumballs = 0

    HasQuarter --> Winner : turns crank, have a winner

    Winner --> NoQuarter : dispenses 2 gumballs, gumballs > 0
    Winner --> SoldOut : dispenses 2 gumballs, gumballs = 0
```

I redraw this diagram and I named the transition with methods name

```mermaid
stateDiagram
    SoldOut --> NoQuarter : fill
    
    NoQuarter --> HasQuarter : insertQuarter
    
    HasQuarter --> NoQuarter : ejectQuarter
    HasQuarter --> GumballSold : turnCrank
    
    GumballSold --> NoQuarter : dispense
    GumballSold --> SoldOut : dispense

    HasQuarter --> Winner : turnCrank

    Winner --> NoQuarter : dispense
    Winner --> SoldOut : dispense
```

We have 5 different state in our machine : `SoldOut`, `NoQuarter`, `HasQuarter`, `GumballSold`, `Winner`.
And 5 transitions : `fill`, `insertQuarter`, `ejectQuarter`, `turnCrank`, `dispense`
To be complete we should define for each state what will be the next state when applying any of this transition.
Because we have to manage every state/transition case.

Without the state pattern knowledge we could do that by having if/else or switch 
applies in the gumball machine for each transition over each state.
But we can agree that implementation will be complicated to evolve and to maintain.

That's why the state pattern is for, we are going to encapsulate what changes 
aka how each transition works regarding the state.

We don't represent it on the above diagram to simplify the reading, 
here the diagram with all the state/transition represented :


```mermaid
stateDiagram
    SoldOut --> SoldOut : insertQuarter
    SoldOut --> SoldOut : ejectQuarter
    SoldOut --> SoldOut : turnCrank
    SoldOut --> SoldOut : dispense
    SoldOut --> NoQuarter : fill
    
    NoQuarter --> HasQuarter : insertQuarter
    NoQuarter --> NoQuarter : ejectQuarter
    NoQuarter --> NoQuarter : turnCrank
    NoQuarter --> NoQuarter : dispense
    NoQuarter --> NoQuarter : fill

    HasQuarter --> HasQuarter : insertQuarter
    HasQuarter --> NoQuarter : ejectQuarter
    HasQuarter --> GumballSold : turnCrank
    HasQuarter --> Winner : turnCrank
    HasQuarter --> HasQuarter : dispense
    HasQuarter --> HasQuarter : fill

    GumballSold --> GumballSold : insertQuarter
    GumballSold --> GumballSold : ejectQuarter
    GumballSold --> GumballSold : turnCrank
    GumballSold --> NoQuarter : dispense
    GumballSold --> SoldOut : dispense
    GumballSold --> GumballSold : fill

    Winner --> Winner : insertQuarter
    Winner --> Winner : ejectQuarter
    Winner --> Winner : turnCrank
    Winner --> NoQuarter : dispense
    Winner --> SoldOut : dispense
    Winner --> Winner : fill
```

Here you can see a lit bit more the complexity under this quite simple gumball machine.

### Class diagram

```mermaid
classDiagram
    class GumballMachine {
        - soldOutState: IGumballMachineState
        - noQuarterState: IGumballMachineState
        - hasQuarterState: IGumballMachineState
        - soldState: IGumballMachineState
        - winnerState: IGumballMachineState
        - currentState: IGumballMachineState
        + Context(intialNumberOfGumball: int) void
        + insertQuarter() void
        + ejectQuarter() void
        + turnCrank() void
        + fill() void
        + setState(State) void
        + releaseBall() void
        + getSoldOutState() IGumballMachineState
        + getNoQuarterState() IGumballMachineState
        + getHasQuarterState() IGumballMachineState
        + getSoldState() IGumballMachineState
        + getWinnerState() IGumballMachineState
    }
    
    class IGumballMachineState {
        + insertQuarter() void
        + ejectQuarter() void
        + turnCrank() boolean
        + dispense() void
        + fill() void
    }
    <<interface>> IGumballMachineState
    
    class SoldOutState {
        - gumballMachine: GumballMachine
        + SoldOutState(gumballMachine: GumballMachine)
        + insertQuarter() void
        + ejectQuarter() void
        + turnCrank() boolean
        + dispense() void
        + fill() void
    }
    class NoQuarterState {
        - gumballMachine: GumballMachine
        + NoQuarterState(gumballMachine: GumballMachine)
        + insertQuarter() void
        + ejectQuarter() void
        + turnCrank() boolean
        + dispense() void
        + fill() void
    }
    class HasQuarterState {
        - gumballMachine: GumballMachine
        + HasQuarterState(gumballMachine: GumballMachine)
        + insertQuarter() void
        + ejectQuarter() void
        + turnCrank() boolean
        + dispense() void
        + fill() void
    }
    class SoldState {
        - gumballMachine: GumballMachine
        + SoldState(gumballMachine: GumballMachine)
        + insertQuarter() void
        + ejectQuarter() void
        + turnCrank() boolean
        + dispense() void
        + fill() void
    }
    class WinnerState {
        - gumballMachine: GumballMachine
        + WinnerState(gumballMachine: GumballMachine)
        + insertQuarter() void
        + ejectQuarter() void
        + turnCrank() boolean
        + dispense() void
        + fill() void
    }
    
    GumballMachine o--> IGumballMachineState

    IGumballMachineState <|-- SoldOutState
    IGumballMachineState <|-- NoQuarterState
    IGumballMachineState <|-- HasQuarterState
    IGumballMachineState <|-- SoldState
    IGumballMachineState <|-- WinnerState

    SoldOutState --> GumballMachine
    NoQuarterState --> GumballMachine
    HasQuarterState --> GumballMachine
    SoldState --> GumballMachine
    WinnerState --> GumballMachine
```

In this example
* `GumballMachine` is the `Context`. For each transition we delegate tho the `IGumballMachineState` states the mission
  to manage it and if necessary to change the currentState of the `GumballMachine`.
* `IGumballMachineState` is the `State` interface, it defines each of the methods mapped 
  on the transition that we have identified.
* `SoldOutState`, `NoQuarterState`, `HasQuarterState`, `SoldState`, `WinnerState` are the `ConcreteStates`.
  Each of the state manage the transition regarding its case only 
  and not knowing other states that the ones, they transition to. 
  They set the next state of the `GumballMachine` when it's necessary.

## Pros

* Single Responsibility Principle. Organize the code related to particular states into separate classes.
* Open/Closed Principle. Introduce new states without changing existing state classes or the context.
* Simplify the code of the context by eliminating bulky state machine conditionals.

## Cons

* Applying the pattern can be overkill if a state machine has only a few states or rarely changes.
