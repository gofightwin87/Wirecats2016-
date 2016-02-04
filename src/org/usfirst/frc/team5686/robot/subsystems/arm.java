package org.usfirst.frc.team5686.robot.subsystems;

import org.usfirst.frc.team5686.robot.Ports;
import org.usfirst.frc.team5686.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class arm extends Subsystem {
	public static arm instance;
	public static arm arm1 = RobotMap.ARM;
	Talon motor;
	
	int motorSpeedUp = Ports.armMotorSpeedUp;
	int motorSpeedDown = Ports.armMotorSpeedDown;
	int motorStop = Ports.motorStop;
	

	
	
	
/**
 *
 */
    
    // Put methods for controlling this subsystezm
    // here. Call these from Commands.
	
    public void initDefaultCommand() {
    
    	
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
  
	
	}

    


