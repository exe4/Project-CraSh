package net.exe.game;

import net.exe.GameOS.GameWindow;
import net.exe.GameOS.SpriteSheet;

public class Main {
	
	
	static SpriteSheet spriteSheet = new SpriteSheet();
	
	
	public static void main(String args[]){
		 GameWindow frame = new GameWindow("Project CraSH", 1280, 720);
		 frame.setFullScreen(1);
		 frame.setVisible(true);
	}
	
	
}
