package decorate.game;

public abstract class Game {
	protected String tenGame;
	protected String theLoai;
	protected String phuKien = "";
	
	public String getTenGame() {
		return tenGame;
	}

	public void setTenGame(String tenGame) {
		this.tenGame = tenGame;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	public String getPhuKien() {
		return phuKien;
	}

	public void setPhuKien(String phuKien) {
		this.phuKien = phuKien;
	}

	@Override
	public String toString() {
		return "Game [tenGame=" + tenGame + ", theLoai=" + theLoai + ", phuKien=" + phuKien + "]";
	}

}
