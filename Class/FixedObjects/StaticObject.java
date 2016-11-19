/**
 * @(#) StaticObject.java
 */

package Class.FixedObjects;

import java.lang.Object;

import Class.Sprite.Mario;
import Class.Sprite.Sprite;

import java.awt.Image;
import java.awt.Graphics;

public abstract class StaticObject
{
	public int verticalPosition;
	public int horizontalPosition;
	public int height;
	public int width;
	public boolean decay;
	
	StaticObject(int x, int y, int w, int h){
		horizontalPosition = x;
		verticalPosition = y;
		height = h;
		width = w;
	}
	
	StaticObject(){
		
	}
	
	public void onContact( java.lang.Object Object )
	{
		
	}
	
	public void jumpRight(){
                horizontalPosition += 1;
	}
	
	public void jumpLeft(){
                horizontalPosition -= 1;
	}
	
	public void moveLeft(){
		horizontalPosition -= 6;
	}
	
	public void moveRight(){
		horizontalPosition += 6;
	}
	
	public abstract void draw(Graphics g);
	
	public int checkForCollisions(Sprite sprite){{
		if((sprite.verticalPosition + sprite.height <= this.verticalPosition)&&(!(sprite.horizontalPosition > this.horizontalPosition + this.width))&&(!(sprite.horizontalPosition + sprite.width < this.horizontalPosition))){
			if(sprite.maxVP+sprite.height > this.verticalPosition)	
				collisionTop(sprite);
			return 1;
		}
		else if((sprite.verticalPosition >= this.verticalPosition + this.height)&&(!(sprite.horizontalPosition > this.horizontalPosition + this.width))&&(!(sprite.horizontalPosition + sprite.width < this.horizontalPosition))){
			if(sprite.minVP < this.verticalPosition + this.height)	
				collisionBottom(sprite);
			return 1;
		}
		else if((!(sprite.verticalPosition + sprite.height <= this.verticalPosition))&&(sprite.horizontalPosition + sprite.width >= this.horizontalPosition)&&(sprite.horizontalPosition + sprite.width< this.horizontalPosition + this.width)&&(sprite.horizontalPosition < this.horizontalPosition)){
			System.out.println("Left side");
			collisionLeft(sprite);
			return 1;
		}
		else if((!(sprite.verticalPosition + sprite.height <= this.verticalPosition))&&(sprite.horizontalPosition <= this.horizontalPosition + this.width)&&(sprite.horizontalPosition + sprite.width>= this.horizontalPosition + this.width)&&(sprite.horizontalPosition > this.horizontalPosition)){
			System.out.println("Right side");
			collisionRight(sprite);
			return 1;
		}
		else if((sprite.verticalPosition < this.verticalPosition)&&(sprite.verticalPosition + sprite.height < this.verticalPosition + this.height)&&(sprite.horizontalPosition + sprite.width == this.horizontalPosition)&&(sprite.horizontalPosition + sprite.width< this.horizontalPosition + this.width)){
			System.out.println("Top Left side");
			collisionTopLeft(sprite);
			return 1;
		}
		else if ((sprite.verticalPosition > this.verticalPosition)&&(sprite.verticalPosition +sprite.height > this.verticalPosition + this.height)&&(sprite.verticalPosition < this.verticalPosition + this.height)&&(sprite.horizontalPosition + sprite.width == this.horizontalPosition)){
			System.out.println("bottom Left side");
			collisionBottomLeft(sprite);
			return 1;
		}
		else if ((sprite.verticalPosition > this.verticalPosition)&&(sprite.verticalPosition +sprite.height > this.verticalPosition + this.height)&&(sprite.verticalPosition < this.verticalPosition + this.height)&&(sprite.horizontalPosition == this.horizontalPosition + this.width)){
			System.out.println("bottom right side");
			collisionBottomRight(sprite);
			return 1;
		}
		else if((sprite.verticalPosition < this.verticalPosition)&&(sprite.verticalPosition + sprite.height > this.verticalPosition)&&(sprite.verticalPosition + sprite.height < this.verticalPosition + this.height)&&(sprite.horizontalPosition == this.horizontalPosition + this.width)){
			System.out.println("Top right side");
			collisionTopRight(sprite);
			return 1;
		}
	}
	return 0;
}
	public abstract void collisionTopRight(Sprite sprite);
	public abstract void collisionTopLeft(Sprite sprite);
	public abstract void collisionBottomLeft(Sprite sprite);
	public abstract void collisionBottomRight(Sprite sprite);
	public abstract void collisionTop(Sprite sprite);
	public abstract void collisionBottom(Sprite sprite);
	public abstract void collisionLeft(Sprite sprite);
	public abstract void collisionRight(Sprite sprite);
	
}
