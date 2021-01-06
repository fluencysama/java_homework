package package_homework_chapter9;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for_CircleWithPrivateDataFields myCircle = new for_CircleWithPrivateDataFields (5.0);
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("The area of the circle of radius"
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is "
				+ for_CircleWithPrivateDataFields.getNumberOfObjects());
	}

}
