/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;
import frc.robot.subsystems.SpinMotor;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  
  public Joystick driverController = new Joystick(RobotMap.OI_DRIVER_CONTROLLER);
  public Joystick driverController2 = new Joystick(RobotMap.OI_DRIVER_CONTROLLER2); //tkb
  
  // create buttons linked to each button on the controller
  Button D1 = new JoystickButton(driverController, 1);
  Button D2 = new JoystickButton(driverController, 2);
  Button D3 = new JoystickButton(driverController, 3);
  Button D4 = new JoystickButton(driverController, 4);
  Button D5 = new JoystickButton(driverController, 5);
  Button D6 = new JoystickButton(driverController, 6);

  Button D1_2 = new JoystickButton(driverController2, 1);
  Button D2_2 = new JoystickButton(driverController2, 2);
  Button D3_2 = new JoystickButton(driverController2, 3);
  Button D4_2 = new JoystickButton(driverController2, 4);
  //Button D8 = new JoystickButton(driverController, 8);
  //Button D9 = new JoystickButton(driverController, 9);
  //Button D10 = new JoystickButton(driverController, 10);

  public OI() {
    // OPTION 1: try using toggleWhenPressed (see documentation online: http://first.wpi.edu/FRC/roborio/beta/docs/java/edu/wpi/first/wpilibj/buttons/Button.html#toggleWhenPressed-edu.wpi.first.wpilibj.command.Command-)
    //D1.toggleWhenPressed(new IntakeBallIn());
    //D2.toggleWhenPressed(new IntakeBallOut());

    //D1_2.toggleWhenPressed(new IntakeBallIn());
  //D2_2.toggleWhenPressed(new IntakeBallOut());

    //D1.whileHeld(new IntakeBallOut(1.0));
   // D2.whileHeld(new IntakeBallIn());
   // D4.whileHeld(new potc());
    
    D1_2.whileHeld(new IntakeBallOut(1.0));
    D2_2.whileHeld(new IntakeBallIn());
    D3_2.whileHeld(new IntakeBallOut(0.5));
    D4_2.whileHeld(new potc());
  
    // OPTION 2: use a set of buttons, one to start and one to stop
    /*IntakeBallIn ballIn = new IntakeBallIn();
    IntakeBallOut ballOut = new IntakeBallOut();
    D3.whenPressed(ballIn);
    D2.whenPressed(ballOut);
    D1.cancelWhenPressed(ballIn);
    D4.cancelWhenPressed(ballOut);*/
    //D1.cancelWhenPressed(new IntakeBallIn());
   //  D7.whenPressed(new SpinTheMotor());
     //D6.whenPressed(new SpinTheMotorBack());
  }

  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
