package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class DemoRobotCls
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
     Runtime.getRuntime().exec("notepad");
     Thread.sleep(0); 
     Robot r=new Robot();
     r.keyPress(KeyEvent.VK_SHIFT);
     r.keyPress(KeyEvent.VK_Q);
     r.keyRelease(KeyEvent.VK_SHIFT );
     r.keyPress(KeyEvent.VK_S);
     r.keyPress(KeyEvent.VK_P);
     //for closing the Notepad window
     r.keyPress(KeyEvent.VK_ALT);
     r.keyPress(KeyEvent.VK_F4);
     r.keyRelease(KeyEvent.VK_ALT);
     //for clicking on don't save popup
     r.keyPress(KeyEvent.VK_RIGHT);
     r.keyRelease(KeyEvent.VK_RIGHT);
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER); 
	}
}
