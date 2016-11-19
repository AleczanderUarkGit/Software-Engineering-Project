/**
 * @(#) WalkingGumba.java
 */

package Class.Sprite;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class WalkingGumba extends Gumba
{
	private Image flat = ImageIO.read(new File("flatGumba.PNG"));;
	
	public WalkingGumba(int x, int y, int width, int height, String image, String image2) throws IOException{
		super(x, y, width, height, image, image2);
	}
	
}
