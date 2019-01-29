/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.PWMVictorSPX;
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
  //Spark leftFrontSpark = null;
  PWMVictorSPX leftFrontPWMVictorSPX =null;
  //Spark leftBackSpark = null;
  PWMVictorSPX rightFrontPWMVictorSPX =null;
 // Spark rightFrontSpark = null;
  //Spark rightBackSpark = null;

  DifferentialDrive differentialDrive = null;

  public Drivetrain() {
    // assign values to Spark variables
    //leftFrontSpark = new Spark(RobotMap.DRIVETRAIN_LEFT_FRONT_SPARK); // port numbers defined in RobotMap
    leftFrontPWMVictorSPX = new PWMVictorSPX(RobotMap.DRIVETRAIN_LEFT_FRONT_PWMVictorSPX); 
    rightFrontPWMVictorSPX = new PWMVictorSPX(RobotMap.DRIVETRAIN_RIGHT_FRONT_PWMVictorSPX); 
    //rightBackSpark = new Spark(RobotMap.DRIVETRAIN_RIGHT_BACK_SPARK); 
    
    // SpeedControllerGroup leftMotor = new SpeedControllerGroup(leftFrontSpark,leftBackSpark);
    // SpeedControllerGroup rightMotor = new SpeedControllerGroup(rightFrontSpark,rightBackSpark);

    //leftBackSpark.follow(leftFrontSpark);
    //rightBackSpark.follow(rightFrontSpark);

    differentialDrive = new DifferentialDrive(leftFrontPWMVictorSPX, rightFrontPWMVictorSPX);
  }

  public void arcadeDrive(double moveSpeed, double rotateSpeed) {
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
