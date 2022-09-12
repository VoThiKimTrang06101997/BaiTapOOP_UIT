package BaiTapOOP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Point a = new Point();
		Point b = new Point();
		Point c = new Point();

		Scanner scanner = new Scanner(System.in);
		int luachon;
		do {
			System.out.println("1: Nhập Vào Tọa Độ 3 Điểm");
			System.out.println("2: Tính Chiều dài theo 3 điểm dã nhập ở mục 1:");
			System.out.println("3: Kiểm tra 3 điểm có là tam giác không và tính chu vi, Diện tích tam giác đó:");
			System.out.println("4: Nhập Đường tròn Tâm O, bán kính R và Điểm M, Kiểm tra Vị trí điểm M");

			luachon = scanner.nextInt();
			scanner.nextLine();

			if (luachon == 1) {
				System.out.println("Nhập tọa độ điểm A");
				a = Point.input(a);
				System.out.print("A");
				Point.output(a);
				System.out.println();

				System.out.println("Nhập tọa độ điểm B");
				b = Point.input(b);
				System.out.print("B");
				Point.output(b);
				System.out.println();

				System.out.println("Nhập tọa độ điểm C");
				c = Point.input(c);
				System.out.print("C");
				Point.output(c);
				System.out.println();
				System.out.println("Xong");
			}

			if (luachon == 2) {
				LineSegment AB = new LineSegment(a, b);
				System.out.println("Chiều dài đọan AB =" + AB.length());

				LineSegment AC = new LineSegment(a, c);
				System.out.println("Chiều dài đoạn AC =" + AC.length());

				LineSegment BC = new LineSegment(b, c);
				System.out.println("Chiều dài đoạn BC =" + BC.length());
			}
			if (luachon == 3) {
				Triangle tamGiac = new Triangle(a, b, c);

				if (tamGiac.isValid() == true) {
					System.out.println("Diện tích tam giác là:" + tamGiac.areaCalculate());
					System.out.println("Chu vi tam giác là:" + tamGiac.perimeterCalculate());
				} else {
					System.out.println("Ba điểm vừa nhập không hợp thành tam giác");
				}
			}
			if (luachon == 4) {
				String Value;
				Point o = new Point();
				System.out.println("Nhập tọa độ tâm O");
				o = Point.input(o);
				System.out.print("O");
				Point.output(a);
				System.out.println();
				System.out.println("Nhập bán kính R");
				Float r = scanner.nextFloat();
				System.out.println("Bán kính R = " + r);

				Circle hinhTron = new Circle(o, r);

				if (r > 0) {
					Point m = new Point();
					System.out.println("Nhập toạ độ M");
					m = Point.input(m);
					LineSegment OM = new LineSegment(o, m);
					System.out.println("Khoảng cách OM = " + OM.length());
					Value = hinhTron.checkRelativePosition(m);
					System.out.print("Điểm M");
					Point.output(m);
					System.out.println(Value);
				}
			}
		} while (luachon != 0);

	}
}
