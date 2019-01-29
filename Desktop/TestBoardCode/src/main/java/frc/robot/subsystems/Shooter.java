/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Shooter extends Subsystem {
  DoubleSolenoid pitchSolenoid = null;

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Shooter() {
    //pitchSolenoid = new DoubleSolenoid(RobotMap.SHOOTER_PITCH_SOLENOID_FORWARD, RobotMap.SHOOTER_PITCH_SOLENOID_REVERSE);
  }

  //public void pitchUp() {
  //  pitchSolenoid.set(Value.kForward);
  //}

  //public void pitchDown() {
  //  pitchSolenoid.set(Value.kReverse);
  //}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
