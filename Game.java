import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.EventListener;

import javax.swing.Timer;

public class Game extends JFrame implements ActionListener {
	Model model;
	
	public Game() throws Exception {
		this.model = new Model();
		Controller controller = new Controller(this.model);
		View view = new View(this.model);
		view.addKeyListener(controller);
		this.setTitle("Super Mario World");
		this.setSize(700, 410);
		this.addKeyListener(controller);
		this.getContentPane().add(view);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		new Timer(25, this).start(); // Indirectly calls actionPerformed at regular intervals
	}

	public void actionPerformed(ActionEvent evt) {	
		model.update();
		repaint(); // Indirectly calls View.paintComponent
	}

	public static void main(String[] args) throws Exception {
		new Game();
	}
}
