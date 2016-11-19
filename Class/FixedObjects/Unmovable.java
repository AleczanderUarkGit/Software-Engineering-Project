/**
 * @(#) Unmovable.java
 */

package Class.FixedObjects;

import java.awt.Image;
import java.io.IOException;

import Class.Sprite.Sprite;

public class Unmovable extends Block
{
	private Image image;
	
	public Unmovable(int x, int y, int w, int h, String image) throws IOException{
		super(x, y, w, h, image);
	}
	
	public void collisionBottom(Sprite sprite){
		sprite.minVP = this.verticalPosition  + this.height;
	}
	
}
