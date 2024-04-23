package RobotClass;

import java.awt.Robot;

public class KeyRobot {
	public static void main (String[]args)throws Exception{
		Robot robo =new Robot();
		Thread.sleep(2000);
		robo.mouseMove(100, 300);
		robo.mousePress(0);
		
		
	}

}
