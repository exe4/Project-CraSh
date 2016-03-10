package net.exe.gamestates;

import java.awt.Graphics2D;

import net.exe.gamestate.GameState;
import net.exe.gamestate.GameStateManager;

public class VillageLevelLoader extends GameState{

	public VillageLevelLoader(GameStateManager gsm) {
		super(gsm);
	}

	@Override
	public void tick(double deltaTime) {
		
	}

	@Override
	public void render(Graphics2D g) {
		g.drawString("hello Pynon", 200, 200);
	}

	@Override
	public void init() {
		
	}
	
}
