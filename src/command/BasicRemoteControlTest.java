package command;

import command.remote_controlled_object.garage_door.GarageDoor;
import command.remote_controlled_object.garage_door.command.GarageDoorOpenCommand;
import command.remote_controlled_object.light.Light;
import command.remote_controlled_object.light.comand.LightOnCommand;
import command.remote_control.SimpleRemoteControl;

public class BasicRemoteControlTest {

    public static void main(String[] args) {
        // Remote controller for the bedroom light
        SimpleRemoteControl simpleLightRemoteControl = new SimpleRemoteControl();

        Light bedroomLight = new Light("bedroom");
        ICommand bedroomLightOnCommand = new LightOnCommand(bedroomLight);

        simpleLightRemoteControl.setCommand(bedroomLightOnCommand);
        simpleLightRemoteControl.buttonWasPressed();

        // Remote controller for main garage door
        SimpleRemoteControl simpleGarageDoorOpenRemoteControl = new SimpleRemoteControl();

        GarageDoor mainGarageDoor = new GarageDoor("main");
        ICommand mainGarageDoorOpenCommand = new GarageDoorOpenCommand(mainGarageDoor);

        simpleGarageDoorOpenRemoteControl.setCommand(mainGarageDoorOpenCommand);
        simpleGarageDoorOpenRemoteControl.buttonWasPressed();
    }
}
