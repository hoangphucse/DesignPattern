package decorate.game;

public class HanhDong extends Game {
	private String kieuHanhDong;

	
	public HanhDong(String ten,String kieuHanhDong) {
		tenGame = ten;
		theLoai = "Hành động";
		this.kieuHanhDong = kieuHanhDong;
	}


	@Override
	public String toString() {
		return "HanhDong [kieuHanhDong=" + kieuHanhDong + ", tenGame=" + tenGame + ", theLoai=" + theLoai + ", phuKien="
				+ phuKien + "]";
	}
	
	
	
	
	
}
