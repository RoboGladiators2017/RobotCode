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
import frc.robot.subsystems.*;

/**
 * Add your docs here.
 */
public class SpinTheMotor extends Command {
  /**
   * Add your docs here.
   */
  public SpinTheMotor() {
    // super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_spinmotor);
    // requires(Robot.m_limitswitch);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    Robot.m_spinmotor.initializeCounter();
  }

  @Override
  protected void execute() {
    double rightTriggerSpeed = Robot.m_oi.driverController.getRawAxis(RobotMap.DRIVER_CONTROLLER_COUNTERCLOCKWISE);
    double leftTriggerSpeed = Robot.m_oi.driverController.getRawAxis(RobotMap.DRIVER_CONTROLLER_CLOCKWISE);
    rightTriggerSpeed = rightTriggerSpeed*0.35;
    leftTriggerSpeed = leftTriggerSpeed*0.35;

    if (-rightTriggerSpeed < 0) {
      System.out.println("" + rightTriggerSpeed + " " + leftTriggerSpeed);
    }
   // Robot.m_spinmotor.Spin(leftTriggerSpeed - rightTriggerSpeed);
/*if (leftTriggerSpeed >0 && -rightTriggerSpeed > 0) {
  Robot.m_spinmotor.Spin(0);

}*/
    if (!(Robot.m_spinmotor.isTopSwitchSet()) && !(Robot.m_spinmotor.isBottomSwitchSet())) {
      // Robot.m_spinmotor.Spin(0);
      Robot.m_spinmotor.Spin(leftTriggerSpeed - rightTriggerSpeed);
    }
    else if ((Robot.m_spinmotor.isTopSwitchSet() && !(Robot.m_spinmotor.isBottomSwitchSet()))) {
      // Robot.m_spinmotor.Spin(0);
      leftTriggerSpeed = 0;
      Robot.m_spinmotor.Spin(-rightTriggerSpeed);
    }
    else if ((!(Robot.m_spinmotor.isTopSwitchSet()) && Robot.m_spinmotor.isBottomSwitchSet())) {
      rightTriggerSpeed = 0;
      Robot.m_spinmotor.Spin(leftTriggerSpeed);
    }  
    else {
      Robot.m_spinmotor.Spin(0);
      return;
    }
    Robot.m_spinmotor.Spin(leftTriggerSpeed - rightTriggerSpeed); //test with and without this line. does the motor twitch?

    /*
     * if(rightTriggerSpeed < 0){
     * System.out.println(""+rightTriggerSpeed+" "+leftTriggerSpeed); }
     */
    // if(Robot.m_limitswitch.limitSwitch.get() == true)
    // {
    // end();
    // }

  }

  @Override
  protected boolean isFinished() {
    return false;
    // return Robot.m_spinmotor.isSwitchSet();
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
