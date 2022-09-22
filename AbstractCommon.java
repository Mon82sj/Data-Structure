import java.util.*;
abstract class Shape{
	int a,b;
	abstract void printArea(int a,int b);
}
class Rectangle extends Shape{
	void printArea(int a,int b) {
		int area=a*b;
		System.out.println("Area of rectangle : "+area+"\n\n");
	}	
}
class Triangle extends Shape{
	void printArea(int a,int b) {
		double area=0.5*(double)a*(double)b;
		System.out.println("Area of triangle : "+(float)area+"\n\n");
	}
}
class Circle extends Shape{
		void printArea(int a,int b) {
			double area=3.14*a*a;
			System.out.println("Area of circle : "+(float)area+"\n\n");
		}
}
public class AbstractCommon {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			while(true) {
				System.out.print("1.Rectangle\n2.Triangle\n3.Circle\n4.Exit\nEnter your choice : ");
				int choice =sc.nextInt();
				switch(choice) {
				case 1: Rectangle r=new Rectangle();
						System.out.println("Enter the dimensions of rectangle : ");
						int a=sc.nextInt();
						int b=sc.nextInt();
						r.printArea(a,b);
						break;
				case 2: Triangle t=new Triangle();
						System.out.println("Enter the base and height of triangle : ");
						int d=sc.nextInt();
						int e=sc.nextInt();
						t.printArea(d,e);
						break;
				case 3: Circle c=new Circle();
						System.out.println("Enter the radius of a circle : ");
						int f=sc.nextInt();
						c.printArea(f,1);
						break;
				case 4: System.exit(choice);
				default: System.out.println("Enter a valid choice...\n\n");
				}
			}
		}
}
