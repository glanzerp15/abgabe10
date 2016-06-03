package at.fhj.itm;
class PointTester {
	public static void main (String[] args) {
		Point2d  pt1 = new Point2d ();

		System.out.println ("pt1 = " + pt1);

		Point2d pt2 = new Point2d(4.0, 3.0);

		System.out.println ("pt2 = " + pt2);

		pt1.setDebug(true);	

		System.out.println ("Distance from " + pt1 + " to " + pt2 +
				" is " + pt1.distanceFrom(pt2));

		System.out.println ("Distance from " + pt2 + " to " + pt1 +
				" is " + pt2.distanceFrom(pt1));

		System.out.println ("Distance from " + pt1 + " to the origin (0, 0) is " +
				pt1.distanceFromOrigin());

		System.out.println ("Distance from " + pt2 + " to the origin (0, 0) is " +
				pt2.distanceFromOrigin());

		pt1.setXY(3, 5);
		System.out.println ("pt1 = " + pt1);

		pt2.setXY(-3, -5);
		System.out.println ("pt2 = " + pt2);

		System.out.println ("Distance from " + pt1 + " to " + pt2 +
				" is " + pt1.distanceFrom(pt2));

		System.out.println ("Distance from " + pt2 + " to " + pt1 +
				" is " + pt2.distanceFrom(pt1));

		pt1.setDebug(false); 

		System.out.println ("Distance from " + pt1 + " to the origin (0, 0) is " +
				pt1.distanceFromOrigin());

		System.out.println ("Distance from " + pt2 + " to the origin (0, 0) is " +
				pt2.distanceFromOrigin());
		
		//3D
		
		Point3d pt3 = new Point3d(3.0, 3.0, 3.0);
		Point3d pt4 = new Point3d(6.0, 6.0, 6.0);
		
		System.out.println ("Distance from " + pt3 + " to the origin (0, 0) is " +
				pt3.fromOrigin3d());
		
		System.out.println ("pt4 = " + pt4);

		pt3.setDebug(true);	

		
		System.out.println ("Distance from " + pt4 + " to the origin (0, 0) is " +
				pt4.fromOrigin3d());
		
		System.out.println ("Distance from " + pt3 + " to " + pt4 +
				" is " + pt3.distanzPunkte(pt4));
		
		pt4.setX(-6);
		pt4.setY(-6);
		pt4.setZ(-6);
		
		System.out.println ("Distance from " + pt4 + " to the origin (0, 0) is " +
				pt4.fromOrigin3d());
		
		System.out.println ("Distance from " + pt3 + " to " + pt4 +
				" is " + pt3.distanzPunkte(pt4));


	}
}

