/**
 * @(#) Gumba.java
 */

package Class.Sprite;

import java.awt.Image;
import java.io.IOException;

public abstract class Gumba extends Characters
{
	Gumba(int x, int y, int width, int height, String image, String image2) throws IOException{
		super(x, y, width, height, image, image2);
		this.maxHP = 10000000;
		this.minHP = 0;
		this.maxVP = 500;
		this.minVP = 0;
	}
	
}
