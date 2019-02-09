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
public class SpinTheMotor extends Command {
  /**
   * Add your docs here.
   */
  public SpinTheMotor() {
    //super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
      requires(Robot.m_spinmotor);
    //  requires(Robot.m_limitswitch);
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
    Robot.m_spinmotor.Spin(leftTriggerSpeed - rightTriggerSpeed);

    if(rightTriggerSpeed > 0) {
        System.out.println(""+rightTriggerSpeed+" "+leftTriggerSpeed);
    }
    /*if(rightTriggerSpeed < 0){
        System.out.println(""+rightTriggerSpeed+" "+leftTriggerSpeed);
      }
*/
    //if(Robot.m_limitswitch.limitSwitch.get() == true)
    //{ 
      //end();
    //}

  }
  @Override
  protected boolean isFinished() {
    return Robot.m_spinmotor.isSwitchSet();
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
