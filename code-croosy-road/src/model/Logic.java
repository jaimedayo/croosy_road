package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {
	private PApplet app;
	private String[] arrayStrings;
	private ArrayList<Car> carList;
	private Protagonist prota;

	public Logic(PApplet app) {
		this.app = app;
		carList = new ArrayList<Car>();
		arrayStrings = app.loadStrings("./data/instructions.txt");

		for (int i = 0; i < arrayStrings.length; i++) {
			String lineString = arrayStrings[i];
			String[] arrayWord = lineString.split(",");
			Car obj = null;
			prota = null;

			for (int j = 0; j < arrayWord.length; j++) {
				String figure = arrayWord[0];
				int direction = Integer.parseInt(arrayWord[1]);
				int posX = Integer.parseInt(arrayWord[2]);
				int posY = Integer.parseInt(arrayWord[3]);

				if (figure.equals("carro")) {
				obj =	new Car(direction, posX, posY, app);
					carList.add(obj);
				} else {
					prota = new Protagonist(direction, posX, posY, app);
				}

			}

		}

	}

	public void moveEney() {
		for (int i = 0; i < carList.size(); i++) {
			carList.get(i).move();
		}
	}

	public void moveProta(int i) {
		switch (i) {
		case 0:
			prota.move(0);
			break;
		case 1:
			prota.move(1);
			break;

		case 2:
			prota.move(2);
			break;

		case 3:
			prota.move(3);
			break;

		}
	}

	public ArrayList<Car> getCarList() {
		return carList;
	}

	public Protagonist getProta() {
		return prota;

	}

}
