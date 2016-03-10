package net.exe.gameloop;

import net.exe.game_engine.EXEGameLoop;
import net.exe.gamestate.GameStateManager;

public class GameLoop extends EXEGameLoop {
	
	GameStateManager gsm;
	
	public GameLoop(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void init() {
		gsm = new GameStateManager();
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
