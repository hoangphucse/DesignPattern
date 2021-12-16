package decorate.game;

public class DuaXe extends Game {
	private String loaiHinh;
	
	public DuaXe(String ten,String loaiHinh) {
		tenGame = ten;
		theLoai = "Đua xe";
		this.loaiHinh = loaiHinh;
	}

	@Override
	public String toString() {
		return "DuaXe [loaiHinh=" + loaiHinh + ", tenGame=" + tenGame + ", theLoai=" + theLoai + ", phuKien=" + phuKien
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
