/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.SpinTheMotor;

/**
 * Add your docs here.
 */

public class SpinMotor extends Subsystem {
    /*public  SpinMotor1(){
        Victor SpinMotor1 =null;
        SpinMotor1 = new Victor(RobotMap.SPINMOTOR_SPIN_MOTOR_1_VICTOR);
    }
    */
    public TalonSRX SpinMotor1 = null;

    public SpinMotor(){
    //PWMVictorSPX SpinMotor1 = new PWMVictorSPX(3);
    SpinMotor1 = new TalonSRX(RobotMap.SPINMOTOR_SPIN_MOTOR_1_TALONSRX1);
    
  /* SpeedController spinTalonSRX = null;
    SpeedControllerGroup SpinMotor  new SpeedControllerGroup(SPINMOTOR_SPINTALON_TALON)
public SpinMotor(SpeedController SpinmMotor) {

    spinTalonSRX = new TalonSRX(RobotMap.SPINMOTOR_SPINTALON_TALON);
  }
*/
    }
   
    public void Spin(double SpinValue){
        SpinMotor1.set(ControlMode.PercentOutput, SpinValue);

    }
            
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new SpinTheMotor());
   }
}