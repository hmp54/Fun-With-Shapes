import java.util.Vector; 
import java.lang.Exception;

public class FunWithShapes extends ShapeHandler {
	ShapeDescription d;
	String shapeType;  
	static double area = 0, perimeter = 0; 

	public static void main(String[] args) throws ShapeException{
		FunWithShapes funWithShapes = new FunWithShapes();
		System.out.println(funWithShapes.sumOverAreas()); 
		System.out.println(funWithShapes.sumOverPerimeters()); 
	} 

	public FunWithShapes() throws ShapeException{
		super(); 
	}

	@Override
	public void convertDescriptionsToShapes(){
		int n = super.shapeDescriptions.size();
		
		for(int i = 0; i < n; i++){
			d = super.shapeDescriptions.get(i); 
			shapeType = d.getShapeType().name(); 
			//System.out.println(d.getShapeType());//

			if(shapeType.equals("CIRCLE")){
				//System.out.println("Assigning CIRCLE to SHAPES."); //
				Circle newCircle = new Circle(d);
				shapes.add(newCircle);  

			} else if (shapeType.equals("SQUARE")){
				//System.out.println("Assigning SQUARE to SHAPES"); //
				shapes.add(new Square(d)); 
			} else if (shapeType.equals("RECTANGLE")){
				//System.out.println("Assigning RECTANGLE to SHAPES"); //
				shapes.add(new Rectangle(d)); 
			} else if (shapeType.equals("TRIANGLE")){
				//System.out.println("Assigning TRIANGLE to SHAPES"); //
				shapes.add(new Triangle(d)); 
			}
		}

	}

	@Override
	public double sumOverAreas(){
		int n = super.shapes.size(); 

		for(int i = 0; i < n ;i++){
			area += super.shapes.elementAt(i).getArea(); 
		}

		return area; 
	}


	public double sumOverPerimeters(){
		int n = super.shapes.size(); 

		for(int i = 0; i < n ;i++){
			perimeter += super.shapes.elementAt(i).getPerimeter(); 
		}

		return perimeter; 
	}
	//similar for areas, just with perimeter. 
}


/*
Process notes: 
1. Covert the text file of shapes to their respective shape objects. 
2. computer sum of the shape areas
3. compute sum of their perimeters. 
3. Output these two pieces of info. 
*/