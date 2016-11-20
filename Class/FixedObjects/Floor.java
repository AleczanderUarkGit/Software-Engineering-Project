package Class.FixedObjects;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Class.Sprite.Mario;
import Class.Sprite.Sprite;

public class Floor extends StaticObject{
	public Image image = null;
	
	public Floor(int x, int y, int width, int height, String img) throws IOException{
		super(x, y, width, height);
		image = ImageIO.read(new File(img));	
	}
	
	
	public void draw(Graphics g){
		g.drawImage(image, horizontalPosition, verticalPosition, null);
	}

	public void collisionLeft(Sprite sprite){
		sprite.maxHP = this.horizontalPosition;
		sprite.horizontalVelocity = 0;
		sprite.stuckRight = true;
	}
	
	public void collisionTop(Sprite sprite){
		sprite.maxVP = this.verticalPosition - sprite.height;
	}
	
	public void collisionRight(Sprite sprite){
		sprite.minHP = this.horizontalPosition + this.width;
		sprite.horizontalVelocity = 0;
		sprite.stuckLeft = true;
	}
	
	public void collisionBottom(Sprite sprite){
		sprite.minVP = this.verticalPosition  + this.height;
	}
	
	public void collisionTopLeft(Sprite sprite){
		sprite.maxHP = this.horizontalPosition - sprite.width;
		sprite.horizontalVelocity = 0;
		sprite.stuckRight = true;
	}
	
	public void collisionBottomLeft(Sprite sprite){
		sprite.maxHP = this.horizontalPosition - sprite.width;
		sprite.horizontalVelocity = 0;
		sprite.stuckRight = true;
	}
	
	public void collisionBottomRight(Sprite sprite){
		sprite.maxHP = this.horizontalPosition - sprite.width;
		sprite.horizontalVelocity = 0;
		sprite.stuckLeft = true;
	}
	
	public void collisionTopRight(Sprite sprite){
		sprite.maxHP = this.horizontalPosition - sprite.width;
		sprite.horizontalVelocity = 0;
		sprite.stuckLeft = true;
	}
}
