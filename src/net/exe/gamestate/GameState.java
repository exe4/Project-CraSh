package net.exe.gamestate;

import java.awt.Graphics2D;

public abstract class GameState {
	
	public GameStateManger gsm;
	
	
	public GameState(GameStateManger gsm) {
		this.gsm = gsm;
	}
	
	public abstract void tick(double deltaTime);
	public abstract void render(Graphics2D g);
	public abstract void init();

}
