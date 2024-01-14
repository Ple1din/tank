package frc.robot;

import frc.robot.resources.TecbotSpeedController.TypeOfMotor;

public class RobotMap {

    public static final double OFFSET = 0.05;

    public static final int driveTrainPorts[] = {13, 15, 20,51};
    
    public static final int pilotPort = 0;

    public static final TypeOfMotor chassisMotor[] = {TypeOfMotor.CAN_SPARK_BRUSHLESS, TypeOfMotor.CAN_SPARK_BRUSHLESS};
    
    public static final double chassisSpeedL = 0.3;

    public static final double chassisSpeedR = 0.3;
}
