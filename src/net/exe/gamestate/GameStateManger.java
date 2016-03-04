package net.exe.gamestate;

import java.awt.Graphics2D;
import java.util.Stack;

import net.exe.gamestates.ElyLevelLoader;

public class GameStateManger {
	
	public static Stack<GameState> states;
	
	public GameStateManger() {
		states = new Stack<GameState>();
		states.push(new ElyLevelLoader(this));
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
