
package frc.robot.subsystems;



import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.Move;

/**
 *
 */
public class Motor extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
  private WPI_TalonSRX basicMotor = new WPI_TalonSRX(11);
  
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new Move());

}
	public void goForward()
	{
		basicMotor.set(0.5);
		
	}

    public void stopMotor()
    {
        basicMotor.set(0.0);
    }
}