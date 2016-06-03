package at.fhj.itm;
class Point2d {
	protected boolean debug;
	private double x;
	private double y;

	public Point2d (double px, double py)
	{ 
		this.x = px;
		this.y  = py;
	}

	public Point2d () 
	{		
		// just create a point of 0/0
	}

	public Point2d (Point2d pt) 
	{	
	}

	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	public void setDebug (boolean b) {
		this.debug = b;
	}

	public void setX(double px) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
	}

	public double getX() {
		return x;
	}

	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
	}

	public double getY() {
		return y;
	}

	public void setXY(double px, double py) {
		this.x = px;
		this.y = py;
	}

	/*
	 * Distanz zwischen zwei Punkten wird berechnet und als Double-Zahl zurückgegeben
	 */
	public double distanceFrom (Point2d pt) {
		double distanz;
		double xdistanz;
		double ydistanz;
		
		xdistanz = x-pt.x;
		ydistanz = y-pt.y;
		distanz = Math.sqrt((xdistanz * xdistanz)+(ydistanz * ydistanz));
		
		return distanz;
	}

	/*
	 * Distanz zwischen Ursprung und Punkt wird berechnet und als Double-Zahl zurückgegeben
	 */
	public double distanceFromOrigin () {
		double distanz;
		
		distanz = Math.sqrt((x*x)+(y*y));
		
		return distanz;
	}

	@Override
	public String toString() {
		return "Point2d [debug=" + debug + ", px=" + x + ", py=" + y + "]";
	}
}

