package org.usfirst.frc.team5686.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;


public class intakeWheels extends Subsystem {
	Talon motor;// = org.usfirst.frc.team5686.robot.RobotMap.intakeMotor;
		int motorSpeed = 1;      
		int motorStop = 0;
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
   

	public void backward() {
		motor.set (- motorSpeed);
	}
	public void forward() {
		motor.set(motorSpeed);
	}
}