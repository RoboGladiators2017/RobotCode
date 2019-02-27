/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class armDownPosition extends Command {
  public armDownPosition() {
    requires(Robot.m_spinmotor);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double K = 1; // set the value of K to scale the amount of motor movement required
    double desiredPosition = 10; // 10 degrees above ground
    double currentAngle = m_spinmotor.getArmAngle();
    double motorSpeed = (currentAngle - desiredPosition)*K;
    Robot.m_spinmotor.Spin(motorSpeed);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    // we want arm to not drop to the ground when command is interrupted
    end();
  }
}
