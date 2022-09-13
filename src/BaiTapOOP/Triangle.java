package BaiTapOOP;

public class Triangle extends GeoMetry {
	private Point dinh_A;
	private Point dinh_B;
	private Point dinh_C;

	// Constructor Hàm khởi tạo
	public Triangle(Point dinh_A, Point dinh_B, Point dinh_C) {
		super();
		this.dinh_A = dinh_A;
		this.dinh_B = dinh_B;
		this.dinh_C = dinh_C;
	}

	// Getter and Setter
	public Point getDinh_A() {
		return dinh_A;
	}

	public void setDinh_A(Point dinh_A) {
		this.dinh_A = dinh_A;
	}

	public Point getDinh_B() {
		return dinh_B;
	}

	public void setDinh_B(Point dinh_B) {
		this.dinh_B = dinh_B;
	}

	public Point getDinh_C() {
		return dinh_C;
	}

	public void setDinh_C(Point dinh_C) {
		this.dinh_C = dinh_C;
	}

	// Method
	public Float chieuDaiAB() {
		LineSegment chieuDai = new LineSegment(this.dinh_A, this.dinh_B);
		Float chieuDaiAB = chieuDai.length();
		return chieuDaiAB;
	}

	public Float chieuDaiAC() {
		LineSegment chieuDai = new LineSegment(this.dinh_A, this.dinh_C);
		Float chieuDaiAC = chieuDai.length();
		return chieuDaiAC;
	}

	public Float chieuDaiBC() {
		LineSegment chieuDai = new LineSegment(this.dinh_B, this.dinh_C);
		Float chieuDaiBC = chieuDai.length();
		return chieuDaiBC;
	}

	@Override
	Point input() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String output() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Float areaCalculate() {
		// TODO Auto-generated method stub
		Float a = this.chieuDaiAB();
		Float b = this.chieuDaiAC();
		Float c = this.chieuDaiBC();
		Float s = (a + b + c) / 2;
		Float dientich_Area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return dientich_Area;
	}

	@Override
	Boolean isValid() {
		// TODO Auto-generated method stub
		Float a = this.chieuDaiAB();
		Float b = this.chieuDaiAC();
		Float c = this.chieuDaiBC();
		Boolean Value;
		if (a + b <= c || a + c <= b || b + c <= a) {
			Value = false;
		} else {
			Value = true;
		}
		return Value;
	}

	@Override
	Float perimeterCalculate() {
		// TODO Auto-generated method stub
		Float a = this.chieuDaiAB();
		Float b = this.chieuDaiAC();
		Float c = this.chieuDaiBC();
		Float chuvi_P = a + b + c;
		return chuvi_P;

	}

}
