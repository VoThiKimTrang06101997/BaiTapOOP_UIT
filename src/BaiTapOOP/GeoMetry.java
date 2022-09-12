package BaiTapOOP;

import java.util.Scanner;

public abstract class GeoMetry {
	static Point input(Point A) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào hoành độ : ");
		Float X = scanner.nextFloat();
		System.out.println("Nhập vào tung độ: ");
		Float Y = scanner.nextFloat();
		return A = new Point(X, Y);
	};
		
		static void output(Point a) {
			System.out.print("(" + a.getX() + "," + a.getY() + ")");
		};
		
		abstract Float areaCalculate(); 
		abstract Boolean isValid(); 
		abstract Float perimeterCalculate();
		
		Point input() {
			// TODO Auto-generated method stub
			return null;
		}

		String output() {
			// TODO Auto-generated method stub
			return null;
		}
}
