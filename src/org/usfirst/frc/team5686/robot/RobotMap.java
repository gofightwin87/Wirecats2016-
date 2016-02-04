package org.usfirst.frc.team5686.robot;




import org.usfirst.frc.team5686.robot.subsystems.arm;
import org.usfirst.frc.team5686.robot.subsystems.intakeWheels;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static final RobotDrive DRIVE_TRAIN_ROBOT_DRIVE_2 = null;
	public static final arm ARM = null;
	public static final intakeWheels INTAKE_WHEELS = null;
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	public static final Talon DRIVE_TRAIN_RIGHT_MOTOR = null;
	public static final Talon DRIVE_TRAIN_LEFT_MOTOR = null;
	
	
	public static final Talon DRIVE_TRAIN_INTAKE_MOTOR = null;
	
	
	public static final Talon DRIVE_TRAIN_ARM_MOTOR = null;
	


	
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
