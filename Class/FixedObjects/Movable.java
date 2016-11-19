/**
 * @(#) Movable.java
 */

package Class.FixedObjects;

import java.lang.Object;

import Class.Sprite.Sprite;

import java.awt.Image;
import java.io.IOException;

public class Movable extends Block
{
	Movable(int x, int y, int w, int h, String image) throws IOException {
		super(x, y, w, h, image);
		// TODO Auto-generated constructor stub
	}

	private int gravity;
	
	private java.lang.Object innerObject;
	
	public void hop( )
	{
		
	}
	
	public void ejectObject( )
	{
		
	}
	
	public Image updateImage( Image CurrentImage )
	{
		return null;
	}
	
	public Fixed transform_to_Fixed( )
	{
		return null;
	}
	
	public void collisionBottom(Sprite sprite){
		
	}
	
	public void collisionTop(Sprite sprite){
		
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
