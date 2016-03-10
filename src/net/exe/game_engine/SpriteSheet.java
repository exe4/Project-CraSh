package net.exe.game_engine;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	
	private BufferedImage spriteSheet;
	
	public SpriteSheet() {
		
	}
	
	public void setSpriteSheet(BufferedImage spriteSheet) {
		this.spriteSheet = spriteSheet;
	}
	
	public BufferedImage getTile(int xTile, int yTile, int width, int height){
		return spriteSheet.getSubimage(xTile, yTile, width, height);
	}
}
