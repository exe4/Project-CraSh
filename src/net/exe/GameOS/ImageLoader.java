package net.exe.GameOS;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageLoader {

	/*
	 * @author .exe
	 * 
	 * This is the Image Loading system
	 * 
	 */
	
	
	public static BufferedImage loadImage(Class<?> classFile, String Path) {
		
		URL url = classFile.getResource(Path);
		BufferedImage img = null;
		
		try{
			img = ImageIO.read(url);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return img;
		
	}

}
