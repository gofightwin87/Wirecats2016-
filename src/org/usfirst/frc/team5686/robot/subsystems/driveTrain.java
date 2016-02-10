package org.usfirst.frc.team5686.robot.subsystems;

import org.usfirst.frc.team5686.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class driveTrain extends Subsystem {
	public static driveTrain instance;
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public static RobotDrive robotDrive2 = RobotMap.DRIVE_TRAIN_ROBOT_DRIVE_2;
	Talon rightMotor = RobotMap.DRIVE_TRAIN_RIGHT_MOTOR;
	Talon leftMotor = RobotMap.DRIVE_TRAIN_LEFT_MOTOR;
	public void initDefaultCommand() {
		instance  =this;
		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	}
	public static void drive(double left, double right){
		robotDrive2.tankDrive(left,right);
	}
	public void stop () {
		robotDrive2.drive(0, 0);
	}
}

