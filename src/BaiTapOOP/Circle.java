package BaiTapOOP;

public class Circle extends GeoMetry {
	private Point tam_O;
	private Float bankinh_r;

	// Constructor Hàm khởi tạo
	public Circle(Point tam_O, Float bankinh_r) {
		super();
		this.tam_O = tam_O;
		this.bankinh_r = bankinh_r;
	}

	// Getter and Setter
	public Point getTam_O() {
		return tam_O;
	}

	public void setTam_O(Point tam_O) {
		this.tam_O = tam_O;
	}

	public Float getBankinh_r() {
		return bankinh_r;
	}

	public boolean setBankinh_r(Float bankinh_r) {
		this.bankinh_r = bankinh_r;
		if (bankinh_r > 0) {
			return true;
		} else {
			return false;
		}
	}

	// Method Phương thức

	@Override
	Float areaCalculate() {
		// TODO Auto-generated method stub
		return (float) (bankinh_r * bankinh_r * 3.14);

	}

	@Override
	Boolean isValid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Float perimeterCalculate() {
		// TODO Auto-generated method stub
		return (float) (bankinh_r * 2 * 3.14);

	}

	public String checkRelativePosition(Point m) {
		Float khoangCachOM = (float) ((m.getX() - tam_O.getX()) * (m.getX() - tam_O.getX())
				+ (m.getY() - tam_O.getY()) * (m.getY() - tam_O.getY()));
		String viTri;
		if (khoangCachOM < bankinh_r * bankinh_r) {
			viTri = "nằm bên trong đường tròn.";
		} else if (khoangCachOM == bankinh_r * bankinh_r) {
			viTri = "nằm trên đường tròn.";
		} else {
			viTri = "nằm ngoài đường tròn.";
		}
		return viTri;
	}

}
