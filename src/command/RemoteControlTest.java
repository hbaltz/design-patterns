package command;

import command.macro_command.MacroCommand;
import command.remote_control.RemoteControl;
import command.remote_controlled_object.ceiling_fan.CeilingFan;
import command.remote_controlled_object.ceiling_fan.command.CeilingFanOffCommand;
import command.remote_controlled_object.ceiling_fan.command.CeilingFanOnCommand;
import command.remote_controlled_object.garage_door.GarageDoor;
import command.remote_controlled_object.garage_door.command.GarageDoorCloseCommand;
import command.remote_controlled_object.garage_door.command.GarageDoorOpenCommand;
import command.remote_controlled_object.light.Light;
import command.remote_controlled_object.light.comand.LightOffCommand;
import command.remote_controlled_object.light.comand.LightOnCommand;
import command.remote_controlled_object.stereo.Stereo;
import command.remote_controlled_object.stereo.comand.StereoOffCommand;
import command.remote_controlled_object.stereo.comand.StereoOnWithCDCommand;

public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Slot 0 => Control the living room light
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);

        // Slot 1 => Control the kitchen light
        Light kitchenLight = new Light("Kitchen");
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);

        // Slot 2 => Control the living room ceiling fan
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");
        CeilingFanOnCommand livingRoomCeilingFanOnCommand = new CeilingFanOnCommand(livingRoomCeilingFan);
        CeilingFanOffCommand livingRoomCeilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);
        remoteControl.setCommand(2, livingRoomCeilingFanOnCommand, livingRoomCeilingFanOffCommand);

        // Slot 3 => Control the garage door
        GarageDoor garageDoor = new GarageDoor("Main");
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        remoteControl.setCommand(3, garageDoorOpenCommand, garageDoorCloseCommand);

        // Slot 4 => Control the stereo
        Stereo livingRoomStereo = new Stereo("Living Room");
        StereoOnWithCDCommand livingRoomStereoOnWithCDCommand = new StereoOnWithCDCommand(livingRoomStereo);
        StereoOffCommand livingRoomStereoOffCommand = new StereoOffCommand(livingRoomStereo);
        remoteControl.setCommand(4, livingRoomStereoOnWithCDCommand, livingRoomStereoOffCommand);

        // Slot 5 => All lights
        MacroCommand allLightsOnCommand = new MacroCommand(
                new ICommand[]{livingRoomLightOnCommand, kitchenLightOnCommand}
        );
        MacroCommand allLightsOffCommand = new MacroCommand(
                new ICommand[]{livingRoomLightOffCommand, kitchenLightOffCommand}
        );
        remoteControl.setCommand(5, allLightsOnCommand, allLightsOffCommand);

        // Slot 6 => Living room complete control
        MacroCommand livingRoomOnCommand = new MacroCommand(
            new ICommand[] {
                livingRoomLightOnCommand,
                livingRoomCeilingFanOnCommand,
                livingRoomStereoOnWithCDCommand
            }
        );
        MacroCommand livingRoomOffCommand = new MacroCommand(
                new ICommand[] {
                        livingRoomLightOffCommand,
                        livingRoomCeilingFanOffCommand,
                        livingRoomStereoOffCommand
                }
        );
        remoteControl.setCommand(6, livingRoomOnCommand, livingRoomOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onUndoButtonPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);

        remoteControl.onButtonWasPushed(6);
        remoteControl.onUndoButtonPushed();
    }
}
