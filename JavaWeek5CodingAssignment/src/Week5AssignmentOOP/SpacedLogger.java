package Week5AssignmentOOP;

public class SpacedLogger implements Logger{
	
	/*
	 * Step 3b. create a class named SpacedLogger that implements the Logger interface 
	 */

	@Override
	public void Log(String Log) {

    /*
     * Step 6. the SpacedLogger should add spaces between each character  of the
     * String arguments passed into its methods 
     * (I know this can also be done with a loop but wanted to try this method)
     */
     
	System.out.println(Log.replace("", " ").trim());
	  
	  
		
	}

	@Override
	public void Error(String Error) {
		
	/*
	 * Step 7: The error method should do the same, but with "ERROR: preceding the spaced out input
     */
		
		System.out.println("ERROR: " + Error.replace("", " ").trim());
	}
	

}
