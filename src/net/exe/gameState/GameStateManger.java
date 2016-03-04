package net.exe.gameState;

import java.awt.Graphics2D;
import java.util.Stack;

public class GameStateManger {
	
	public static Stack<GameState> states;
	
	public GameStateManger() {
		states = new Stack<GameState>();
	}
	
	public void tick(double deltaTime){
		states.peek().tick(deltaTime);
	}
	
	public void render(Graphics2D g){
		states.peek().render(g);
	}

}
