package net.exe.GameOS;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ExGameLoop extends JPanel implements Runnable{
	
	private Thread thread;
	private boolean running;
	
	// frames per second, ticks per second, width, and height
	private int fps, tps, width, height; 
	
	public static double currentFps = 120D;
	
	public Graphics2D graphics2D;
	private BufferedImage img;
	
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
	
	public void init() {
		img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		graphics2D = (Graphics2D) img.getGraphics();
		running = true;
	}
	
	public void tick(double deltaTime) {
		
		
	}
	
	public void render() {
		graphics2D.clearRect(0, 0, width, height);
	}
	
	public void clear(){
		Graphics g2 = getGraphics();
		
		if(img != null){
			g2.drawImage(img, 0, 0, null);
		}
		g2.dispose();
	}
	
}
