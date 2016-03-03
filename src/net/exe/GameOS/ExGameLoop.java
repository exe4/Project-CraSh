package net.exe.GameOS;

import java.awt.Dimension;

import javax.swing.JPanel;

public class ExGameLoop extends JPanel implements Runnable{
	
	private Thread thread;
	private boolean running;
	
	// frames per second, ticks per second, width, and height
	private int fps, tps, width, height; 
	
	public static double currentFps = 120D;
	
	public ExGameLoop(int width, int height) {
		this.width = width;
		this.height = height;
		
		setPreferredSize( new Dimension(width, height) );
		setFocusable(false);
		requestFocus();
	}
	
	@Override
	public void addNotify() {
		super.addNotify();
		
		if(thread == null ){
			thread = new Thread(this);
			thread.start();
		}
	}
	
	@Override
	public void run(){
		
		
		init();
		
		long lastTime = System.nanoTime();
		double nsecondsPerTick = 1000000000D;
		int frames = 0;
		int ticks = 0;
		long lastTimer = System.currentTimeMillis();
		double deltaTime = 0;
		
		while(running){
			long now = System.nanoTime();
			deltaTime = (now - lastTime) / nsecondsPerTick;
			lastTime = now;
			
			boolean shouldRender = false;
			
			while(deltaTime >= 1){
				ticks++;
				/*Tick + DeltaTime*/
				tick(deltaTime);
				deltaTime --;
				
				shouldRender = true;
			}
			
			if(shouldRender){
				frames++;
				render();
			}
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(System.currentTimeMillis() - lastTimer >= 1000){
				lastTimer += 1000;
				tps = frames;
				fps = ticks;
				
				frames = 0;
				ticks = 0;
			}
			
		}
	}
	
	private void init() {
		running = true;
	}
	
	private void tick(double deltaTime) {
		
		
	}
	
	private void render() {
		
	}
	
}
