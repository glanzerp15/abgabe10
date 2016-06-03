package at.fhj.itm;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Point2dTest {

	private Point2d p2d;
	
	@Before
	public void setUp(){
		p2d = new Point2d();
	}

	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	@Test
	public void testSetX(){
		p2d.setX(10);
		assertEquals(10, p2d.getX(), 0.0001);
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		p2d.setY(10);
		assertEquals(10, p2d.getY(), 0.0001);
		
	}
	

	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){
		p2d.setX(5);
		p2d.setY(4);
		
		Point2d p2dtest = new Point2d(5, 4);
		
		assertEquals(0, p2d.distanceFrom(p2dtest), 0.00001);

	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin(){	
		p2d.setX(4);
		p2d.setY(3);
		
		assertEquals(5, p2d.distanceFromOrigin(), 0.0001);
	}
}
