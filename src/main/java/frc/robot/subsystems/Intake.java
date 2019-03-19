/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import frc.robot.RobotMap;
//import frc.robot.commands.IntakeBallDefault;;

/**
 * Add your docs here.
 */
public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
public PWMVictorSPX Intake1 = null;
public PWMVictorSPX Intake2 = null;

public Intake () {
  Intake1 = new PWMVictorSPX(RobotMap.INTAKE_MOTOR_PWMVICTORSPX_1);
  Intake2 = new PWMVictorSPX(RobotMap.INTAKE_MOTOR_PWMVICTORSPX_2);
}


public void Speed(double spinSpeed){
  //motors.set(spinSpeed);
  Intake1.set(0.5*spinSpeed);
  Intake2.set(-0.5*spinSpeed); // might need to make Intake1 take the negative value if button for input actually makes ball go outit add
}
  @Override
  public void initDefaultCommand() {
    //setDefaultCommand(new IntakeBallDefault());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
