/**
 * @(#) FlyingGumba.java
 */

package Class.Sprite;

import java.awt.Image;
import java.io.IOException;

public class FlyingGumba extends Gumba
{
	private Image redGumbaWithWings;
	
	FlyingGumba(int x, int y, int width, int height, String image1, String image2) throws IOException{
		super(x, y, width, height, image1, image2);
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
	
	
}
