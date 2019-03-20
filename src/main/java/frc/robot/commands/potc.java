/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.command.Command;

public class potc extends Command {
  public potc() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_spinmotor);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.m_spinmotor.initializeCounter();

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double potv =   Robot.m_spinmotor.potValue();
    /*if (!(Robot.m_spinmotor.isTopSwitchSet()) && !(Robot.m_spinmotor.isBottomSwitchSet())) {
      Robot.m_spinmotor.Spin(0);
      //Robot.m_spinmotor.Spin(leftTriggerSpeed - rightTriggerSpeed);
    }
    else if ((Robot.m_spinmotor.isTopSwitchSet() && !(Robot.m_spinmotor.isBottomSwitchSet()))) {
      // Robot.m_spinmotor.Spin(0);
      leftTriggerSpeed = 0;
      Robot.m_spinmotor.Spin(-rightTriggerSpeed);
    }
    else if ((!(Robot.m_spinmotor.isTopSwitchSet()) && Robot.m_spinmotor.isBottomSwitchSet())) {
      potv = 0;
      Robot.m_spinmotor.Spin(leftTriggerSpeed);
    }  
    else {
      Robot.m_spinmotor.Spin(0);
      return;
    }
    */ 
    
  if(potv > 210.0) {
  Robot.m_spinmotor.Spin(0.5);
  }
  if(potv < 210.0) {
    Robot.m_spinmotor.Spin(-0.5);
    }
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
  }
}
