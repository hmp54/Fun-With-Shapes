import java.lang.Math; 
import java.util.Vector; 

public class Square extends Shape{
	
	Vector<Double> sideLengths = new Vector<Double>(1); 
	double a; 
	double area = 0, perimeter = 0;

	Square(ShapeDescription description){
		super(description);
		sideLengths = description.getDoubles(); 
		a = sideLengths.get(0);
	}

	@Override
	public double getArea(){
		area = a * a; 
		return area;
	}
	
	@Override
	public double getPerimeter(){
		perimeter = 4 * a; 
		return perimeter;
	}
}