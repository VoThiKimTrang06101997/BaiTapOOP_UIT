package BaiTapOOP;

public class Point extends GeoMetry {
	private double x;
	private double y;
	public static Point origin = new Point(); // Khai báo biến static origin biểu diễn gốc tọa độ (0,0).

	// Constructor Hàm khởi tạo
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y) { // Khởi tạo Point có tọa độ xy
		this.x = x;
		this.y = y;
	}

	public Point() { // Khởi tạo Point có tọa độ số (0;0)
		this.x = 0;
		this.y = 0;
	}

	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	// Getter and Setter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
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

	@Override
	public boolean equals(Object obj) {
		// Nếu đúng thì kiểm tra tiếp, sai thì trả về false
		if (obj instanceof Point) {
			// ép kiểu về Point, không xảy ra ngoại lệ vì đã kiểm tra và chắc chắn nó là
			// kiểu Point.
			Point p = (Point) obj;
			// Nếu tọa độ bằng nhau.
			if (this.x == p.x && this.y == p.y) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "(+" + this.x + "," + this.y + ")";
	}

	// boolean isOrigin(): kiểm tra xem điểm có phải là gốc tọa độ (0, 0).
	public boolean isOrigin() {
		Point a = new Point(this.x, this.y);
		if (a == origin) {
			return true;
		} else {
			return false;
		}
	}

	// void move(int x, int y): di chuyển điểm đến tọa độ mới (x, y).
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// static double distance(int x1, int y1, int x2, int y2): tính khoảng cách giữa
	// điểm (x1, y1) và điểm (x2, y2).
	public void translate(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}

	// static double distance(int x1, int y1, int x2, int y2): tính khoảng cách giữa
	// điểm (x1, y1) và điểm (x2, y2).
	public static double distance(int x1, int y1, int x2, int y2) {
		double kc;
		kc = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return kc;
	}

	// static double distance(Point p1, Point p2): tính khoảng cách giữa điểm p1và
	// p2.
	public static double distance(Point p1, Point p2) {
		double kc;
		kc = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
		return kc;
	}

	// double distance(int x, int y): tính khoảng cách từ điểm đến điểm (x, y).
	public double distance(int x, int y) {
		double kc;
		kc = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
		return kc;
	}

	// double distance(Point p): tính khoảng cách từ điểm đến điểm p.
	public double distance(Point p) {
		double kc;
		kc = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
		return kc;
	}

	// double distance(double a, double b, double c): tính khoảng cách từ điểm đến
	// đường thẳng có phương trình tổng quát ax + by + c = 0
	public double distance(double a, double b, double c) {
		double kc;
		double _x1;
		_x1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		double _x2;
		_x2 = Math.abs(a * this.x + b * this.y + c);
		kc = _x2 / _x1;
		return kc;

	}

}
