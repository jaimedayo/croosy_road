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
		this.app=app;
				
	}
public void startgames() {
		logic.startGame();
		
	}
	public ArrayList<Car> getCarList() {
		
		return logic.getCarList();
	}

	public void moveProta(int i) {
		logic.moveProta(i);
		
	}

	

	public void moveEnemies() {
		logic.moveEney();
		
	}

	public Protagonist getProta() {
		return logic.getProta();
	}




}
