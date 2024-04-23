package RobotClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class NotePadTest {
	public static void main (String []args)throws Exception{
		Runtime.getRuntime().exec("notepad");
		
		Thread.sleep(2000);
		Robot robo =new Robot();
		robo.keyPress(KeyEvent.VK_SHIFT);
		
		robo.keyPress(KeyEvent.VK_R);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_E);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyPress(KeyEvent.VK_T);
		robo.keyPress(KeyEvent.VK_H);	
		robo.keyRelease(KeyEvent.VK_SHIFT);
			
	}

}
