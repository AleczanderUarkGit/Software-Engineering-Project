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
	
	Sprite(int x, int y, int w, int h, int maxVP, int maxHP, int minHP, int minVP){
		horizontalPosition = x;
		verticalPosition = y;
		height = h;
		width = w;
		this.maxVP = maxVP;
		this.maxHP = maxHP;
		this.minVP = minVP;
		this.minHP = minHP;
	}
	
	Sprite(){
		
	}
	
	public abstract void draw(Graphics g);
	
	/*public void moveLeft( TimeConstraint holdTime )
	{
		
	}*/
		
	public void moveRight( )
	{
		horizontalPosition ++;
	}
	
	public void moveLeft()
	{
		horizontalPosition --;
	}
	
	public abstract void update();
	/*public void jump( TimeInterval holdTime )
	{
		
	}*/
	
	public abstract void walk();

}
