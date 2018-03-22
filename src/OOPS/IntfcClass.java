package OOPS;

public class IntfcClass implements InterfaceOne,InterfaceTwo
{
	
	public static void main(String[] args) 
	{
		IntfcClass ref = new IntfcClass();
		ref.intfcmethod();
		ref.intfcOnemethod();
		
		
	}
	
	@Override
	public void intfcmethod() 
	{
		System.out.println("This is InterfaceOne");
		
	}
	@Override
	public void intfcOnemethod() 
	{
		System.out.println("This is InterfaceTwo");
		
	}
	
	}
