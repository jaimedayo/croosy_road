package model;

import processing.core.PApplet;

public class Protagonist extends Character  {

	public Protagonist(int direction, int posX, int posY, PApplet app) {
		super(direction, posX, posY, app);
		// TODO Auto-generated constructor stub
	}

	public void move(int dir) {
		switch (dir) {
		case 0:

			posY = posY + 50;
			break;

		case 1:
			if (posY >= 50) {
				posY = posY - 50;
			}
			break;
		case 2:

			if (posX <= 550) {
				posX = posX + 50;
			}
			break;
		case 3:

			if (posX >= 50) {
				posX = posX - 50;
			}
			break;
		}
	}


}