/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
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
    DigitalInput limitSwitchTop =  new DigitalInput(RobotMap.LIMIT_SWITCH_TOP);
    DigitalInput limitSwitchBottom =  new DigitalInput(RobotMap.LIMIT_SWITCH_BOTTOM);
    public TalonSRX SpinMotor1 = null;
    //Counter counter = new Counter(limitSwitch);

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
    
    public boolean isTopSwitchSet() {
        //int valueOfSwitch = counter.get();
        boolean valueOfSwitch = limitSwitchTop.get();
        System.out.println("value of the Top limit switch "+valueOfSwitch);
        //return valueOfSwitch > 0;
        return valueOfSwitch;
    }
    public boolean isBottomSwitchSet() {
        //int valueOfSwitch = counter.get();
        boolean valueOfSwitch = limitSwitchBottom.get();
        System.out.println("value of the Bottom limit switch "+valueOfSwitch);
        //return valueOfSwitch > 0;
        return valueOfSwitch;
    }

    public void initializeCounter() {
        //counter.reset();
    }
   
    public void Spin(double SpinValue){
        SpinMotor1.set(ControlMode.PercentOutput, SpinValue);

    }
   
            
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new SpinTheMotor());
   }
}
