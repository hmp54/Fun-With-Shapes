import java.lang.Math; 
import java.util.Vector; 

public class Triangle extends Shape{
	
	Vector<Double> sideLengths = new Vector<Double>(3);  
	double a, b, c; 
	double area = 0, perimeter = 0;


	Triangle(ShapeDescription description){
		super(description); 
		sideLengths = description.getDoubles(); 
		a = sideLengths.get(0);
		b = sideLengths.get(1); 
		c = sideLengths.get(2); 
	}

	@Override
	public double getArea(){
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
		return area;  
	}

	@Override
	public double getPerimeter(){
		perimeter = a + b + c; 
		return perimeter;
	}
}