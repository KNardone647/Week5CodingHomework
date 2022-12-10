package Week5AssignmentOOP;

public class App {

	
	public static void main(String[] args) {
		/*
		 * Step 9. Create a class named App that has a main method
		 */
		
		/*
		 * Step 10.
		 * instantiate an instance of each of your logger classes that implement 
		 * the Logger interface below
		 */
		Logger logger1 = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		
		/*
		 * test both methods on both instances , passing in Strings of your choice
		 */
		 
		 
		
	    logger1.Log("Hello");
		logger1.Error("THERE");
		
		logger2.Log("Hello");
		logger2.Error("THERE");
		
		

	}
	

}
