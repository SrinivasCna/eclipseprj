package oops.coupling.looseCoupling;

import oops.coupling.looseCoupling.game.GameRunner;
import oops.coupling.looseCoupling.game.PacmanGame;

public class LooseCouplingExample {
	public static void main(String[] args) {

		// var game=new MarioGame();
		// var game=new ContraGame();
		var game = new PacmanGame();

		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}
