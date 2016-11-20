/**
 * @(#) SmallMario.java
 */

package Class.Sprite;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SmallMario extends Mario
{
	private Image dyingMario;
	private Image right2;
	private Image left2;
	
	public SmallMario(int x, int y, int width, int height, int maxVP, int maxHP, int minVP, int minHP) throws IOException{
		//local variable
			super(x, y, width, height, maxVP, maxHP, minVP, minHP, "small_mario_right.PNG", "small_mario_left.PNG");
			this.currentImage = ImageIO.read(new File("small_mario_right.PNG")); 
			this.maxVP = 600;
			this.minVP = 0;
			this.minHP = 0;
			this.maxHP = 1000000;
	}
	
	
	public void dieByContact() throws IOException{
		this.currentImage = ImageIO.read(new File("mario_normal.PNG")); 
		this.jump();
		this.maxVP = 1000;
		this.verticalPosition = 1000;
	}
	
	public void moveRight(){
		horizontalVelocity = 1;
	}
	
	public void moveLeft(){
		horizontalVelocity= -1;
	}
	
	public BigMario grow( )
	{
		return null;
	}
	
	
}
