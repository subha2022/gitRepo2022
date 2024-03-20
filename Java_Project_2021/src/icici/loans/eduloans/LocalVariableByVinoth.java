package icici.loans.eduloans;

public class LocalVariableByVinoth
{
	public void sampleMethod()
	{
		int num1=120;
		System.out.println(num1);
	}

	public static void main(String[] args) 
	{
		LocalVariableByVinoth obj = new LocalVariableByVinoth();
		obj.sampleMethod();
		int num2=10;
		System.out.println(num2);

	}

}
