package model;

import processing.core.PApplet;

public class Character {
	public int posX;
	public int posY;
	public int direction;
	protected PApplet app;

	public Character(int direction, int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.direction = direction;
		this.app = app;
	}

	
		
	
	public void draw() {
		
	}
	public int getPosX() {
		return posX;
	}public int getPosY() {
		return posY;
	}
	}