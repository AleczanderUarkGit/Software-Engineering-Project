/**
 * @(#) FlyingGumba.java
 */

package Class.Sprite;

import java.awt.Image;
import java.io.IOException;

public class FlyingGumba extends Gumba
{
	private Image redGumbaWithWings;
	
	FlyingGumba(int x, int y, int width, int height, int maxVP, int maxHP, int minVP, int minHP, String image1, String image2) throws IOException{
		super(x, y, width, height, maxVP, maxHP, minVP, minHP, image1, image2);
	}
	
	public void jumpLeft( int horizontalPosition, int verticalPosition )
	{
		
	}
	
	public void jumpRight( int horizontalPosition, int verticalPosition )
	{
		
	}
	
	public WalkingGumba wingsOff( )
	{
		return null;
	}
	
	public void walk(){}
	
	public void collisionTop(Sprite sprite){ 
	}
	
	public void collisionBottom(Sprite sprite){
		
	}
	
	public void collisionRight(Sprite sprite){
		
	}
	
	public void collisionLeft(Sprite sprite){
		
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
