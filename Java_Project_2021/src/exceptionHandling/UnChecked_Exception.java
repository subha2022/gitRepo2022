package exceptionHandling;

public class UnChecked_Exception 
{

	public static void main(String[] args) 
	{
		int a=20;
		//System.out.println(a/0); //Arithmetic Exception

		String s = null;
		//System.out.println(s.length()); //Null pointer Exception

		String st = "abcd";
		int i = Integer.parseInt(st);
		//System.out.println(i); //Number format Exception

		int arr[] = new int[5];
		arr[7]=145; //Array Index Out of Boundary Exception

	}

}
