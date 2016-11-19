/**
 * @(#) Characters.java
 */

package Class.Sprite;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import java.io.IOException;

public abstract class Characters extends Sprite
{
	private Image leftImage;
	private Image rightImage;
	public Image currentImage;

	int jumpCount = 0;
	
	Characters(int x, int y, int width, int height, String left, String right) throws IOException{
		super(x, y, width, height);
		
		leftImage = ImageIO.read(new File(left));
		rightImage = ImageIO.read(new File(right));
	}
	
	Characters(){
	}
	
	public void disappear( )
	{
		
	}
	
	public void update(){
		if((this.verticalVelocity != 0) && (verticalPosition <= maxVP)){
			verticalPosition -= verticalVelocity;
			verticalVelocity -= 0.8;
		}
		else{
			this.verticalVelocity = 0;
			this.verticalPosition = maxVP;
			jumpCount = 0;
		}
		if(verticalPosition > maxVP){
			System.out.println("lower than max vertical position");
			verticalPosition = maxVP;
			verticalVelocity = 0;
		}if(verticalPosition <= minVP){
			System.out.println("error");
			verticalPosition = minVP;
		}
		if(horizontalPosition >= maxHP){
			horizontalPosition = maxHP;
			System.out.println("Error Check 3");
		}
		
	}
	
	public void updateDirection(){
	if(horizontalVelocity < 0)
		currentImage = rightImage;
	else
		currentImage = leftImage;
	}
	public void draw(Graphics g){
		g.drawImage(currentImage, horizontalPosition, verticalPosition, null);
	}
	
	public void moveUpLeft(){
                horizontalVelocity = -2;
                if(jumpCount < 2){
                    verticalVelocity = 10;
                    jumpCount++;
                }	
	}
	
	public void moveUpRight(){
        horizontalVelocity = 2;
        if(jumpCount < 2){
			verticalVelocity = 10;
			jumpCount++;
		}
	}
	
	public void jump(){
		if(jumpCount < 2){
			System.out.println("Jump");
			verticalVelocity = 10;
			jumpCount++;
		}
	}
	

}
