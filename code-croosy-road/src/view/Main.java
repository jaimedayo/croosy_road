package view;

import controller.Controller;
import model.Car;

import processing.core.PApplet;

public class Main extends PApplet {

	int pag = 0;
	Controller control;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	public void settings() {
		size(800, 800);
	}
	public void setup() {
		control =new Controller(this);
		control.startgames();
	}

	public void draw() {
		switch (pag) {

		case 0: // pantalla de juego
			background(0);
			// dibujar fondo

			// contador de tiempo

			// hora a la que gana el personaje

			// dibujar carros
			for (int i = 0; i < control.getCarList().size(); i++) {
				control.getCarList().get(i).draw();
			
			}
			control.moveEnemies();
			// dibujar protagonista
control.getProta().draw();;
			// sensor de contacto

			break;
		case 1:// pantalla de ganaste operdiste

			break;

		case 2:// pantalla de resultados

			break;

		}

	}

	public void keyPressed() {
		switch (key) {
		case UP:
			
			control.moveProta(0);

			break;
		case DOWN:
			control.moveProta(1);

			break;
		case LEFT:

			control.moveProta(2);

			break;
		case RIGHT:

			control.moveProta(3);

			break;
		}
	}
}
