package net.exe.game;

import net.exe.gameengine.GameWindow;
import net.exe.gameengine.SpriteSheet;

public class Main {
	
	/*
	 * @author .exe
	 * @version 0.2
	 * the "main" class, with the main function
	 */
	
	SpriteSheet blocks = new SpriteSheet();
	
	public static void main(String args[]) {
		GameWindow frame = new GameWindow("Project-CraSH", 1280, 720);
		frame.setFullscreen(1);
		frame.setVisible(true);
	}

}
