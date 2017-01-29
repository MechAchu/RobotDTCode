package org.usfirst.frc.team4135.robot.subsystems;

import org.usfirst.frc.team4135.robot.RobotMap;
import org.usfirst.frc.team4135.robot.commands.ArcadeDrive_Command;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain_Subsystem extends Subsystem{
	private RobotDrive MainDrive = new RobotDrive(RobotMap.driveLeft, RobotMap.driveRight);
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new ArcadeDrive_Command());
	}

	private void setDefaultCommand(ArcadeDrive_Command command) {
		
	}

	public void TeleopDrive(Joystick control){
		MainDrive.arcadeDrive(control.getX(), control.getY());
	}
	
	public void Stop(){
		MainDrive.drive(0, 0);
	}
	
}
