package net.exe.gameState;

import java.awt.Graphics2D;

public abstract class GameState {
	
	GameStateManger gsm;
	
	
	public GameState(GameStateManger gsm) {
		this.gsm = gsm;
	}
	
	public abstract void tick(double deltaTime);
	public abstract void render(Graphics2D g);

}
