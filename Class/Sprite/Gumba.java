/**
 * @(#) Gumba.java
 */

package Class.Sprite;

import java.awt.Image;
import java.io.IOException;

public abstract class Gumba extends Enemy
{
	Gumba(int x, int y, int width, int height, int maxVP, int maxHP, int minVP, int minHP, String image, String image2) throws IOException{
		super(x, y, width, height,  maxVP, maxHP, minVP, minHP, image, image2);
	}
	
}
