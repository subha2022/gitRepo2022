package exceptionHandling;

public class Try_Catch_Finally {

	public static void main(String[] args)
	{
		int arr[] =new int[5];
		
		//1. Exception occurs, catch block handles, finally block also execute
		/*try
		{
		arr[7]=145;
		} 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This is finally block");
		}*/
	
		//2. Exception occurs, catch block not handles, finally block execute
		/*try
		{
		arr[7]=145;
		}catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This is finally block ");
		}*/
		
		//3. Exception not occurs, catch block will ignore, finally block executed
		try
		{
		arr[4]=145;
		}catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This is finally block ");
		}
		
	
	}

}
