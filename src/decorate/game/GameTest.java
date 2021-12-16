package decorate.game;

public class GameTest {
	public static void main(String[] args) {
		Game game = new DuaXe("gg", "Ban sung");
		game = new TayCam(game);
		
		
		System.out.println("game1: " + game);
		
		game = new VoLang(game);
		System.out.println("game2: " + game);
//		game = new VoLang(game);
//		System.out.println("game3: " + game);
		
		
		
	}
}
