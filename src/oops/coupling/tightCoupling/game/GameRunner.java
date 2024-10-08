package oops.coupling.tightCoupling.game;

public class GameRunner {

	private PacmanGame game;

	public GameRunner(PacmanGame game) {
		this.game = game;
	}
	
//	private MarioGame game;
//
//	public GameRunner(MarioGame game) {
//		this.game = game;
//	}

//	private ContraGame game;
//	
//	public GameRunner(ContraGame game) {
//		this.game=game;
//	}

	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
