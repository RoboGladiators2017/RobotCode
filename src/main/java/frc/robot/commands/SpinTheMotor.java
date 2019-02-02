/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class SpinTheMotor extends Command {
  /**
   * Add your docs here.
   */
  public SpinTheMotor() {
    //super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
      requires(Robot.m_spinmotor);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    
  }
  @Override
  protected void execute() {
    Robot.m_spinmotor.Spin(1);
  }
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_spinmotor.Spin(0);
  }
  @Override
  protected void interrupted() {
    end();
  }
}
