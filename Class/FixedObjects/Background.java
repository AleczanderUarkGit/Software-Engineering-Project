package Class.FixedObjects;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.imageio.ImageIO;

import Class.Sprite.Sprite;

public class Background extends StaticObject{
	static Image background = null;
	
	public Background() throws IOException{
	    super(0, 0, 2641, 186);
	    background = ImageIO.read(new File("background.png"));
	}
	
	boolean update() {
		return false;
	}

	
	public void draw(Graphics g) {
		g.drawImage(background, horizontalPosition, verticalPosition, null);
		
	}

	boolean isTube() {
		return false;
	}
	public int checkForCollisions(Sprite sprite){
		return 0;
	}
	
	public void collisionLeft(Sprite sprite){}
	public void collisionRight(Sprite sprite){}
	public void collisionTop(Sprite sprite){}
	public void collisionBottom(Sprite sprite){}
	public void collisionTopLeft(Sprite sprite){}
	public void collisionTopRight(Sprite sprite){}
	public void collisionBottomLeft(Sprite sprite){}
	public void collisionBottomRight(Sprite sprite){}
}
