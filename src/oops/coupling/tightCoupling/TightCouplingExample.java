package oops.coupling.tightCoupling;

import oops.coupling.tightCoupling.game.GameRunner;
import oops.coupling.tightCoupling.game.PacmanGame;

public class TightCouplingExample {

	public static void main(String[] args) {
//		var contraGame = new ContraGame();
//		var gameRunner = new GameRunner(contraGame);

//		var marioGame = new MarioGame();
//		var gameRunner = new GameRunner(marioGame);

		var pacmanGame = new PacmanGame();
		var gameRunner = new GameRunner(pacmanGame);
		gameRunner.run();
	}
}
