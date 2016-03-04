package net.exe.gameengine;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	boolean fse = false; // full screen enabled 
	int fsm = 0; // full screen mode
	
	GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
	
	
	public GameWindow(String title, int width, int height) {
		super(title);
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	
	private void setFullscreen(){
		switch(fsm){
		case 0:
			System.out.println("No fullScreen...");
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
	
	public void setFullscreen(int fsnm){
		fse = true;
		if(fsm <= 2){
			this.fsm = fsnm;
			setFullscreen();
		}else{
			System.err.println("Error... fullscreen incompatible... .exe is sad :(");
		}
			
	}
	
}
