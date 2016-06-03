package at.fhj.itm;

/**
 * 
 * @author Philipp Glanzer
 * Creates a 2d point 
 *
 */
class Point2d {
	protected boolean debug;
	private double x;
	private double y;

	/**
	 * Constructor.
	 * initalize a point with px and py
	 * @param px x coordinate of the point
	 * @param py y coordinate of the point
	 */
	public Point2d (double px, double py)
	{ 
		this.x = px;
		this.y  = py;
	}

	/**
	 * Constructor.
	 * initalize a point with 0/0s
	 */
	public Point2d () 
	{		
		this.x = 0;
		this.y = 0;
	}

	/**
	 * Constructor.
	 * initalize point with
	 * @param pt x coordinate and y coordinate
	 */
	public Point2d (Point2d pt) 
	{	
		this.x = pt.x;
		this.y = pt.y;
	}

	/**
	 * Prints debug: s
	 * if debug is true
	 * @param s String 
	 */
	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	/**
	 * Turn debuging on/off
	 * @param b
	 */
	public void setDebug (boolean b) {
		this.debug = b;
	}

	/**
	 * Set x coordinate
	 * @param px coordinate of point
	 */
	public void setX(double px) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		this.x = px;
	}

	/**
	 * returns x-coordinate
	 * @return x-coordinate of point
	 */
	public double getX() {
		return x;
	}

	/**
	 * Sets y-coordinate
	 * @param py of point
	 */
	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		this.y = py;
	}

	/**
	 * returns y-coordinate
	 * @return y-coordinate of point
	 */
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

