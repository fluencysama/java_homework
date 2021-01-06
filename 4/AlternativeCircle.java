package package_homework_chapter9;
//ÀýÌâ2
public class AlternativeCircle {

	public static void main(String[] args) {

				// TODO Auto-generated method stub
				
		AlternativeCircle circle1 = new AlternativeCircle();
				System.out.println("Tje area of the circle of radius "
						+ circle1.radius + " is " + circle1.getArea());
				
				AlternativeCircle circle2 = new AlternativeCircle();
				System.out.println("Tje area of the circle of radius "
						+ circle2.radius + " is " + circle2.getArea());
				
				AlternativeCircle circle3 = new AlternativeCircle();
				System.out.println("Tje area of the circle of radius "
						+ circle3.radius + " is " + circle3.getArea());
				
				circle2.radius = 100;
				System.out.println("The area of the circle of the radius "
						+ circle2.radius + " is " + circle2.getArea());
			}
			
			double radius;
			
			AlternativeCircle(){
				radius = 2;
			}
			
			AlternativeCircle(double newRadius){
				radius = newRadius;
			}
			
			double getArea() {
				return radius*radius*Math.PI;
			}
			
			double getPrimeter() {
				return 2*radius*Math.PI;
			}
			
			void setRadius(double newRadius) {
				radius = newRadius;
			}

}
