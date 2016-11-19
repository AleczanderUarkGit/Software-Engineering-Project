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
	
	
}
