package Class.Sprite;

import java.io.IOException;

public abstract class Enemy extends Characters {
	
	public Enemy(int x, int y, int w, int h, int maxVP, int maxHP, int minVP, int minHP, String left, String right) throws IOException{
		super(x, y, w, h, maxVP, maxHP, minVP, minHP, left, right);
	}
	
	public abstract void walk();

	public int checkForCollisions(Sprite sprite) throws IOException{
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
		return 0;
	}
	
	public abstract void collisionTopRight(Sprite sprite) throws IOException;;
	public abstract void collisionBottomRight(Sprite sprite) throws IOException;
	public abstract void collisionTopLeft(Sprite sprite) throws IOException;
	public abstract void collisionBottomLeft(Sprite sprite) throws IOException;
	public abstract void collisionTop(Sprite sprite) throws IOException;
	public abstract void collisionBottom(Sprite sprite) throws IOException;
	public abstract void collisionLeft(Sprite sprite) throws IOException;
	public abstract void collisionRight(Sprite sprite) throws IOException;
	
	
}
