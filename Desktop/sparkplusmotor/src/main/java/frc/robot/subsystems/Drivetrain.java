/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
//import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveArcade;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // change Spark to SparkSRX in actual code, drivers for CAN motors only work on Windows computers
  PWMVictorSPX leftFrontPWMVICTORSPX = null;
  //Spark leftBackSpark = null;
  PWMVictorSPX rightFrontPWMVICTORSPX = null;
  //Spark rightBackSpark = null;

  DifferentialDrive differentialDrive = null;

  public Drivetrain() {
    // use following lines for new robot:
    //leftFrontPWMVICTORSPX = new PWMVictorSPX(RobotMap.DRIVETRAIN_LEFT_FRONT_PWMVICTORSPX); // port numbers defined in RobotMap
    //rightFrontPWMVICTORSPX = new PWMVictorSPX(RobotMap.DRIVETRAIN_RIGHT_FRONT_PWMVICTORSPX); 

    // use following lines for old robot:
    leftFrontPWMVICTORSPX = new Spark(RobotMap.DRIVETRAIN_LEFT_FRONT_PWMVICTORSPX);
    rightFrontPWMVICTORSPX = new Spark(RobotMap.DRIVETRAIN_RIGHT_FRONT_PWMVICTORSPX); 

    differentialDrive = new DifferentialDrive(leftFrontPWMVICTORSPX, rightFrontPWMVICTORSPX);
  }

  public void arcadeDrive(double moveSpeed, double rotateSpeed) {

    System.out.println("Before: " + rotateSpeed);
    // square the values of moveSpeed and rotateSpeed to dampen
    // keep negative values negative
    if(moveSpeed < 0) {
      moveSpeed = - (moveSpeed * moveSpeed);
    }
    else {
      moveSpeed = moveSpeed * moveSpeed;
    }

    if(rotateSpeed < 0) {
      rotateSpeed = - (rotateSpeed * rotateSpeed);
    }
    else {
      rotateSpeed = rotateSpeed * rotateSpeed;
    }
    System.out.println("After: " + rotateSpeed);
    differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }

  @Override
  public void initDefaultCommand() { 
    setDefaultCommand(new DriveArcade());

    // runs automatically everytime the subsystem is called
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
