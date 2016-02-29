package net.exe.GameOS;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	
	
	/*
	 * @author .exe
	 * 
	 * This is the SpriteSheet Class
	 * this allows us to use sprite sheets to get sprites
	 * 
	 */
	
	private BufferedImage spriteSheet;
	
	public SpriteSheet() {
		
	}
	
	
	public void setSpriteSheet(BufferedImage spriteSheet) {
		this.spriteSheet = spriteSheet;
	}
	
	public BufferedImage getTile(int xImage, int yImage, int width, int height){
		return spriteSheet.getSubimage(xImage, yImage, width, height);
	}
}
