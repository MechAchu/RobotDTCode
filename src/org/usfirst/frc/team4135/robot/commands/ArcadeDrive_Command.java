package org.usfirst.frc.team4135.robot.commands;

import org.usfirst.frc.team4135.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ArcadeDrive_Command extends Command {

	@Override
	protected void initialize(){
		
	}
	
	@Override
	protected void execute(){
		Robot.DriveTrain.TeleopDrive(Robot.oi.getJoystick());
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	protected void end(){
		Robot.DriveTrain.Stop();
	}
	
	@Override
	protected void interrupted(){
		end();
	}
	


}
