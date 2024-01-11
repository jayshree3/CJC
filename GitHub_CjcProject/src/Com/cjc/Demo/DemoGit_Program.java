package Com.cjc.Demo;

public class DemoGit_Program 
{
	public int m1(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method Start");
		
		 DemoGit_Program de=new  DemoGit_Program ();
		 int c=de.m1(10,20);
		 System.out.println(c);
	}

}
