package net.exe.gameloop;

import java.awt.Component;

import net.exe.GameOS.ExGameLoop;
import net.exe.gamestate.GameStateManger;

public class GameLoop extends ExGameLoop {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GameStateManger gsm;
	
	
	public GameLoop(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void init() {
		gsm = new GameStateManger();
		gsm.init();
		super.init();
	}
	
	@Override
	public void tick(double deltaTime) {
		gsm.tick(deltaTime);
	}
	
	@Override
	public void render() {
		super.render();
		gsm.render(graphics2D);
		clear();
	}
	
	@Override
	public void clear() {
		super.clear();
	}

}
