package net.exe.game;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import net.exe.game_engine.GameWindow;
import net.exe.gameloop.GameLoop;

public class Main {
	
	/*
	 * @author .exe
	 * @version 0.2
	 * the "main" class, with the main function
	 */
	
	public static GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	
	public static int width = gd.getDisplayMode().getWidth();
	public static int height = gd.getDisplayMode().getHeight();
	
	public static void main(String args[]) {
		GameWindow frame = new GameWindow("Project-CraSH", width, height);
		frame.setFullscreen(1);
		frame.add(new GameLoop(width, height));
		frame.setVisible(true);
	}

}
