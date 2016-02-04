package org.usfirst.frc.team5686.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5686.robot.Ports;
import org.usfirst.frc.team5686.robot.RobotMap;

import edu.wpi.first.wpilibj.*;


public class intakeWheels extends Subsystem {
	Talon motor;// = org.usfirst.frc.team5686.robot.RobotMap.intakeMotor;
	int motorStop= Ports.motorStop;
	int motorSpeedIn= Ports.wheelsMotorSpeedIn;
	int motorSpeedOut= Ports.wheelsMotorSpeedOut;
	
	public static intakeWheels instance;
	public static intakeWheels intakeWheels1 = RobotMap.INTAKE_WHEELS;
	    // Put methods for controlling this subsystem
	    // here. Call these from Commands.

	    public void initDefaultCommand() {
	        // Set the default command for a subsystem here.
	        //setDefaultCommand(new MySpecialCommand());
	    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.


        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
   

	public void out() {
		motor.set ( motorSpeedOut);
	}
	public void in() {
		motor.set(motorSpeedIn);
	}
}