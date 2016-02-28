package net.exe.window;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class GameWindow extends JFrame{

	/**
	 * @author .exe
	 * 
	 * This Class is the JFrame for the Game
	 * 
	 * This JFrame Class is fully set up for the game
	 */
	
	boolean fullScreenEnabled = false;
	int fullScreeMode = 0;
	
	GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
	
	private static final long serialVersionUID = 1L;

	public GameWindow(String title, int width, int height) {
		super(title);
		setSize(width, height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	private void setfullScreen(){
		switch(fullScreeMode){
		case 0:
			System.out.println("No FullScreen...");
			setUndecorated(false);
			break;
		case 1:
			setUndecorated(true);
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case 2:
			setUndecorated(true);
			device.setFullScreenWindow(this);
			break;
		}
	}
	
	public void setFullScreen(int fullScreenNewMode){
		fullScreenEnabled = true;
		if(fullScreeMode <= 2){
			this.fullScreeMode = fullScreenNewMode;
			setfullScreen();
		}else{
			System.err.println("Error -> " + fullScreeMode + " is not supported... \nError Code 93");
		}
		
		
	}

}
