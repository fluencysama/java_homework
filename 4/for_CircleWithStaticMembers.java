package package_homework_chapter9;

public class for_CircleWithStaticMembers {

	double radius;
	
	static int numberOfObjects = 0;
	
	for_CircleWithStaticMembers(){
		radius =1 ;
		numberOfObjects++;
	}
	
	for_CircleWithStaticMembers(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObject() {
		return numberOfObjects;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
}
