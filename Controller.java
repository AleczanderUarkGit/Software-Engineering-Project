import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.awt.event.MouseListener;
import Class.Sprite.BigMario;
import java.util.ArrayList;

import javax.imageio.ImageIO;

class Controller implements KeyListener{
	Model model;
	static final int LEFT = 37;
	static final int UP = 38;
	static final int RIGHT = 39;
	static final int DOWN = 40;
	static final int PAUSE = 80;
	private static ArrayList<Integer> keys = new ArrayList<Integer>(); 
	
	Controller(Model m) {
		model = m;
	}
	
	public void keyTyped(KeyEvent e) {
		System.out.println("key Typed");
	}
	
	public void keyPressed(KeyEvent e) {
		//System.out.println(e.getKeyCode());
		
		//Keep track of keys pressed (if already in the list, don't add again)
		if(!keys.contains(e.getKeyCode()))
                   keys.add(e.getKeyCode());
                
		if(keys.size() > 1){
			if(!model.pause){
			   //System.out.println("In the multiple key portion");
			   if(keys.contains(RIGHT)){
			      model.moveRight();
			   	  model.mario.jump();
			   }
	           else if(keys.contains(LEFT)){
	        	   model.moveLeft();
	        	   model.mario.jump();
	           }
			}
		}
		else{
		   
			if(!model.pause){
			   //System.out.println("In the single key portion");
			   //right arrow key
			   if(e.getKeyCode()==RIGHT){
	                      //System.out.println("moving right");
	                      model.moveRight();
			   }
			   //left arrow key
			   else if (e.getKeyCode()==LEFT)
		           {
	                      //System.out.println("moving left");
		              model.moveLeft();
		           }
			   //Up arrow
			   else if (e.getKeyCode() == UP){
	                      model.mario.jump();
			   }
			   //down arrow
			   else if (e.getKeyCode() == DOWN){
	                if(model.mario instanceof BigMario){
						System.out.println("crouch");
						BigMario mario = (BigMario)model.mario;
						mario.crouch();
	                }
			   }
			}
		   
			if (e.getKeyCode() == PAUSE){
			   System.out.println("Pressed p");
			   if(model.pause == false){
				   model.pause = true;
				   System.out.println("pause = " + model.pause);
			   }
			   else{
				   model.pause = false;
				   System.out.println("pause = " + model.pause);
			   }
		   }
       }
           e.consume();
	}
	
	public void keyReleased(KeyEvent e) {
		//System.out.println("keyReleased");
		//remove key from list that was released 
		keys.remove(keys.indexOf(e.getKeyCode()));
		
		//If the list is not empty, find the key that remains
		//return value of the index (this case 0) if found, -1 if not
		//FIXME---------------------------------------------------------------
		if(!keys.isEmpty())
		{
			if(!model.pause){
			   int num = keys.indexOf(RIGHT);
			   int num2 = keys.indexOf(LEFT);
			   if(num == 0 && num2 != 0)
			   {
	                      model.moveRight();
	           }
	           else if(num2 == 0 && num != 0)
	                      model.moveLeft();
			}
                   
		}
		//--------------------------------------------------------------------
	}


}
