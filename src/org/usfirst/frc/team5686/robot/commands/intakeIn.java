package org.usfirst.frc.team5686.robot.commands;

import org.usfirst.frc.team5686.robot.Ports;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class intakeIn extends Command {
	int wheelsMotorSpeed= Ports.wheelsMotorSpeedIn;
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
			motor.set(-wheelsMotorSpeed);
		}

		//make the motor stop
		public void stop() {
			motor.set(motorStop);
		}
		protected void execute() {

			//make the motor run

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
			motor.set(motorStop);
		}
	}