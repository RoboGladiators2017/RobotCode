/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;
import frc.robot.OI;
import frc.robot.subsystems.*;
/**
 * Add your docs here.
 */
public class IntakeBallDefault extends InstantCommand {
  /**
   * Add your docs here.
   */
  public IntakeBallDefault() {
    requires(Robot.m_intake);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    Robot.m_intake.Speed(0);
  }

  protected void execute() {
//   if ( Robot.m_oi.D3.whileHeld()) {

    //}
    
  }

  @Override
  protected boolean isFinished() {
    return false;
  }
  @Override
  protected void end() {
    Robot.m_intake.Speed(0);
  }

  @Override
  protected void interrupted() {
    end();
  }
}


