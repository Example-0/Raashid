package Assignment;
import java.util.Scanner;

class FindeAreaOfTriangle {
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the width of the Triangle:");
		double base = scanner.nextDouble();
		
		System.out.println("Enter height of the Triangle:");
		double heigh = scanner.nextDouble();
		
		//Area = (width*height)/2
		double area = (base* heigh)/2;
		System.out.println("Area of Triangle is: " + area);
		
		
	}
}
