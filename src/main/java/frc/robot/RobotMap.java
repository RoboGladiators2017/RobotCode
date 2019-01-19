/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // Talons: 
  public static final int DRIVETRAIN_LEFT_FRONT_TALON = 0;
  public static final int DRIVETRAIN_LEFT_BACK_TALON = 1;
  public static final int DRIVETRAIN_RIGHT_FRONT_TALON = 2;
  public static final int DRIVETRAIN_RIGHT_BACK_TALON = 3;
  // set the joystick value to the port number the joystick uses on the 
  // laptop (this can be found in the Driverstation software):
  public static final int OI_DRIVER_CONTROLLER = 4;
  public static final int DRIVER_CONTROLLER_MOVE_AXIS = 5;
  public static final int DRIVER_CONTROLLER_ROTATE_AXIS = 6;
  
  // ports for solenoid:
  public static final int SHOOTER_PITCH_SOLENOID_FORWARD = 7;
  public static final int SHOOTER_PITCH_SOLENOID_REVERSE = 8;

  
  

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
