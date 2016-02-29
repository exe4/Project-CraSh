package net.exe.GameOS;

public class Vector2F {
	
	/*
	 * @author .exe
	 * 
	 * This is a Floating point Vector Class,
	 * this helps with vector math and movement...
	 * this includes normalize, zero, equals, copy and add methods
	 * 
	 */
	
	public float xpos, ypos;
	
	public static float worldXPos, worldYPos;
	
	public Vector2F(float xpos, float ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
	}

	public Vector2F() {
		this.xpos = 0.0f;
		this.ypos = 0.0f;
	}
	
	public Vector2F zero(){
		return new Vector2F(0,0);
	}
	
	public void normalize(){
		double length = Math.sqrt(xpos * xpos + ypos * ypos);
		
		if(length != 0.0f){
			float f = 1.0f / (float) length;
			xpos *= f;
			ypos *= f;
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
		xpos += vec.xpos;
		ypos += vec.ypos;
		
		return new Vector2F(xpos, ypos);
	}
	
	public static void setWorldVariables(int x, int y){
		worldXPos = x;
		worldYPos = y;
	}
	
	public static double getDistanceOnScreen(Vector2F vec1, Vector2F vec2){
		return Math.sqrt((vec1.xpos - vec2.xpos) * (vec1.xpos - vec2.xpos) + (vec1.ypos - vec2.ypos) * (vec1.ypos - vec2.ypos));
	}
	
	
}
