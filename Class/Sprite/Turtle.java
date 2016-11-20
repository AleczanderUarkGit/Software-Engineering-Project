/**
 * @(#) Turtle.java
 */

package Class.Sprite;

import java.awt.Image;
import java.io.IOException;

public abstract class Turtle extends Enemy
{
	public Turtle(int x, int y, int w, int h, int maxVP, int maxHP, int minVP, int minHP, String left, String right)
			throws IOException {
		super(x, y, w, h, maxVP, maxHP, minVP, minHP, left, right);
		// TODO Auto-generated constructor stub
	}

	private Image turtleShell1;
	
	private Image turtleShell2;
	
	public void reanimate( int initialHorizontalPosition, int initialVerticalPosition )
	{
		
	}
	
	public Shell ToShell( )
	{
		return null;
	}
	
	public void walk(){}
	
	public abstract void collisionRight(Sprite sprite);
	public abstract void collisionLeft(Sprite sprite);
	public abstract void collisionTop(Sprite sprite);
	public abstract void collisionBottom(Sprite sprite);
	public abstract void collisionTopLeft(Sprite sprite);
	public abstract void collisionBottomLeft(Sprite sprite);
	public abstract void collisionTopRight(Sprite sprite);
	public abstract void collisionBottomRight(Sprite sprite);
	

	
	
}
