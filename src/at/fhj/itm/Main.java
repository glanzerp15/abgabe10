package at.fhj.itm;


public class Main {

	public static void main(String[] args) {
		
		if(args.length != getMinArguments()){
			System.out.println(getUsage());
			return;
		}
		
		String op = args[0].trim().toLowerCase();

		int numA = Integer.parseInt(args[1]);
		int numB = Integer.parseInt(args[2]);
		int numC = Integer.parseInt(args[3]);
		int numD = Integer.parseInt(args[4]);
		
		Point2d pd1 = new Point2d();
		Point2d pd2 = new Point2d();
		pd1.setX(numA);
		pd2.setX(numB);
		pd1.setY(numC);
		pd2.setY(numD);

		
		try
		{
			double result = pd1.distanceFrom(pd2);
			System.out.println(result);
		}
		catch(Exception ex)
		{
			System.out.print("Invalid math operation: " + ex.getMessage());
		}
	}
	
	public static int getMinArguments() {
		return 5;
	}

	public static String getUsage() {
		return "usage <operation> <integer> <integer>\n\t operations: (distance)";
	}
}
