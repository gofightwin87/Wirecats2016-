package org.usfirst.frc.team5686.robot.commands;

import org.usfirst.frc.team5686.robot.OI;
import org.usfirst.frc.team5686.robot.subsystems.driveTrain;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;


public class driveWithJoysticks extends Command {
	driveTrain theDriveTrain;
    public driveWithJoysticks() {
    	requires(driveTrain.instance);// drivetrain is an instance of our Drivetrain subsystem
    }

    protected void initialize() {
    	theDriveTrain = driveTrain.instance;
    }

    /*
     * execute() - In our execute method we call a tankDrive method we have created in our subsystem. This method takes two speeds as a parameter which we get from methods in the OI class.
     * These methods abstract the joystick objects so that if we want to change how we get the speed later we can do so without modifying our commands
     * (for example, if we want the joysticks to be less sensitive, we can multiply them by .5 in the getLeftSpeed method and leave our command the same).
     */
    public void execute() {
    	driveTrain.drive (OI.getLeftSpeed(), OI.getRightSpeed());
    }

    /*
     * isFinished - Our isFinished method always returns false meaning this command never completes on it's own. The reason we do this is that this command will be set as the default command for the subsystem. This means that whenever the subsystem is not running another command, it will run this command. If any other command is scheduled it will interrupt this command, then return to this command when the other command completes.
     */
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
