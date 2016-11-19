import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.Graphics;
import java.io.File;
import java.util.LinkedList;
import java.util.ListIterator;
import Class.Sprite.Sprite;
import Class.FixedObjects.Background;
import Class.FixedObjects.StaticObject;
import Class.Sprite.Mario;

class View extends JPanel {
	Model model;

	Image background;

	View(Model m) throws IOException {
		model = m;
	
		//background = ImageIO.read(new File("sky1.jpg"));
	}

	public void paintComponent(Graphics g) {
		//g.drawImage(this.background, 0, 0, null);
		Mario mario = model.mario;
		if(mario.getLives() == 0){
			try {
				model.gameOver(g);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			LinkedList<StaticObject> objects = model.objects;
			ListIterator<StaticObject> iterator = objects.listIterator();
			while(iterator.hasNext()){
				StaticObject obj = iterator.next();
				obj.draw(g);
			}
			LinkedList<Sprite> sprites = model.sprites;
			ListIterator<Sprite> iter = sprites.listIterator();
			mario.draw(g);
			while(iter.hasNext()) {
					Sprite sprite = iter.next();
					sprite.draw(g);
			}
			if(model.pause){
				try {
					model.pause(g);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

