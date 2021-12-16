package decorate.game;

public abstract class GameDecorator extends Game {
	protected Game game;
	
	public GameDecorator(Game game) {
		this.game = game;
	}
	
	public abstract String themPhuKien();
	
}
