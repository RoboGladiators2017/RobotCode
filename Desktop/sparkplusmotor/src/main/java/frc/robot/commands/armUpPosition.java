/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class armUpPosition extends Command {
  public armUpPosition() {
    requires(Robot.m_spinmotor);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // TO DO: A. constrain the value of MotorSpeed to max and min values of the motor
    //        B. create some margin for error so it does not have to get to the
    //           exact value or else it will keep bouncing up and down till something breaks
    //        C. check buttons on controller corresponding to 4,5, and 6
    //        D. determine if end should be called when desired position reached

    double K = 1; // set the value of K to scale the amount of motor movement required
    double desiredPosition = 90; // 90 degrees above ground
    double currentAngle = m_spinmotor.getArmAngle();
    // if(error < acceptableMargin) { end(); } // ???
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
    end();
  }
}
