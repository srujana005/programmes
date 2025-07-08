package arrayprogramms;

public class Variables 
{
	
	static int c=30;
	
	int b=20;
	
	
	public void m1()
	{
		System.out.println(c);
		System.out.println(b);
	System.out.println("hello");
		
	}
	
	
	
	public static void main  (String[] args)
	{
		// TODO Auto-generated method stub
		
		int a=10;//local variable
		
		//creation of object
		//classname  reference variable=new classname
		
	Variables v1=new Variables();
		v1.b=40;
	//static int c=40;
		System.out.println(v1.b);
		System.out.println();
		v1.m1();

	}

}
