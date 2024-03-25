# Facade pattern

## Definition
```text
The facade pattern provides a unified interface to a set of interfaces in a subsystem.
Facade defines a higher-level interface that makes the subsystem easier to use.
```

## Diagram UML
```mermaid
classDiagram
    class Client 
    
    class Facade {
        - linksToSubSystemObjects
        + subSytemOperation()
    }

    namespace Subsystem classes {
        class Subsystem1 {
            + operation()
        }
    
        class Subsystem2 {
            + operation()
        }
    
        class Subsystem3 {
            + operation()
        }
    
        class Subsystem4 {
            + operation()
        }
    
        class Subsystem5 {
            + operation()
        }
    
        class Subsystem6 {
            + operation()
        }
    
        class Subsystem7 {
            + operation()
        }
    }
    
    Client --> Facade

    Facade --> Subsystem1
    Facade --> Subsystem2
    Facade --> Subsystem3
    
    Subsystem2 --> Subsystem4
    Subsystem3 --> Subsystem4
    Subsystem4 --> Subsystem7
    Subsystem4 --> Subsystem1
    Subsystem7 --> Subsystem6
    Subsystem1 --> Subsystem6
    
    Subsystem1 --> Subsystem5
    Subsystem2 --> Subsystem5
    Subsystem3 --> Subsystem5
```

* The `Facade` provides convenient access to a particular part of the subsystem’s functionality. 
It knows where to direct the `Client`’s request and how to operate all the moving parts.
* The `Complex Subsystem` consists of a lot of various objects. 
To make them all do something meaningful, you have to dive deep into the `subsystem`’s implementation details, 
such as initializing objects in the correct order and supplying them with data in the proper format.
`Subsystem` classes aren’t aware of the `Facade`’s existence. 
They operate within the system and work with each other directly.
* The `Client` uses the facade instead of calling the subsystem objects directly.

## Home theater example

```mermaid
classDiagram
    class HomeTheaterTestDrive 
    
    class HomeTheaterFacade {
        - amplifier Amplifier
        - tuner Tuner
        - dvdPlayer DvdPlayer
        - cdPlayer CdPlayer
        - projector Projector
        - theaterLights TheaterLights
        - screen Screen
        - popcornPopper PopcornPopper
        + wachMovie()
        + endMovie()
        + listenToCd()
        + endCd()
        + listenToRadio()
        + endRadio()
    }

    namespace Subsystem classes {
        class IOnOffDevice{
            <<interface>>
            + on()
            + off()
        }
        
        class Amplifier {
            - tuner Tuner
            - cdPlayer CdPlayer
            - dvdPlayer DvdPlayer
            + on()
            + off()
            + setTuner(tuner Tuner)
            + setCdPlayer(cdPlayer CdPlayer)
            + setDvdPlayer(dvdPlayer DvdPlayer)
            + setVolume(volume int)
        }
    
        class Tuner {
            + on()
            + off()
            + setAm()
            + setFm()
            + setFrequency(frequency double)
        }
    
        class IPlayer {
            <<interface>>
            + play()
            + pause()
            + stop()
            + eject()
        }
    
        class CdPlayer {
            + on()
            + off()
            + play()
            + pause()
            + stop()
            + eject()
        }
    
        class DvdPlayer {
            + on()
            + off()
            + play()
            + pause()
            + stop()
            + eject()
        }
    
        class Projector {
            - dvdPlayer DvdPlayer
            + on()
            + off()
            + tvMode()
            + wideScreenMode()
        }

        class TheaterLights {
            + on()
            + off()
            + dim()
            + bright()
        }
    
        class Screen {
            + up()
            + down()
        }
        
        class PopcornPopper {
            + on()
            + off()
            + pop()
        }
    }

    HomeTheaterTestDrive --> HomeTheaterFacade
    
    Amplifier --|> IOnOffDevice
    Tuner --|> IOnOffDevice
    CdPlayer --|> IOnOffDevice
    DvdPlayer --|> IOnOffDevice
    Projector --|> IOnOffDevice
    TheaterLights --|> IOnOffDevice
    PopcornPopper --|> IOnOffDevice

    CdPlayer --|> IPlayer
    DvdPlayer --|> IPlayer

    Amplifier --> Tuner
    Amplifier --> CdPlayer
    Amplifier --> DvdPlayer
    
    Projector --> DvdPlayer

    HomeTheaterFacade --> Amplifier
    HomeTheaterFacade --> Tuner
    HomeTheaterFacade --> CdPlayer
    HomeTheaterFacade --> DvdPlayer
    HomeTheaterFacade --> Projector
    HomeTheaterFacade --> TheaterLights
    HomeTheaterFacade --> Screen
    HomeTheaterFacade --> PopcornPopper
```
In this example the `HomeTheaterFacade` provide an interface 
to simply launch a movie, listen to a cd or listen to the radio
and for each case another method to turn everything off.  
Before the creation of the facade, the `HomeTheaterTestDrive` 
had to interact with several elements of the subsystem to be able to watch a movie,
listen a cd or listen to the radio. After the creation of the cd, he just had to interact 
with the facade to do any of these things.
* `HomeTheaterFacade` is the `Facade`
* `Amplifier`,`Tuner`,`CdPlayer`,`DvdPlayer`,`Projector`,`TheaterLights`,`Screen`,`PopcornPopper`
are the different component in the subsystem.
* Note that the `HomeTheaterFacade` is are delegating the responsibility to the corresponding component in the subsystem

## Pros
* You can isolate your code from the complexity of a subsystem.
* Principle of least knowledge: the client only has one friend the `Facade`.

## Cons
* A facade can become a god object coupled to all classes of an app.