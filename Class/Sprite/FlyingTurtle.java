/**
 * @(#) FlyingTurtle.java
 */

package Class.Sprite;

import java.awt.Image;
import java.io.IOException;

public class FlyingTurtle extends Turtle
{
	public FlyingTurtle(int x, int y, int w, int h, int maxVP, int maxHP, int minVP, int minHP, String left,
			String right) throws IOException {
		super(x, y, w, h, maxVP, maxHP, minVP, minHP, left, right);
		// TODO Auto-generated constructor stub
	}

	private Image greenShellWithWings;
	
	public void jumpLeft( int horizontalPosition, int verticalPosition )
	{
		
	}
	
	public void jumpRight( int horizontalPosition, int verticalPosition )
	{
		
	}
	
	public WalkingTurtle wingsOff( )
	{
		return null;
	}
	
	public void walk(){}
	
	public void collisionRight(Sprite sprite){
		
	}
	
	public void collisionLeft(Sprite sprite){
		
	}
	
	public void collisionTop(Sprite sprite){
		
	}
	
	public void collisionBottom(Sprite sprite){
		
	}
	
	public void collisionTopLeft(Sprite sprite){
		
	}
	
	public void collisionBottomLeft(Sprite sprite){
		
	}
	
	public void collisionTopRight(Sprite sprite){
		
	}
	
	public void collisionBottomRight(Sprite sprite){
		
	}
	
	
}
