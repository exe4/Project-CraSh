package net.exe.gamestate;

import java.awt.Graphics2D;
import java.util.Stack;

import net.exe.gamestates.VillageLevelLoader;

public class GameStateManager {
	
	public static Stack<GameState> states;
	
	public GameStateManager() {
		states = new Stack<GameState>();
		states.push(new VillageLevelLoader(this));
	}
	
	public void tick(double deltaTime){
		states.peek().tick(deltaTime);
	}
	
	public void render(Graphics2D g){
		states.peek().render(g);
	}

	public void init() {
		states.peek().init();
	}
}
