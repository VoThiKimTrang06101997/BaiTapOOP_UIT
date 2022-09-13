package BaiTapOOP;

public class LineSegment extends GeoMetry {
	private Point diem_A;
	private Point diem_B;

	// Constructor Hàm khởi tạo
	public LineSegment(Point diem_A, Point diem_B) {
		super();
		this.diem_A = diem_A;
		this.diem_B = diem_B;
	}

	// Geter and Setter
	public Point getDiem_A() {
		return diem_A;
	}

	public void setDiem_A(Point diem_A) {
		this.diem_A = diem_A;
	}

	public Point getDiem_B() {
		return diem_B;
	}

	public void setDiem_B(Point diem_B) {
		this.diem_B = diem_B;
	}

	public Float length() {
		Float xB = (float) diem_B.getX();
		Float yB = (float) diem_B.getY();
		Float xA = (float) diem_A.getX();
		Float yA = (float) diem_A.getY();
		Float length = (float) Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
		return length;
	}

	@Override
	String output() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Float areaCalculate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Boolean isValid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Float perimeterCalculate() {
		// TODO Auto-generated method stub
		return null;
	}

}
