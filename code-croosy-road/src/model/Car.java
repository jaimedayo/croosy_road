package model;

import processing.core.PApplet;

public class Car extends Character {
	

	public Car(int direction, int posX, int posY, PApplet app) {
		super(direction, posX, posY, app);
		// TODO Auto-generated constructor stub
	}
	public void move() {
		
		posX= posX + direction;
	}
	public void draw() {
		app.fill(255,0,0);
		app.rectMode(app.CENTER);
		app.rect(posY, posY, 100, 50);
	}

}