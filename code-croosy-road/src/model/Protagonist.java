package model;

import processing.core.PApplet;

public class Protagonist extends Character  {

	public Protagonist(int direction, int posX, int posY, PApplet app) {
		super(direction, posX, posY, app);
		// TODO Auto-generated constructor stub
	}
public void draw() {
	app.fill(0,0,255);
	app.ellipse(posX, posY, 50, 50);
}
	public void move(int dir) {
		switch (dir) {
		case 0:

			posY = posY + 50;
			break;

		case 1:
			
				posY = posY - 50;
			
			break;
		case 2:

			
				posX = posX + 50;
			
			break;
		case 3:

			
				posX = posX - 50;
			
			break;
		}
	}


}