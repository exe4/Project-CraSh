package net.exe.game_engine;

import java.awt.Dimension;

import javax.swing.JPanel;

public class EXEGameLoop extends JPanel implements Runnable{

	private static final long serialVersionUID = 1L;
	
	private Thread thread;
	private boolean running;
	
	private int fps, tps, width, height;
	
	public static double currentFps = 120D;
	
	@Override
	public void addNotify() {
		super.addNotify();
		
		if(thread == null){
			thread = new Thread(this);
			thread.start();
		}
	}
	
	public EXEGameLoop(int width, int height) {
		this.width = width;
		this.height = height;
		setPreferredSize(new Dimension(width, height));
		setFocusable(false);
		requestFocus();
	}


	@Override
	public void run() {
		
		init();
		
		long lastTime = System.nanoTime();
		double nsPerTick = 1000000000D / currentFps;
		int frames = 0;
		int ticks = 0;
		long lastTimer = System.currentTimeMillis();
		double deltaTime = 0D;
		
		while(running){
			long now = System.nanoTime();
			deltaTime += (now - lastTime) / nsPerTick;
			lastTime = now;
			boolean shouldRender = false;
			
			while(deltaTime >= 1){
				ticks++;
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
				// TODO Auto-generated catch block
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
