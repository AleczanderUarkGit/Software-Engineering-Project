/**
 * @(#) WalkingGumba.java
 */

package Class.Sprite;

import java.awt.Image;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class WalkingGumba extends Gumba
{
	private Image flat = ImageIO.read(new File("flatGumba.PNG"));;
	
	public WalkingGumba(int x, int y, int width, int height, int maxVP, int maxHP, int minVP, int minHP, String image, String image2) throws IOException{
		super(x, y, width, height, maxVP, maxHP, minVP, minHP, image, image2);
		this.currentImage = ImageIO.read(new File(image));
	}
	
	public void walk(){
		switchImage();
		if(stuckLeft == true){
			horizontalPosition++;
		}
		else if(stuckRight == true){
			horizontalPosition-=6;
		}
		else
			horizontalPosition -= 6;
	}
	
	public void collisionRight(Sprite sprite) throws IOException{
		if(sprite instanceof SmallMario){
			SmallMario mario = (SmallMario)sprite;
			mario.dieByContact();
		}
		else if(sprite instanceof BigMario){
			BigMario mario = (BigMario)sprite;
			mario.shrink();
		}
		else if(sprite instanceof Shell){
			
		}
	}
	
	public void collisionLeft(Sprite sprite) throws IOException{
		if(sprite instanceof SmallMario){
			SmallMario mario = (SmallMario)sprite;
			mario.dieByContact();
		}
		else if(sprite instanceof BigMario){
			BigMario mario = (BigMario)sprite;
			mario.shrink();
		}
		else if(sprite instanceof Shell){
			
		}
	}
	
	public void collisionTop(Sprite sprite){
		
	}
	
	public void collisionBottom(Sprite sprite) throws IOException{
		if(sprite instanceof SmallMario){
			SmallMario mario = (SmallMario)sprite;
			mario.dieByContact();
		}
		else if(sprite instanceof BigMario){
			BigMario mario = (BigMario)sprite;
			mario.shrink();
		}
		else if(sprite instanceof Shell){
			
		}
	}
	
	public void collisionTopLeft(Sprite sprite) throws IOException{
		if(sprite instanceof SmallMario){
			SmallMario mario = (SmallMario)sprite;
			mario.dieByContact();
		}
		else if(sprite instanceof BigMario){
			BigMario mario = (BigMario)sprite;
			mario.shrink();
		}
		else if(sprite instanceof Shell){
			
		}
	}
	
	public void collisionBottomLeft(Sprite sprite) throws IOException{
		if(sprite instanceof SmallMario){
			SmallMario mario = (SmallMario)sprite;
			mario.dieByContact();
		}
		else if(sprite instanceof BigMario){
			BigMario mario = (BigMario)sprite;
			mario.shrink();
		}
		else if(sprite instanceof Shell){
			
		}
	}
	
	public void collisionTopRight(Sprite sprite) throws IOException{
		if(sprite instanceof SmallMario){
			SmallMario mario = (SmallMario)sprite;
			mario.dieByContact();
		}
		else if(sprite instanceof BigMario){
			BigMario mario = (BigMario)sprite;
			mario.shrink();
		}
		else if(sprite instanceof Shell){
			
		}
	}
	
	public void collisionBottomRight(Sprite sprite) throws IOException{
		if(sprite instanceof SmallMario){
			SmallMario mario = (SmallMario)sprite;
			mario.dieByContact();
		}
		else if(sprite instanceof BigMario){
			BigMario mario = (BigMario)sprite;
			mario.shrink();
		}
		else if(sprite instanceof Shell){
			
		}
	}
}
