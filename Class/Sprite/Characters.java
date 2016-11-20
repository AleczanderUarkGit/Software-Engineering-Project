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
	public Image leftImage;
	public Image rightImage;
	public Image currentImage;

	int jumpCount = 0;
	
	Characters(int x, int y, int width, int height, int maxVP, int maxHP, int minVP, int minHP, String left, String right) throws IOException{
		super(x, y, width, height, maxVP, maxHP, minVP, minHP);
		
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
			verticalVelocity -= 0.2;
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
		if(horizontalPosition + width >= maxHP){
			horizontalPosition = maxHP - width;
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
                horizontalVelocity = -1;
                if(jumpCount < 2){
                    verticalVelocity = 12;
                    jumpCount++;
                }	
	}
	
	public void moveUpRight(){
        horizontalVelocity = 1;
        if(jumpCount < 2){
			verticalVelocity = 10;
			jumpCount++;
		}
	}
	
	public void jump(){
		if(jumpCount < 2){
			System.out.println("Jump");
			verticalVelocity = 6;
			jumpCount++;
		}
	}
	
	public void switchImage(){
		if(this.currentImage.equals(leftImage))
			this.currentImage = rightImage;
		else if(this.currentImage.equals(rightImage))
			this.currentImage = leftImage;
		else
			this.currentImage = leftImage;
	}
	

}
