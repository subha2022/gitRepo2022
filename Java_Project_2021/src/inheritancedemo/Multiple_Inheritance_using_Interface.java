package inheritancedemo;

interface G
{
	int a =10;
	void display();
}

interface H
{
	int b =20;
	void show();
}

public class Multiple_Inheritance_using_Interface implements G,H
{
	public void display()
	{
		System.out.println(a);
	}

	public void show() 
	{
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		Multiple_Inheritance_using_Interface mi = new Multiple_Inheritance_using_Interface();
		mi.display();
		mi.show();

	}



}
