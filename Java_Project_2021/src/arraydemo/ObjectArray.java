package arraydemo;

public class ObjectArray {

	public static void main(String[] args) {
		//Object obj[] =new Object[5];
		
		Object obj[] = {10,20.5,"Welcome",'G',true};
		
		obj[0]=10;//integer
		obj[1]=20.5;//double
		obj[2]="Welcome";//string
		obj[3]='G';//char
		obj[4]=true;//boolean
		
		for(Object i : obj)
		{
			System.out.println(i);
		}
		

	}

}
