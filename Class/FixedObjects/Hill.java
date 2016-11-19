/**
 * @(#) Hill.java
 */

package Class.FixedObjects;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Class.Sprite.Sprite;

public class Hill extends StaticObject
{
	private Image image;
	public Hill(int x, int y, int width, int height, String img) throws IOException{
		super(x, y, width, height);
		image = ImageIO.read(new File(img));	
	}
	
	public void onContact( java.lang.Object object )
	{
		
	}
	
	public void draw(Graphics g){
		g.drawImage(image, horizontalPosition, verticalPosition, null);
	}
	public int checkForCollisions(Sprite sprite){
		if((sprite.verticalPosition + sprite.height <= this.verticalPosition)&&(sprite.horizontalPosition+sprite.width > this.horizontalPosition)&&(sprite.horizontalPosition < this.horizontalPosition + this.width)){
			System.out.println("TOP");
			sprite.maxVP = this.verticalPosition - sprite.height;
			return 1;
		}
	return 0;
	}
	
	public void collisionTop(Sprite sprite){
		sprite.maxVP = this.verticalPosition - sprite.height;
	}
	
	public void collisionLeft(Sprite sprite){}
	public void collisionRight(Sprite sprite){}
	public void collisionTopLeft(Sprite sprite){}
	public void collisionBottomLeft(Sprite sprite){}
	public void collisionTopRight(Sprite sprite){}
	public void collisionBottomRight(Sprite sprite){}
	public void collisionBottom(Sprite sprite){}
	
}
