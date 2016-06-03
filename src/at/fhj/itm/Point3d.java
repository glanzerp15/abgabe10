package at.fhj.itm;

public class Point3d extends Point2d{
	

	private double x;
	private double y;
	private double z;

	public Point3d() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point3d(double px, double py, double pz) {
		super(px, py);
		this.x = px;
		this.y = py;
		this.z = pz;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	/*
	 * Distanz zwischen Ursprung und 3D Punkt wird berechnet und als Double-Zahl zurückgegeben
	 */
	
	public double fromOrigin3d()
	{
		double distanz;
		distanz = Math.sqrt((x*x)+(y*y)+(z*z));
		return distanz;
	}
	
	/*
	 * Distanz zwischen zwei 3D Punkten wird berechnet und als Double-Zahl zurückgegeben
	 */
	public double distanzPunkte(Point3d pt3)
	{
		double distanz;
		double xdistanz;
		double ydistanz;
		double zdistanz;
		
		xdistanz = (x-pt3.x);
		ydistanz = (y-pt3.y);
		zdistanz = (z-pt3.z);
		
		distanz = Math.sqrt((xdistanz*xdistanz) +(ydistanz*ydistanz) + (zdistanz*zdistanz));
		
		return distanz;
	}

	@Override
	public String toString() {
		return "Point3d [x=" + x + ", y=" + y + ", z=" + z + ", debug=" + debug + "]";
	}


	
	
	
}
