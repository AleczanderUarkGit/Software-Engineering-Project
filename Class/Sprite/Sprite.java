/**
 * @(#) Sprite.java
 */

package Class.Sprite;

import java.awt.Graphics;
//import UML Standard Profile.UML2 Metamodel.TimeConstraint;
import java.awt.Image;
//import UML Standard Profile.UML2 Metamodel.TimeInterval;

public abstract class Sprite
{
	protected Image image;
	
	public int horizontalPosition;
	
	public int verticalPosition;
	
	public int height;
	
	public int width;
	
	public double horizontalVelocity = 0;
	public double verticalVelocity = 0;
	public int jumpCount = 0;

	public int maxVP;

	public int maxHP;
	public int minHP;
	public int minVP;
	public boolean stuckLeft;
	public boolean stuckRight;
	
	Sprite(int x, int y, int w, int h){
		horizontalPosition = x;
		verticalPosition = y;
		height = h;
		width = w;
	}
	
	Sprite(){
		
	}
	
	public abstract void draw(Graphics g);
	
	/*public void moveLeft( TimeConstraint holdTime )
	{
		
	}*/
		
	public void moveRight( )
	{
		horizontalVelocity = 2;
	}
	
	public void moveLeft()
	{
		horizontalVelocity = -2;
	}
	
	public abstract void update();
	/*public void jump( TimeInterval holdTime )
	{
		
	}*/
	
}
