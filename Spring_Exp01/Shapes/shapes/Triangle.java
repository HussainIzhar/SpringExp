package shapes;

public class Triangle implements Shape{
	
	private String type;
	private int sides;
	private Point PointA;
	private Point PointB;
	
	
	


	public Triangle() {
		super();
	}

	public Triangle(String type, int sides, Point pointA, Point pointB) {
		super();
		this.type = type;
		this.sides = sides;
		PointA = pointA;
		PointB = pointB;
	}

	public Point getPointA() {
		return PointA;
	}

	public void setPointA(Point pointA) {
		PointA = pointA;
	}

	public Point getPointB() {
		return PointB;
	}

	public void setPointB(Point pointB) {
		PointB = pointB;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw(){
		System.out.println("Triangle drawn");
	}

	@Override
	public String toString() {
		return ("Triangle [PointA= (" + PointA.getX()+" ," +PointA.getY()+")]"
				+"[PointB= (" + PointB.getX()+" ," +PointB.getY()+")]");
	}

	
}
