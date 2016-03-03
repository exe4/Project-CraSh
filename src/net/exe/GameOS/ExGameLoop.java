package net.exe.GameOS;

public class ExGameLoop implements Runnable{
	
	private Thread thread;
	private boolean running;
	
	// frames per second, ticks per second, width, and height
	private int fps, tps, width, height; 
	
	public static double currentFps = 60D;
	
	public ExGameLoop() {
		
	}
	
	@Override
	public void run(){
		
	}
}
