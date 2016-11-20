/**
 * @(#) Mario.java
 */

package Class.Sprite;

import java.lang.Object;
import java.util.LinkedList;

import javax.imageio.ImageIO;

import Class.FixedObjects.Tube;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

public class Mario extends Characters
{
	private Image kickShellLeft;
	
	private Image kickShellRight;
	
	private int gravity;
	
	private Image runningLeft1;
	
	private boolean invincibleState;
	
	private int runJumpRight;
	
	private Image fullSpeedRight;
	
	private Image runJumpLeft;
	
	private Image fullSpeedLeft;
	
	private Image holdShellLeft;
	
	private Image holdShellRight;
	
	private int lives = 4;
	
	public int score = 0;
	
	Mario(int x, int y, int width, int height, int maxVP, int maxHP, int minVP, int minHP, String left, String right) throws IOException{
		super(x, y, width, height, maxVP, maxHP, minVP, minHP, left, right);
	}
	
	Mario(){
		
	}
	public void decrementLives(){
		lives --;	
	}
	
	public int getLives(){
		return lives;
	}
	
	public void contact( java.lang.Object object )
	{
		
	}
	
	public void run( int horizontalPosition )
	{
		
	}
	
	public void kickShell( Shell shell )
	{
		
	}
	
	public void runningJump( int verticalPosition, int horizontalPosition, Image marioImage )
	{
		
	}
	
	public void pickUpShell( Shell shell )
	{
		
	}
	
	public void throwShell( Shell shell )
	{
		
	}
	
	public void downTube( Tube tube )
	{
		
	}
	
	public void walk(){}
	
	
}
