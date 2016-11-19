/**
 * @(#) GoldenFlashy.java
 */

package Class.FixedObjects;

import java.awt.Image;
import java.io.IOException;

public class GoldenFlashy extends Movable
{
	Image image2;
	Image image3;
	
	public GoldenFlashy(int x, int y, int w, int h, String image) throws IOException {
		super(x, y, w, h, image);
		// TODO Auto-generated constructor stub
	}

	private Image gleamLowerRight;
	
	private Image bigGleamLowerRight;
	
	private Image gleamUpperLeft;
	
	private Image noGleam;
	
	public void explode( )
	{
		
	}
	
	public Fixed transformToCoin( )
	{
		return null;
	}
	
	
}
