package net.exe.game_engine;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoadFrom {
	
	public static BufferedImage ImageLoadFrom( String path) {
		
		BufferedImage img = null;
		
		try {
			img = ImageIO.read(new File("res/" + path + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return img;
	}
	
}
