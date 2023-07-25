package exceptionHandling;

public class CheckedExceptionDemo {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Program is Started");
		System.out.println("Program is in Progress");
		/*
		try 
		{
			Thread.sleep(3000); //Checked Exception
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}*/
		
		Thread.sleep(3000);
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}

}
