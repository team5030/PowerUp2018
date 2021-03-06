package org.usfirst.frc.team5030.robot.commands.Elevator;

import org.usfirst.frc.team5030.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LiftDeadReckon extends Command {
	
	double power;
	public LiftDeadReckon(double time, double power) {
		setTimeout(time);
		this.power = power;
	}
	
	protected void execute() {
		Robot.elevatorSubsystem.operatorControl(power);
	}

	

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

}
