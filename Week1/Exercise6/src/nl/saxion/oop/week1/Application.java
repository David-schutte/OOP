package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application());
	}

	public void run() {

		// TODO: Your implementation here

		// We used the following code to produce the sample_output.png file
		BingoMill bm = new BingoMill();

		SaxionApp.printLine("Drawing 10 random numbers using the Bingo Mill!");

		for (int i = 1; i < 11; i++) {
			int max = 75-i;
			int min = 1;
			int range = max - min + 1;
			int ball = (int) (Math.random()*range) + min;
			SaxionApp.printLine("Draw " + i + ": " + bm.draw(ball) + " (" + bm.getNumberOfBallsRemaining() + " balls remaining)");
		}

	}
}
