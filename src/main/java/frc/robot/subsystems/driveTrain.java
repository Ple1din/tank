package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.RobotMap;
import com.revrobotics.RelativeEncoder;
import frc.robot.resources.TecbotConstants;
import com.revrobotics.CANSparkMax.IdleMode;
import frc.robot.resources.TecbotSpeedController;

public class driveTrain extends SubsystemBase{
    TecbotSpeedController m1;
    TecbotSpeedController m2;
    TecbotSpeedController m3;
    TecbotSpeedController m4; 
    
RelativeEncoder driveTrainEncoderL1, driveTrainEncoderL2, driveTrainEncoderR1, driveTrainEncoderR2;

    public driveTrain() {
        m1 = new TecbotSpeedController(RobotMap.driveTrainPorts[0], RobotMap.chassisMotor[0]);
        m2 = new TecbotSpeedController(RobotMap.driveTrainPorts[1], RobotMap.chassisMotor[1]); 
        m3 = new TecbotSpeedController(RobotMap.driveTrainPorts[2], RobotMap.chassisMotor[1]);
        m4 = new TecbotSpeedController(RobotMap.driveTrainPorts[3], RobotMap.chassisMotor[1]);
        
        m1.getCANSparkMax().setIdleMode(IdleMode.kBrake);
        m2.getCANSparkMax().setIdleMode(IdleMode.kBrake);
        m3.getCANSparkMax().setIdleMode(IdleMode.kBrake);
        m4.getCANSparkMax().setIdleMode(IdleMode.kBrake);
        
        driveTrainEncoderL1 = m1.getCANSparkMax().getEncoder();
        driveTrainEncoderL2 = m2.getCANSparkMax().getEncoder();
        driveTrainEncoderR1 = m3.getCANSparkMax().getEncoder();
        driveTrainEncoderR2 = m4.getCANSparkMax().getEncoder();
        }

    public double getEncoderFeets(){
       
        return (driveTrainEncoderL1.getPosition()+driveTrainEncoderL2.getPosition()+driveTrainEncoderR1.getPosition()+driveTrainEncoderR2.getPosition())/4*TecbotConstants.kDriveTick2Feet;
    }

    public void stop(){
        m1.set(0);
        m2.set(0);
        m3.set(0);
        m4.set(0);
        }

    public void driveForward(){
        m1.set(-RobotMap.chassisSpeedL);
        m2.set(-RobotMap.chassisSpeedL); 
        m3.set(RobotMap.chassisSpeedR);
        m4.set(RobotMap.chassisSpeedR); 
        }
    public void driveBackwards(){
        m1.set(RobotMap.chassisSpeedL);
        m2.set(RobotMap.chassisSpeedL); 
        m3.set(-RobotMap.chassisSpeedR);
        m4.set(-RobotMap.chassisSpeedR); 
        }
    public void turnRight(){
        m1.set(-RobotMap.chassisSpeedL);
        m2.set(-RobotMap.chassisSpeedL); 
        m3.set(-RobotMap.chassisSpeedR);
        m4.set(-RobotMap.chassisSpeedR); 
    }
    public void turnLeft(){
        m1.set(RobotMap.chassisSpeedL);
        m2.set(RobotMap.chassisSpeedL); 
        m3.set(RobotMap.chassisSpeedR);
        m4.set(RobotMap.chassisSpeedR); 
    }
}