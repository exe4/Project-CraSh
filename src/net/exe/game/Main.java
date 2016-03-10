package net.exe.game;

import net.exe.game_engine.GameWindow;
import net.exe.game_engine.SpriteSheet;
import net.exe.gameloop.GameLoop;

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
		frame.add(new GameLoop(1280, 720));
		frame.setVisible(true);
	}

}
