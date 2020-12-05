package controller;

import java.util.ArrayList;

import model.Car;
import model.Logic;
import model.Protagonist;
import processing.core.PApplet;

public class Controller {
	Logic logic;
	PApplet app;

	public Controller(PApplet app) {
		this.app = app;
		logic = new Logic(app);
	}

	public void startgames() {

	}

	public ArrayList<Car> getCarList() {

		return logic.getCarList();
	}

	public Protagonist getProta() {
		return logic.getProta();
	}

	public void moveProta(int i) {
		logic.moveProta(i);

	}

	public void moveEnemies() {
		logic.moveEney();

	}

}
