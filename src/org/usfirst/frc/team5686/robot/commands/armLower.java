package org.usfirst.frc.team5686.robot.commands;

import org.usfirst.frc.team5686.robot.Ports;
import org.usfirst.frc.team5686.robot.subsystems.arm;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;

public class armLower extends Command {
	int armMotorSpeedDown= Ports.armMotorSpeedDown;
	int motorStop= Ports.motorStop;
	//create a motor to run the intake wheels
	Talon motor;// = org.usfirst.frc.team5686.robot.RobotMap.armMotor;

	public void initDefaultCommand() {

	}
	public void Defaultstop() {
		motor.set(motorStop);
	}		
	protected void initialize() {

	}
	public void down() {
		arm.armLower();
	}


	//make the motor stop
	public void stop() {
		motor.set(motorStop);
	}
	protected boolean isFinished() {
        return arm.isSwitchSet();
    }

	// Called once after isFinished returns true
	protected void end() {
		arm.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}  
	public void interuptStop() {
		motor.set(motorStop);
	}
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}
}






