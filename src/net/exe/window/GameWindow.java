package net.exe.window;

import javax.swing.JFrame;

public class GameWindow extends JFrame{

	/**
	 * @author .exe
	 * 
	 * This Class is the JFrame for the Game
	 * 
	 * This JFrame Class is fully set up for the game
	 */
	private static final long serialVersionUID = 1L;

	public GameWindow(String title, int width, int height) {
		super(title);
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
