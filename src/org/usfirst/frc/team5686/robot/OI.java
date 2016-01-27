package org.usfirst.frc.team5686.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
	//create three seperate joysticks-- two for first driver and one for second
	
	int forwardOverrideButton = 1;
	int backwardOverrideButton = 2;
	int intakeSpinnerButton = 1;
	RobotDrive theRobot;
	
	//FIRST DRIVER
	Joystick leftJoystick = new Joystick (1);
	
	Joystick rightJoystick = new Joystick (2);
			Button button1 = new JoystickButton(rightJoystick, forwardOverrideButton);
			Button button2 = new JoystickButton(rightJoystick, backwardOverrideButton);
	
			
	//SECOND DRIVER	
	Joystick driver2 = new Joystick (3);
	// need to figure out how arm will work with xbox controller
	//maybe if new joystick- used old one instead of xbox
			Button driver2Button1 = new JoystickButton(driver2, intakeSpinnerButton);
			//Button driver2Button2 = new JoystickButton(driver2, 2);
			//Button driver2Button3 = new JoystickButton(driver2, 3);
	
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
  // Triggering Buttons
		// FIRST DRIVER
			//rightJoystick Button commands
	//		button1.whileHeld(new driveStraightForward())
	//		button2.whileHeld(new driveStraightBackwards())
		// SECOND DRIVER
			// driver2 buttons
	//		driver2Button1.whenPressed(new intakeSpinner());
			
		
   
			
			
			// Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

