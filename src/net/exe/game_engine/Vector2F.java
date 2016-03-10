package net.exe.game_engine;

public class Vector2F {
	
	public float xpos, ypos;
	
	public static float worldXPos, worldYPos;
	
	public Vector2F() {
		this.xpos = 0.0f;
		this.ypos = 0.0f;
	}
	
	public Vector2F(float xpos, float ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
	}
	
	public static Vector2F zero(){
		return new Vector2F(0,0);
	}
	
	public void normalize(){
		double length = Math.sqrt(xpos * xpos + ypos * ypos);
		
		if(length != 0.0d){
			float s = 1.0f / (float) length;
			xpos *= s;
			ypos *= s;
		}
	}
	
	public boolean equals(Vector2F vec){
		return (this.xpos == vec.xpos && this.ypos == vec.ypos);
	}
	
	public Vector2F copy(Vector2F vec){
		this.xpos = vec.xpos;
		this.ypos = vec.ypos;
		
		return new Vector2F(xpos, ypos);
	}
	
	public Vector2F add(Vector2F vec){
		this.xpos += vec.xpos;
		this.ypos += vec.ypos;
		
		return new Vector2F(xpos, ypos);
	}
	
	public static void setWorldVariables(float wx, float wy){
		worldXPos = wx;
		worldYPos = wy;
	}
	
	public static double getDistanceOnScreen(Vector2F vec1, Vector2F vec2){
		float v1 = vec1.xpos - vec2.xpos;
		float v2 = vec1.ypos - vec2.ypos;
		
		return Math.sqrt(v1*v1 + v2*v2);
	}
	
	
}
