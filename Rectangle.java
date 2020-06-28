import java.lang.Math; 
import java.util.Vector;

public class Rectangle extends Shape{
	Vector<Double> sideLengths = new Vector<Double>(2); 
	double a,b; 
	double area = 0, perimeter = 0; 

	Rectangle(ShapeDescription description){
		super(description); 
		sideLengths = description.getDoubles(); 
		a = sideLengths.get(0);
		b = sideLengths.get(1); 
	}

	@Override
	public double getArea(){
		area = a * b; 
		return area; 
	}

	@Override public double getPerimeter(){
		perimeter = (2*a) + (2*b); 
		return perimeter; 
	}

}