/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
  public class SpinTheMotorBack extends Command {
  /**
   * Add your docs here.
   */
  public SpinTheMotorBack() {
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
    double rotateMotorSpeed = Robot.m_oi.driverController.getRawAxis(RobotMap.DRIVER_CONTROLLER_COUNTERCLOCKWISE);
    Robot.m_spinmotor.Spin(-rotateMotorSpeed);
    
    
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

