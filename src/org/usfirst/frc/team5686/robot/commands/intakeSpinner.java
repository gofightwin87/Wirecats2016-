package org.usfirst.frc.team5686.robot.commands;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class intakeSpinner extends Command {
	Talon motor;


	//create a motor to run the intake wheels
	

	public void initDefaultCommand() {

	}
	public void Defaultstop() {
	//	motor.set(motorStop);
	}

	protected void initialize() {

	}

	protected void execute() {

	}

	//make the motor stop
	public void stop() {
	//	motor.set(motorStop);
	}


	protected boolean isFinished() {
		boolean isFinished = false;
		return isFinished;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
	public void interuptStop() {
	//	motor.set(motorStop);
	}
}