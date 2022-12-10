package Week5AssignmentOOP;

public class AsteriskLogger implements Logger{
	
	/*
	 * Step 3a. create a class that implements the Logger interface named AsteriskLogger 
	 */

	@Override
	public void Log(String Log) {
		
	/*
	 * Step 4. - the log method on AsteriskLogger should print out the String 
	 * it receives between 3 asterisks on either side of the String 
	 */
		 System.out.println("***" + Log + "***");
		
	}

	@Override
	public void Error(String Error) {
		
	/*
	 * Step 5. - the error method on the AsteriskLogger should print the String
	 * it receives inside a box of asterisks with the String precedes by the word "ERROR
	 */
	
		System.out.println("**********************");
		System.out.println("***ERROR: " + Error + "***");
		System.out.println("**********************");
		
	}
	


}
