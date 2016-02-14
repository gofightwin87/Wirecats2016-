package org.usfirst.frc.team5686.robot.subsystems;
import org.usfirst.frc.team5686.robot.Ports;
import org.usfirst.frc.team5686.robot.RobotMap;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
public class arm extends Subsystem {
	public static arm instance;
	public static arm arm1 = RobotMap.ARM;
	static Talon motor = RobotMap.DRIVE_TRAIN_ARM_MOTOR ;
	static DigitalInput limitSwitch = new DigitalInput(1);
	static Counter counter = new Counter (limitSwitch);
	int motorSpeedUp = Ports.armMotorSpeedUp;
	int motorSpeedDown = Ports.armMotorSpeedDown;
	int motorStop = Ports.motorStop;





	/**
	 *
	 */

	// Put methods for controlling this subsystezm
	// here. Call these from Commands.

	public static boolean isSwitchSet() {
		return counter.get() > 0;
	}

	public void initializeCounter() {
		counter.reset();
	}
	public void initDefaultCommand() {
		instance = this;


		// Set the default command for a subsystem here.
		//setDefaultCommand(new MySpecialCommand());
	}
	public static void armRaise () {
		motor.set(0.5);
	}

	public static void armLower () {
	
	}

	public static void stop (){
		


	}

}




