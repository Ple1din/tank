package frc.robot;
import frc.robot.resources.TecbotConstants;
import frc.robot.resources.TecbotController;

public class OI {
    public static OI instance;
  private TecbotController pilot;
  
 
     public OI(){
       pilot = new TecbotController(RobotMap.pilotPort, TecbotConstants.CONTROLLER_TYPE_PILOT);
 
    }
 
    public void configureButtonBindings(){
       
       
 
  
    }
 
    public static OI getInstance() {
       if (instance == null)
           instance = new OI();
 
       return instance;
   }
 
    public TecbotController getPilot(){
       return pilot;
    }
 
 }