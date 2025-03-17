package myproject1;
//Find Area of Circle
import java.util.Scanner;
public class Areaofcircle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double pi = 3.14;
		System.out.println("Value of Radius");
		int radius = s.nextInt();
		double area = pi*radius*radius;
		System.out.println("Area of circle = " +area);
	}
}
