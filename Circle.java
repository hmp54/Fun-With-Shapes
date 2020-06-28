import java.lang.Math; 
import java.util.Vector;

public class Circle extends Shape{

	Vector<Double> radius = new Vector<Double>(1); 
	int n; 
	double r;
	double area = 0, perimeter = 0;	

	Circle(ShapeDescription description){
		super(description); 
		radius = description.getDoubles(); 
		r = radius.get(0); 
	}

	@Override
	public double getArea(){
		area = Math.PI * (r * r);
		return area; 
	}
	
	@Override
	public double getPerimeter(){
		perimeter = 2 * Math.PI * r; 
		return perimeter; 
	}
}