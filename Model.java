import java.util.Random;

import javax.imageio.ImageIO;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import Class.Sprite.SmallMario;
import Class.FixedObjects.Background;
import Class.FixedObjects.Fixed;
import Class.FixedObjects.Floor;
import Class.FixedObjects.Hill;
import Class.FixedObjects.StaticObject;
import Class.FixedObjects.Tube;
import Class.FixedObjects.Unmovable;
import Class.Sprite.Characters;
import Class.Sprite.Mario;
import Class.Sprite.Sprite;
import Class.Sprite.WalkingGumba;

class Model
{
	LinkedList<Sprite> sprites;
	LinkedList<StaticObject> objects;
	int numFrame;
	Mario mario = new SmallMario(33, 268, 26, 32);
	boolean pause;
	
	Model() throws IOException {
		resetModel();
	}

    public void moveUpLeft() {
    	if(mario.stuckLeft == false){
			ListIterator<Sprite> iterator = sprites.listIterator();
			mario.moveUpLeft();
			mario.updateDirection();
			while(iterator.hasNext()){
				Sprite sprite = iterator.next();
				sprite.moveLeft();
				if(sprite instanceof Characters){
					Characters character = (Characters)sprite;
					character.updateDirection();
				}
			}
			ListIterator<StaticObject> it = objects.listIterator();
			while(it.hasNext()){
				StaticObject obj = it.next();
				obj.jumpRight();
			}
    	}
    	else
    		mario.stuckLeft = false;
	}
	
	public void moveUpRight() {
		if(mario.stuckRight == false){
	        ListIterator<Sprite> iterator = sprites.listIterator();
	        mario.moveUpRight();
			mario.updateDirection();
			while(iterator.hasNext()){
				Sprite sprite = iterator.next();
				sprite.moveLeft();
				if(sprite instanceof Characters){
					Characters character = (Characters)sprite;
					character.updateDirection();
				}
			}
			ListIterator<StaticObject> it = objects.listIterator();
			while(it.hasNext()){
				StaticObject obj = it.next();
				obj.horizontalPosition -= 5;
				obj.jumpLeft();
			}
		}
		else
			mario.stuckRight = false;
	}
	
	public void moveRight() {
		if(mario.stuckRight == false){
			ListIterator<Sprite> iterator = sprites.listIterator();
			mario.moveRight();
			mario.updateDirection();
			while(iterator.hasNext()){
				Sprite sprite = iterator.next();
				sprite.moveLeft();
				if(sprite instanceof Characters){
					Characters character = (Characters)sprite;
					character.updateDirection();
				}
			}
			ListIterator<StaticObject> it = objects.listIterator();
				while(it.hasNext()){
					StaticObject obj = it.next();
					obj.moveLeft();
				}
			}
		else
			mario.stuckRight = false;
	}
	
	public void moveLeft() {
		if(mario.stuckLeft == false){
			ListIterator<Sprite> iterator = sprites.listIterator();
			mario.moveLeft();
			mario.updateDirection();
			while(iterator.hasNext()){
				Sprite sprite = iterator.next();
				sprite.moveLeft();
				if(sprite instanceof Characters){
					Characters character = (Characters)sprite;
					character.updateDirection();
				}
			}
			ListIterator<StaticObject> it = objects.listIterator();
			while(it.hasNext()){
					StaticObject obj = it.next();
					obj.moveRight();
			}
		}
		else
			mario.stuckLeft = false;
	}
	
	public void update(){
		ListIterator<Sprite> iterator = sprites.listIterator();
		while(iterator.hasNext()){
			Sprite sprite = iterator.next();
			sprite.update();
			checkForCollisions(mario, sprite);
			ListIterator<StaticObject> it = objects.listIterator();
			int collisionCount = 0;
			while(it.hasNext()){
				StaticObject obj = it.next();
				collisionCount += obj.checkForCollisions(mario);
				collisionCount += obj.checkForCollisions(sprite);
				//obj.update();
			}
			if(collisionCount == 0){
				if(mario.verticalVelocity == 0)
					mario.verticalVelocity = -10;
				mario.maxVP = 600;
			}
		}
		mario.update();
		if(mario.verticalPosition > 500){
			mario.decrementLives();
			try {
				resetModel();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void checkForCollisions(Mario mario, Sprite sprite){
	}
	
	
	
	public void checkForCollisions(Sprite sprite, StaticObject object){
	}
	
	public void resetModel() throws IOException{
		numFrame = 0;
		sprites = new LinkedList<Sprite>();
		objects = new LinkedList<StaticObject>();
		sprites.clear();
		objects.clear();
		objects.add(new Background());
		objects.add(new Floor(0,337, 1234, 34, "floor.PNG"));
		sprites.add(new WalkingGumba(100, 420, 18, 20, "Gumba1.PNG", "Gumba2.PNG"));
		objects.add(new Floor(1235, 308, 925, 63, "Floor2.PNG"));
		objects.add(new Floor(2290, 336, 703, 34, "Floor3.PNG"));
		objects.add(new Floor(3057, 336, 160, 35, "Floor4.PNG" ));
		objects.add(new Floor(3311, 336, 1153, 34, "Floor5.PNG"));
		objects.add(new Floor(4495, 336, 787, 36, "Floor6.PNG"));
		objects.add(new Hill(470, 245, 97, 93, "Hill1.PNG"));
		objects.add(new Hill(532, 185, 97, 153, "Hill2.PNG"));
		objects.add(new Hill(788, 245, 161, 92, "Hill3.PNG"));
		objects.add(new Hill(917, 183, 129, 156, "Hill4.PNG"));
		objects.add(new Hill(1012, 276, 192, 62, "Hill5.PNG"));
		objects.add(new Hill(1012, 122, 129, 217, "Hill6.PNG"));
		objects.add(new Hill(2513, 275, 223, 62, "Hill7.PNG"));
		objects.add(new Hill(2579, 215, 221, 122, "Hill8.PNG"));
		objects.add(new Hill(2643, 154, 225, 280, "Hill9.PNG"));
		objects.add(new Hill(4270, 245, 97, 93, "Hill10.PNG"));
		objects.add(new Hill(4334, 61, 98, 279, "Hill11.PNG"));
		objects.add(new Tube(693, 247, false, 63, 92, "tube_up.PNG"));
		objects.add(new Tube(3568,275,false, 65, 64, "Tube_up2.PNG"));
		objects.add(new Tube(3698,245,false, 63, 95, "Tube_up3.PNG"));
		objects.add(new Tube(4495,245,false, 64, 93, "Tube_up4.PNG"));
		objects.add(new Tube(4495,0,false, 65, 156, "Tube_Down.PNG"));
		objects.add(new Tube(4625,275,false, 65, 156, "Tube_up5.PNG"));
		objects.add(new Unmovable(3120, 308, 32, 28, "stripedBlock.PNG"));
		objects.add(new Unmovable(3152, 308, 32, 28, "stripedBlock.PNG"));
		objects.add(new Unmovable(3184, 308, 32, 28, "stripedBlock.PNG"));
		objects.add(new Unmovable(3152, 278, 32, 28, "stripedBlock.PNG"));
		objects.add(new Unmovable(3184, 278, 32, 28, "stripedBlock.PNG"));
		objects.add(new Unmovable(3184, 247, 32, 28, "stripedBlock.PNG"));
		objects.add(new Unmovable(3312, 308, 32, 28, "stripedBlock.PNG"));
		objects.add(new Unmovable(3344, 308, 32, 28, "stripedBlock.PNG"));
		objects.add(new Unmovable(3376, 308, 32, 28, "stripedBlock.PNG"));
		objects.add(new Unmovable(3312, 278, 32, 28, "stripedBlock.PNG"));
		objects.add(new Unmovable(3312, 247, 32, 28, "stripedBlock.PNG"));
		objects.add(new Unmovable(3344, 278, 32, 28, "stripedBlock.PNG"));
		mario.horizontalPosition = 33;
		mario.verticalPosition = 268;
		mario.height = 32;
		mario.width = 26;
		mario.maxVP = 420;
		mario.minVP = 0;
		mario.maxHP = 1000000;
		mario.minHP = 0;
	}
	public void gameOver(Graphics g) throws IOException{
		Image gameOver = ImageIO.read(new File("GameOver.PNG"));
		g.drawImage(gameOver, 0, 0, null);
	}
	public void pause(Graphics g) throws IOException{
		Image pause = ImageIO.read(new File("Pause.png"));
		g.drawImage(pause, 200, 200, null);
	}
}

