package org.usfirst.frc.team4135.robot;

import edu.wpi.first.wpilibj.Joystick;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick control = new Joystick(0);
	public OI(){
		
	}
	
	public Joystick getJoystick(){
		return control;
			
	}
}
