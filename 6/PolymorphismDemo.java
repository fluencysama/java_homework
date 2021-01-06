package package_examples_chapter11;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayObject(new CircleFromSimpleGeometryicObject
				(1,"red",false));
		displayObject(new RectangleFromSimpleGeometryicObject
				(1,"blue",false));
	}

	pubulic static void displayObject(SimpleGeomeyricObject object) {
		System.out.println("Created on "+ object.getDateCreated() +
				". Color is " + object.getcolor());
	}
}
