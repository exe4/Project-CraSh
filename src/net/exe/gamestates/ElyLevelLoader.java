package net.exe.gamestates;

import java.awt.Graphics2D;

import net.exe.gamestate.GameState;
import net.exe.gamestate.GameStateManger;

public class ElyLevelLoader extends GameState{

	public ElyLevelLoader(GameStateManger gsm) {
		super(gsm);
	}

	@Override
	public void tick(double deltaTime) {
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawString("Hello Graphics", 200, 200);
	}

	@Override
	public void init() {
		
	}

}
